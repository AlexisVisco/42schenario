package fr.aviscogl.instructions.impl;

import fr.aviscogl.Driver;
import fr.aviscogl.VirtualFile;
import fr.aviscogl.instructions.VariableReplacer;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface Instruction {

    List<Instruction> instructions = new ArrayList<>();

    void execution(Options funOpts);
    Pattern pattern();

    static Options executeInstruction(VirtualFile vf, Driver driver, String line) {
        Options options = new Options(line, driver, vf);

        new VariableReplacer().execution(options);
        for (Instruction instruction : instructions) {
            Pattern pattern = instruction.pattern();
            Matcher matcher = null;
            if (pattern != null) matcher = pattern.matcher(options.line);
            if (pattern == null || matcher.find()) {
                System.out.printf("Executing instruction %s\n", instruction.getClass().getSimpleName());
                options.args = matcher;
                instruction.execution(options);
                return options;
            }
        }
        return options;
    }

    static void registerInstruction(Instruction instruction) {
        instructions.add(instruction);
    }
}

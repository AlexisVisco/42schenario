package fr.aviscogl.instructions;

import fr.aviscogl.instructions.impl.Instruction;
import fr.aviscogl.instructions.impl.Options;

import java.io.IOException;
import java.util.regex.Pattern;

public class Import implements Instruction {
    @Override
    public void execution(Options funOpts) {
        try {
            funOpts.vf.insertFileAt(funOpts.args.group(1));
            System.out.printf("Import file %s\n", funOpts.args.group(1));
            funOpts.canExecuteLine = false;
        } catch (IOException e) {
            e.printStackTrace();
            System.err.printf("42Schenario > Impossible to import %s !\n", funOpts.args.group(1));
        }
    }

    @Override
    public Pattern pattern() {
        return Pattern.compile("^>> import (.*)$");
    }
}

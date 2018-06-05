package fr.aviscogl.instructions;

import fr.aviscogl.instructions.impl.Instruction;
import fr.aviscogl.instructions.impl.Options;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class VariableCreator implements Instruction {

    public static Map<String, String> variables = new HashMap<>();

    @Override
    public void execution(Options funOpts) {
        variables.put(funOpts.args.group(1), funOpts.args.group(2));
        funOpts.canExecuteLine = false;
        System.out.println("Created variable " +  funOpts.args.group(1)  + " = "  + funOpts.args.group(2));
    }

    @Override
    public Pattern pattern() {
        return Pattern.compile("^>> (.+) = (.+)$");
    }
}

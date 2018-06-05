package fr.aviscogl.instructions;

import fr.aviscogl.instructions.impl.Instruction;
import fr.aviscogl.instructions.impl.Options;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Print implements Instruction {

    @Override
    public void execution(Options funOpts) {
        System.out.println(funOpts.args.group(1));
        funOpts.canExecuteLine = false;
    }

    @Override
    public Pattern pattern() {
        return Pattern.compile("^>> print (.+)$");
    }
}

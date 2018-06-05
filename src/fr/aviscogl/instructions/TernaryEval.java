package fr.aviscogl.instructions;

import fr.aviscogl.instructions.impl.Instruction;
import fr.aviscogl.instructions.impl.Options;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class TernaryEval implements Instruction {

    @Override
    public void execution(Options funOpts) {
        int expr = funOpts.args.group(1).equals(funOpts.args.group(2)) ? 3 : 4;
        if (funOpts.args.group(expr).equals("_")) funOpts.canExecuteLine = false;
        funOpts.vf.add(funOpts.args.group(expr));
        funOpts.canExecuteLine = false;
    }

    @Override
    public Pattern pattern() {
        return Pattern.compile("^>> (.+) == (.+) \\? (.+) : (.+)$");
    }
}

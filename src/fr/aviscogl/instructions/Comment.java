package fr.aviscogl.instructions;

import fr.aviscogl.instructions.impl.Instruction;
import fr.aviscogl.instructions.impl.Options;

import java.util.regex.Pattern;

public class Comment implements Instruction{

    @Override
    public void execution(Options funOpts) {
        funOpts.canExecuteLine = false;
    }

    @Override
    public Pattern pattern() {
        return Pattern.compile("^#.*");
    }
}

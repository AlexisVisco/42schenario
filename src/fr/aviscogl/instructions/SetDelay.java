package fr.aviscogl.instructions;

import fr.aviscogl.instructions.impl.Instruction;
import fr.aviscogl.instructions.impl.Options;

import java.util.regex.Pattern;

public class SetDelay implements Instruction {
    @Override
    public void execution(Options funOpts) {
        funOpts.driver.setDelay(Integer.parseInt(funOpts.args.group(1)));
        funOpts.canExecuteLine = false;
    }

    @Override
    public Pattern pattern() {
        return Pattern.compile("^>> setDelay (\\d+)");
    }
}

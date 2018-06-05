package fr.aviscogl.instructions;

import fr.aviscogl.instructions.impl.Instruction;
import fr.aviscogl.instructions.impl.Options;

import java.util.regex.Pattern;

public class Wait implements Instruction {
    @Override
    public void execution(Options funOpts) {
        try {
            Thread.sleep(Integer.parseInt(funOpts.args.group(1)));
            funOpts.canExecuteLine = false;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Pattern pattern() {
        return Pattern.compile("^>> wait (\\d+)$");
    }
}

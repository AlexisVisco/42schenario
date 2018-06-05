package fr.aviscogl.instructions;

import fr.aviscogl.instructions.impl.Instruction;
import fr.aviscogl.instructions.impl.Options;

import java.util.regex.Pattern;

public class EnterOrNot implements Instruction {

    @Override
    public void execution(Options funOpts) {
        funOpts.driver.type(funOpts.line.substring(0, funOpts.line.length() - 1));
        funOpts.canExecuteLine = false;
    }

    @Override
    public Pattern pattern() {
        return Pattern.compile("(.*)%$");
    }
}

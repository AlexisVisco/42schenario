package fr.aviscogl.instructions;

import fr.aviscogl.instructions.impl.Instruction;
import fr.aviscogl.instructions.impl.Options;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Keys implements Instruction {

    @Override
    public void execution(Options funOpts) {
        funOpts.driver.pressComboKey(Arrays.asList(funOpts.args.group(1).split(",(:? ?)+")));
        funOpts.canExecuteLine = false;
    }

    @Override
    public Pattern pattern() {
        return Pattern.compile("^>> keys (.+)$");
    }
}

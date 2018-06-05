package fr.aviscogl.instructions;

import fr.aviscogl.instructions.impl.Instruction;
import fr.aviscogl.instructions.impl.Options;

import java.util.Arrays;
import java.util.regex.Pattern;

public class KeysRepeat implements Instruction {
    @Override
    public void execution(Options funOpts) {
        for (int i = 0; i < Integer.parseInt(funOpts.args.group(1)); i++) {
            funOpts.driver.pressComboKey(Arrays.asList(funOpts.args.group(2).split(",(:? ?)+")));
        }
        funOpts.canExecuteLine = false;
    }

    @Override
    public Pattern pattern() {
        return Pattern.compile("^>> repeat (\\d+) (.+)$");
    }
}

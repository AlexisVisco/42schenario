package fr.aviscogl.functions;

import fr.aviscogl.functions.impl.Fun;
import fr.aviscogl.functions.impl.FunOptions;

import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Pattern;

public class KeysRepeat implements Fun {
    @Override
    public void execution(FunOptions funOpts) {
        for (int i = 0; i < Integer.parseInt(funOpts.args.group(1)); i++) {
            funOpts.driver.pressComboKey(Arrays.asList(funOpts.args.group(2).split(",(:? ?)+")));
        }
        funOpts.canExecuteLine = false;
    }

    @Override
    public Pattern pattern() {
        return Pattern.compile("^>> repeat (\\d+) (.+)$".replaceAll(" ", "\\w*"));
    }
}

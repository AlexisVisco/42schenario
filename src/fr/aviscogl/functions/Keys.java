package fr.aviscogl.functions;

import fr.aviscogl.functions.impl.Fun;
import fr.aviscogl.functions.impl.FunOptions;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Keys implements Fun {

    @Override
    public void execution(FunOptions funOpts) {
        funOpts.driver.pressComboKey(Arrays.asList(funOpts.args.group(1).split(",(:? ?)+")));
        funOpts.canExecuteLine = false;
    }

    @Override
    public Pattern pattern() {
        return Pattern.compile("^>> keys (.+)$".replaceAll(" ", "\\w*"));
    }
}

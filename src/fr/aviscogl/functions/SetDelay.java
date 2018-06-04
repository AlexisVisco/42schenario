package fr.aviscogl.functions;

import fr.aviscogl.functions.impl.Fun;
import fr.aviscogl.functions.impl.FunOptions;

import java.util.regex.Pattern;

public class SetDelay implements Fun {
    @Override
    public void execution(FunOptions funOpts) {
        funOpts.driver.setDelay(Integer.parseInt(funOpts.args.group(1)));
        funOpts.canExecuteLine = false;
    }

    @Override
    public Pattern pattern() {
        return Pattern.compile("^>> setDelay (\\d+)".replaceAll(" ", "\\w*"));
    }
}

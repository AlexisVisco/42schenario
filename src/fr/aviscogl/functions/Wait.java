package fr.aviscogl.functions;

import fr.aviscogl.functions.impl.Fun;
import fr.aviscogl.functions.impl.FunOptions;

import java.util.regex.Pattern;

public class Wait implements Fun {
    @Override
    public void execution(FunOptions funOpts) {
        funOpts.driver.delay(Integer.parseInt(funOpts.args.group(1)));
        funOpts.canExecuteLine = false;
    }

    @Override
    public Pattern pattern() {
        return Pattern.compile("^>> wait (\\d+)$".replaceAll(" ", "\\w*"));
    }
}

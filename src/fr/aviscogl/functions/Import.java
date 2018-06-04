package fr.aviscogl.functions;

import fr.aviscogl.functions.impl.Fun;
import fr.aviscogl.functions.impl.FunOptions;

import java.util.regex.Pattern;

public class Import implements Fun {
    @Override
    public void execution(FunOptions funOpts) {

    }

    @Override
    public Pattern pattern() {
        return Pattern.compile(">> import (.*)".replaceAll(" ", "\\w*"));
    }
}

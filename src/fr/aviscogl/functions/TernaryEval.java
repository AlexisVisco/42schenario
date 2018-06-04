package fr.aviscogl.functions;

import fr.aviscogl.functions.impl.Fun;
import fr.aviscogl.functions.impl.FunOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class TernaryEval implements Fun {

    static Map<String, String> variables = new HashMap<>();

    @Override
    public void execution(FunOptions funOpts) {
        int expr = funOpts.args.group(1).equals(funOpts.args.group(2)) ? 3 : 4;
        if (funOpts.args.group(expr).equals("_")) funOpts.canExecuteLine = false;
        else funOpts.line = funOpts.args.group(expr);
    }

    @Override
    public Pattern pattern() {

        return Pattern.compile("^>> (.+) == (.+) \\? (.*) : (.*)$".replaceAll(" ", "\\w*"));
    }
}

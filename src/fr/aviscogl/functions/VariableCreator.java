package fr.aviscogl.functions;

import fr.aviscogl.functions.impl.Fun;
import fr.aviscogl.functions.impl.FunOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class VariableCreator implements Fun {

    static Map<String, String> variables = new HashMap<>();

    @Override
    public void execution(FunOptions funOpts) {
        variables.put(funOpts.args.group(1), funOpts.args.group(2));
        funOpts.canExecuteLine = false;
    }

    @Override
    public Pattern pattern() {
        return Pattern.compile("^>> set ([A-Za-z0-9_]) = (.+)$".replaceAll(" ", "\\w*"));
    }
}

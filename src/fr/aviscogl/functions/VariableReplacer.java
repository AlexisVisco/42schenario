package fr.aviscogl.functions;

import fr.aviscogl.functions.impl.Fun;
import fr.aviscogl.functions.impl.FunOptions;

import java.util.Map;
import java.util.regex.Pattern;

public class VariableReplacer implements Fun {

    @Override
    public void execution(FunOptions funOpts) {
        for (Map.Entry<String, String> entry : VariableCreator.variables.entrySet()) {
            funOpts.line = funOpts.line.replaceAll(Pattern.quote("{" + entry.getKey() + "}"), entry.getValue());
        }
    }

    @Override
    public Pattern pattern() {
        return null;
    }
}

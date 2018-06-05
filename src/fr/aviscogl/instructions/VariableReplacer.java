package fr.aviscogl.instructions;

import fr.aviscogl.instructions.impl.Instruction;
import fr.aviscogl.instructions.impl.Options;

import java.util.Map;
import java.util.regex.Pattern;

public class VariableReplacer implements Instruction {

    @Override
    public void execution(Options funOpts) {
        for (Map.Entry<String, String> entry : VariableCreator.variables.entrySet()) {
            funOpts.line = funOpts.line.replaceAll(Pattern.quote("{" + entry.getKey() + "}"), entry.getValue());
        }
    }

    @Override
    public Pattern pattern() {
        return null;
    }
}

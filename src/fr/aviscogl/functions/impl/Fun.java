package fr.aviscogl.functions.impl;

import java.util.regex.Pattern;

public interface Fun {

    void execution(FunOptions funOpts);
    Pattern pattern();

}

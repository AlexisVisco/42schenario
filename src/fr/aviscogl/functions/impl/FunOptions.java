package fr.aviscogl.functions.impl;

import fr.aviscogl.Driver;
import fr.aviscogl.VirtualFile;

import java.util.regex.Matcher;

public class FunOptions {

    public boolean canExecuteLine = true;

    public Driver driver;
    public String line;
    public Matcher args;
    public VirtualFile vf;
}

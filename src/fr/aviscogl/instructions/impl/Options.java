package fr.aviscogl.instructions.impl;

import fr.aviscogl.Driver;
import fr.aviscogl.VirtualFile;

import java.util.regex.Matcher;

public class Options {

    public boolean canExecuteLine = true;
    public Matcher args;

    public String line;
    public Driver driver;
    public VirtualFile vf;

    public Options(String line, Driver driver, VirtualFile vf) {
        this.line = line;
        this.driver = driver;
        this.vf = vf;
    }

    @Override
    public String toString() {
        return "Options{" +
                "canExecuteLine=" + canExecuteLine +
                ", args=" + args +
                ", line='" + line + '\'' +
                ", driver=" + driver +
                ", vf=" + vf +
                '}';
    }
}

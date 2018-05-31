package fr.aviscogl;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Arrays;

public class Schenario {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("42Schenario > Need a text scenario.");
            return;
        }
        else if (!new File(args[0]).exists()) {
            System.err.printf("42Schenario > File %s does not exist.\n", args[0]);
            return;
        }
        System.out.println("42Schenario > Start in 5 seconds");
        try {
            Thread.sleep(5 * 1000);
            Scenario.execute(args[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


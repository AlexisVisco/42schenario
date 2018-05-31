package fr.aviscogl;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Shenar {
    public static void main(String[] args) {
        System.out.println("Start in 5 seconds");
        try {
            Thread.sleep(5 * 1000);
            Scenario.execute("./scenario/correction.sc");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


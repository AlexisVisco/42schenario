package fr.aviscogl;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(args));
//        if (args.length == 0) {
//            System.err.println("42Schenario > Need a text scenario.");
//            return;
//        }
//        System.out.println("42Schenario > Start in 5 seconds");
//        try {
//            Thread.sleep(5 * 1000);
//            for (String arg : args) {
//                if (!new File(arg).exists()) {
//                    System.err.printf("42Schenario > file %s does not exist\n", arg);
//                    continue;
//                }
//                System.out.printf("\n42Schenario > Executing %s !", arg);
//                Scenario.execute(arg);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        List<String> strings = Arrays.asList("123", "456", "789");
        List<String> s = Arrays.asList("ABC", "DEF", "GHI");
        strings.addAll(0, s);
        System.out.println(strings);

    }
}


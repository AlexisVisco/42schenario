package fr.aviscogl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Scenario {

    static void execute(String file) throws Exception {
        Driver d = new Driver();

        File exec = new File(file);

        BufferedReader br = new BufferedReader(new FileReader(exec));

        String st;

        d.click();
        while ((st = br.readLine()) != null) {
            if (st.startsWith("#")) continue;
            if (st.equals("\n")) d.delay(1);
            if (setDemo(st)) {
                d.setDemo(true);
                continue;
            }

            Optional<Long> time = getWaitingTime(st);
            Optional<List<String>> comboKey = getComboKey(st);
            Optional<Pair<String, Integer>> repeater = getRepeatKey(st);
            Optional<Integer> delay = setDelay(st);

            if (time.isPresent())
                Thread.sleep(time.get());
            else if (comboKey.isPresent())
                d.pressComboKey(comboKey.get());
            else if (delay.isPresent())
                d.setDelay(delay.get());
            else if (repeater.isPresent()) {
                for (Integer i = 0; i < repeater.get().u; i++) {
                    d.pressComboKey(Collections.singletonList(repeater.get().t));
                }
            }
            else if (st.endsWith("%")) {
                d.type(st.substring(0, st.length() - 1));
            }
            else {
                d.type(st);
                d.enter();
            }
        }
    }

    private static Optional<Long> getWaitingTime(String s) {
        Pattern pattern = Pattern.compile("^>> wait (\\d+)$");
        Matcher matcher = pattern.matcher(s);
        if (matcher.find())
            return Optional.of(Long.parseLong(matcher.group(1)));
        return Optional.empty();
    }

    private static Optional<List<String>> getComboKey(String s) {
        Pattern pattern = Pattern.compile("^>> keys (.+)$");
        Matcher matcher = pattern.matcher(s);
        if (matcher.find())
            return Optional.of(Arrays.asList(matcher.group(1).split(",(:? ?)+")));
        return Optional.empty();
    }

    private static Optional<Pair<String, Integer>> getRepeatKey(String s) {
        Pattern pattern = Pattern.compile("^>> repeat (\\d+) (.+)$");
        Matcher matcher = pattern.matcher(s);
        if (matcher.find())
            return Optional.of(new Pair<>(matcher.group(2), Integer.valueOf(matcher.group(1))));
        return Optional.empty();
    }

    private static boolean setDemo(String s) {
        Pattern pattern = Pattern.compile("^>> setDemo$");
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }

    private static Optional<Integer> setDelay(String s) {
        Pattern pattern = Pattern.compile("^>> setDelay (\\d+)");
        Matcher matcher = pattern.matcher(s);
        if (matcher.find())
            return Optional.of(Integer.parseInt(matcher.group(1)));
        return Optional.empty();
    }


    private static class Pair<T, U> {
        public T t;
        public U u;

        public Pair(T t, U u) {
            this.t = t;
            this.u = u;
        }
    }
}
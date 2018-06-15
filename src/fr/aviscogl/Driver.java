package fr.aviscogl;

import java.awt.*;
import java.awt.event.InputEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import static java.awt.event.KeyEvent.*;

public class Driver {

    private Robot robot;
    private int delayEnter = 1000;

    public Driver() throws AWTException {
        this.robot = new Robot();
        robot.setAutoDelay(5);
    }

    public Driver(Robot robot) {
        this.robot = robot;
    }

    public void type(CharSequence characters) {
        int length = characters.length();
        for (int i = 0; i < length; i++) {
            char character = characters.charAt(i);
            doType(type(character));
        }
    }

    public void click() {
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
    }

    public void enter() {
        doType(VK_ENTER);
        try {
            Thread.sleep(delayEnter);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setDelay(int delay) {
        robot.setAutoDelay(delay);
    }

    public void delay(int timeInSeconds) {
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(timeInSeconds));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int[] type(char character) {
        switch (character) {
            case 'a':
                return new int[]{VK_A};
            case 'b':
                return new int[]{VK_B};
            case 'c':
                return new int[]{VK_C};
            case 'd':
                return new int[]{VK_D};
            case 'e':
                return new int[]{VK_E};
            case 'f':
                return new int[]{VK_F};
            case 'g':
                return new int[]{VK_G};
            case 'h':
                return new int[]{VK_H};
            case 'i':
                return new int[]{VK_I};
            case 'j':
                return new int[]{VK_J};
            case 'k':
                return new int[]{VK_K};
            case 'l':
                return new int[]{VK_L};
            case 'm':
                return new int[]{VK_M};
            case 'n':
                return new int[]{VK_N};
            case 'o':
                return new int[]{VK_O};
            case 'p':
                return new int[]{VK_P};
            case 'q':
                return new int[]{VK_Q};
            case 'r':
                return new int[]{VK_R};
            case 's':
                return new int[]{VK_S};
            case 't':
                return new int[]{VK_T};
            case 'u':
                return new int[]{VK_U};
            case 'v':
                return new int[]{VK_V};
            case 'w':
                return new int[]{VK_W};
            case 'x':
                return new int[]{VK_X};
            case 'y':
                return new int[]{VK_Y};
            case 'z':
                return new int[]{VK_Z};
            case 'A':
                return new int[]{VK_SHIFT, VK_A};
            case 'B':
                return new int[]{VK_SHIFT, VK_B};
            case 'C':
                return new int[]{VK_SHIFT, VK_C};
            case 'D':
                return new int[]{VK_SHIFT, VK_D};
            case 'E':
                return new int[]{VK_SHIFT, VK_E};
            case 'F':
                return new int[]{VK_SHIFT, VK_F};
            case 'G':
                return new int[]{VK_SHIFT, VK_G};
            case 'H':
                return new int[]{VK_SHIFT, VK_H};
            case 'I':
                return new int[]{VK_SHIFT, VK_I};
            case 'J':
                return new int[]{VK_SHIFT, VK_J};
            case 'K':
                return new int[]{VK_SHIFT, VK_K};
            case 'L':
                return new int[]{VK_SHIFT, VK_L};
            case 'M':
                return new int[]{VK_SHIFT, VK_M};
            case 'N':
                return new int[]{VK_SHIFT, VK_N};
            case 'O':
                return new int[]{VK_SHIFT, VK_O};
            case 'P':
                return new int[]{VK_SHIFT, VK_P};
            case 'Q':
                return new int[]{VK_SHIFT, VK_Q};
            case 'R':
                return new int[]{VK_SHIFT, VK_R};
            case 'S':
                return new int[]{VK_SHIFT, VK_S};
            case 'T':
                return new int[]{VK_SHIFT, VK_T};
            case 'U':
                return new int[]{VK_SHIFT, VK_U};
            case 'V':
                return new int[]{VK_SHIFT, VK_V};
            case 'W':
                return new int[]{VK_SHIFT, VK_W};
            case 'X':
                return new int[]{VK_SHIFT, VK_X};
            case 'Y':
                return new int[]{VK_SHIFT, VK_Y};
            case 'Z':
                return new int[]{VK_SHIFT, VK_Z};
            case '`':
                return new int[]{VK_BACK_QUOTE};
            case '0':
                return new int[]{VK_0};
            case '1':
                return new int[]{VK_1};
            case '2':
                return new int[]{VK_2};
            case '3':
                return new int[]{VK_3};
            case '4':
                return new int[]{VK_4};
            case '5':
                return new int[]{VK_5};
            case '6':
                return new int[]{VK_6};
            case '7':
                return new int[]{VK_7};
            case '8':
                return new int[]{VK_8};
            case '9':
                return new int[]{VK_9};
            case '-':
                return new int[]{VK_MINUS};
            case '=':
                return new int[]{VK_EQUALS};
            case '~':
                return new int[]{VK_SHIFT, VK_BACK_QUOTE};
            case '!':
                return new int[]{VK_SHIFT, VK_1};
            case '@':
                return new int[]{VK_AT};
            case '#':
                return new int[]{VK_NUMBER_SIGN};
            case '$':
                return new int[]{VK_SHIFT, VK_4};
            case '%':
                return new int[]{VK_SHIFT, VK_5};
            case '^':
                return new int[]{VK_CIRCUMFLEX};
            case '&':
                return new int[]{VK_SHIFT, VK_7};
            case '*':
                return new int[]{VK_SHIFT, VK_8};
            case '(':
                return new int[]{VK_LEFT_PARENTHESIS};
            case ')':
                return new int[]{VK_RIGHT_PARENTHESIS};
            case '_':
                return new int[]{VK_SHIFT, VK_MINUS};
            case '+':
                return new int[]{VK_SHIFT, VK_EQUALS};
            case '\t':
                return new int[]{VK_TAB};
            case '\n':
                return new int[]{};
            case '[':
                return new int[]{VK_OPEN_BRACKET};
            case ']':
                return new int[]{VK_CLOSE_BRACKET};
            case '\\':
                return new int[]{VK_BACK_SLASH};
            case '{':
                return new int[]{VK_SHIFT, VK_OPEN_BRACKET};
            case '}':
                return new int[]{VK_SHIFT, VK_CLOSE_BRACKET};
            case '|':
                return new int[]{VK_SHIFT, VK_BACK_SLASH};
            case ';':
                return new int[]{VK_SEMICOLON};
            case ':':
                return new int[]{VK_SHIFT, VK_SEMICOLON};
            case '\'':
                return new int[]{VK_QUOTE};
            case '"':
                return new int[]{VK_SHIFT, VK_QUOTE};
            case ',':
                return new int[]{VK_COMMA};
            case '<':
                return new int[]{VK_SHIFT, VK_COMMA};
            case '.':
                return new int[]{VK_PERIOD};
            case '>':
                return new int[]{VK_SHIFT, VK_PERIOD};
            case '/':
                return new int[]{VK_SLASH};
            case '?':
                return new int[]{VK_SHIFT, VK_SLASH};
            case ' ':
                return new int[]{VK_SPACE};
            default:
                throw new IllegalArgumentException("Cannot type character " + character);
        }
    }

    public void doType(int... keyCodes) {
        doType(keyCodes, 0, keyCodes.length);
    }

    private void doType(int[] keyCodes, int offset, int length) {
        if (length == 0) {
            return;
        }

        robot.keyPress(keyCodes[offset]);
        doType(keyCodes, offset + 1, length - 1);
        try {
            Thread.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        robot.keyRelease(keyCodes[offset]);
    }

    private void doType(Integer[] keyCodes, int offset, int length) {
        if (length == 0) {
            return;
        }

        robot.keyPress(keyCodes[offset]);
        doType(keyCodes, offset + 1, length - 1);
        robot.keyRelease(keyCodes[offset]);
    }

    public void pressComboKey(List<String> keys) {
        List<Integer> keysList = new ArrayList<>();
        for (String key : keys) {
            switch (key) {
                case "UP":
                    keysList.add(VK_UP);
                    break;
                case "DOWN":
                    keysList.add(VK_DOWN);
                    break;
                case "LEFT":
                    keysList.add(VK_LEFT);
                    break;
                case "RIGHT":
                    keysList.add(VK_RIGHT);
                    break;
                case "CTRL":
                    keysList.add(VK_CONTROL);
                    break;
                case "CMD":
                    keysList.add(VK_META);
                    break;
                case "ALT":
                    keysList.add(VK_ALT);
                    break;
                case "<-":
                    keysList.add(VK_LEFT);
                    break;
                case "->":
                    keysList.add(VK_RIGHT);
                    break;
                case "TAB":
                    keysList.add(VK_TAB);
                    break;
                case "ENTER":
                    keysList.add(VK_ENTER);
                    break;
                default:
                    if (key.length() == 1) {
                        for (int i : type(key.charAt(0))) {
                            keysList.add(i);
                        }
                    }
                    else keysList.add(Integer.parseInt(key));
            }
            Integer[] keyslist = new Integer[keysList.size()];
            keyslist = keysList.toArray(keyslist);
            doType(keyslist, 0, keyslist.length);
        }
    }

    public void setDelayEnter(int delayEnter) {
        this.delayEnter = delayEnter;
    }
}
package fr.aviscogl;

import fr.aviscogl.instructions.*;
import fr.aviscogl.instructions.impl.Instruction;

import java.io.File;
import java.util.Arrays;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        registerInstructions();

        if (args.length == 0) {
            System.err.println("42Schenario > Need a text scenario.");
            return;
        }
        System.out.println("42Schenario > Start in 5 seconds");
        try {
            System.getProperties().forEach((k, v) -> VariableCreator.variables.put((String)k, (String)v));
            Thread.sleep(5 * 1000);
            for (String arg : args) {
                if (!new File(arg).exists()) {
                    System.err.printf("42Schenario > file %s does not exist\n", arg);
                    continue;
                }
                System.out.printf("\n42Schenario > Executing %s !\n", arg);
                Scenario.executeScenario(arg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void registerInstructions() {
        Instruction.registerInstruction(new Import());
        Instruction.registerInstruction(new Keys());
        Instruction.registerInstruction(new KeysRepeat());
        Instruction.registerInstruction(new SetDelay());
        Instruction.registerInstruction(new SetDelayEnter());
        Instruction.registerInstruction(new TernaryEval());
        Instruction.registerInstruction(new VariableCreator());
        Instruction.registerInstruction(new Wait());
        Instruction.registerInstruction(new EnterOrNot());
        Instruction.registerInstruction(new Comment());
    }
}


package fr.aviscogl;

import fr.aviscogl.instructions.VariableCreator;
import fr.aviscogl.instructions.VariableReplacer;
import fr.aviscogl.instructions.impl.Instruction;
import fr.aviscogl.instructions.impl.Options;

import java.awt.*;
import java.io.File;
import java.io.IOException;

class Scenario {

    public static void executeScenario(String arg) throws IOException, AWTException, InterruptedException {
        Driver driver = new Driver();
        VirtualFile virtualFile = new VirtualFile(new File(arg));

        String line;
        driver.click();
        while ((line = virtualFile.readNextLine()) != null) {
            Options options = Instruction.executeInstruction(virtualFile, driver, line);
            if (options.canExecuteLine) {
                driver.type(options.line);
                driver.enter();
            }
            Thread.sleep(200);
        }
    }
}
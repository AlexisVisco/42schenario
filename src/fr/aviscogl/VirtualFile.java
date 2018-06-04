package fr.aviscogl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class VirtualFile {

    private int line = 0;
    private List<String> file = new ArrayList<>();

    public VirtualFile(File f) throws IOException {
        if (f.exists()) {
            this.file = Files.readAllLines(Paths.get(f.getAbsolutePath()));
        } else System.exit(1);
    }

    public void readNextLine() {

    }

    public void insertFileAt(File f) throws IOException {
        if (f.exists()) {
            List<String> lines = Files.readAllLines(Paths.get(f.getAbsolutePath()));
            file.addAll(line, lines);
        } else throw new FileNotFoundException();
    }

    public int getLine() {
        return line;
    }
}

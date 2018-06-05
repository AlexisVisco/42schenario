package fr.aviscogl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class VirtualFile {

    private Deque<String> file = new ArrayDeque<>();
    private String parentPath;

    public VirtualFile(File f) throws IOException {
        if (f.exists()) {
            this.parentPath = f.getParent();
            file.addAll(Files.readAllLines(Paths.get(f.getAbsolutePath())));
        }
        else {
            System.err.printf("42Schenario > File %s does not exist.\n", f.getAbsolutePath());
            System.exit(1);
        }
    }

    public String readNextLine() {
        return file.pollFirst();
    }

    public void insertFileAt(String path) throws IOException {
        File file = new File(Paths.get(parentPath, path).toString());
        if (file.exists() || (file = new File(path)).exists()) {
            List<String> lines = Files.readAllLines(Paths.get(file.getAbsolutePath()));
            Collections.reverse(lines);
            for (String s : lines)
                this.file.addFirst(s);
        } else throw new FileNotFoundException();
    }

    public void add(String text) {
        file.addFirst(text);
    }
}

package com.irinabreza.hillel.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileClass {
    public static void main(String[] args) {
        File file = new File("test.txt");

try {
    Path path = Paths.get("test.txt").getFileName();
    List<String> lines = Files.readAllLines(path);

    Files.write(path, lines, StandardOpenOption.APPEND);
} catch (IOException e) {
    e.printStackTrace();
}

    }
}

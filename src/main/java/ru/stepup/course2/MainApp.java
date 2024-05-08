package ru.stepup.course2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static java.nio.charset.StandardCharsets.*;

public class MainApp {
    public static void main(String[] args) throws IOException {
        // образец чтения файла и записи в массив строк
//        List<String> lines = Files.readAllLines(Paths.get("C:\\temp\\Human.java"), UTF_8);
//        System.out.println(Paths.get("C:\\temp\\Human.java").toAbsolutePath());
//        for (String s : lines) {
//            System.out.println(s);
//        }
        Files.walkFileTree(Paths.get("C:\\temp\\2"), new FileVisitor());
//        List<String> lines = Files.readAllLines(Paths.get("C:\\temp\\2\\loadtostring.txt"), UTF_8);
//        System.out.println(Paths.get("C:\\temp\\2\\loadtostring.txt").toAbsolutePath());
//        for (String s : lines) {
//            System.out.println(s);
//        }
    }
}

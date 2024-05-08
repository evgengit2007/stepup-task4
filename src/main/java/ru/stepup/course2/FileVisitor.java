package ru.stepup.course2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class FileVisitor extends SimpleFileVisitor<Path> {
    // определяем каталог с файлами
    private List<String> lst = new ArrayList<>();

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        List<String> lines = Files.readAllLines(file);
        for (String s : lines) {
            if (s.contains("Логин Фамилия Имя Отчество дата_входа тип_приложения")) {
                System.out.println(file.toAbsolutePath());
                List<String> lines1 = Files.readAllLines(Paths.get(file.toAbsolutePath().toString()), StandardCharsets.UTF_8);
                lst = lines1;
                for (String s1 : lines1) {
                    System.out.println(s1);
                }
//                break; // так вывести все названия файлов, содержащих фразу выше
                return FileVisitResult.TERMINATE; // так вывести название только первого найденного файла с фразой выше
            }
        }
        return FileVisitResult.CONTINUE;
    }
}

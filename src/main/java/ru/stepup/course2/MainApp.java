package ru.stepup.course2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import ru.stepup.course2.model.Users;
import ru.stepup.course2.repositories.UsersRepo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import static java.nio.charset.StandardCharsets.*;

// https://habr.com/ru/articles/435114/

@SpringBootApplication
@ImportResource({"classpath:context.xml"})
public class MainApp {
    public static void main(String[] args) throws IOException {
        ApplicationContext ctx = SpringApplication.run(MainApp.class, args);
        UsersRepo usersRepo = ctx.getBean(UsersRepo.class);
        usersRepo.findAll().forEach(System.out::println);
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

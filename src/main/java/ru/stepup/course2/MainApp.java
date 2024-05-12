package ru.stepup.course2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import ru.stepup.course2.model.Logins;
import ru.stepup.course2.model.Users;
import ru.stepup.course2.repositories.UsersRepo;
import ru.stepup.course2.services.UserService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import static java.nio.charset.StandardCharsets.*;

// https://habr.com/ru/articles/435114/
// https://javarush.com/groups/posts/hibernate-java

@SpringBootApplication
@ImportResource({"classpath:context.xml"})
public class MainApp {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = SpringApplication.run(MainApp.class, args);
        UsersRepo usersRepo = ctx.getBean(UsersRepo.class);
//        usersRepo.findAll().forEach(System.out::println);

        UserService userService = new UserService();
        Users users = new Users("Sergey", "Сергеев Сергей Сергеевич");
        userService.saveUser(users);
        Logins logins = new Logins(new Timestamp(1231321313), users, "web");
        logins.setUsers(users);
//        usersRepo.findByUsername("ivan");
//        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
//        driverManagerDataSource.setDriverClassName("org.postgresql.Driver");
//        driverManagerDataSource.setUrl("jdbc:postgresql://localhost:5432/postgres");
//        driverManagerDataSource.setUsername("postgres");
//        driverManagerDataSource.setPassword("rootroot");
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

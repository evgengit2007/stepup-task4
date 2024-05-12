package ru.stepup.course2.services;

import ru.stepup.course2.repositories.WriteData;
import ru.stepup.course2.model.Logins;
import ru.stepup.course2.model.Users;

public class UserService {
    // сервисный класс для обслуживания запросов
    private WriteData writeData = new WriteData();

    public UserService() {
    }

    public Users findUser(long id) {
        return writeData.findById(id);
    }

    public static void saveUser(Users users) {
        WriteData.save(users);
    }

    public static void deleteUser(Users users) {
        WriteData.delete(users);
    }

    public static void updateUser(Users users) {
        WriteData.update(users);
    }

    public static Logins findLoginsById(long id) {
        return WriteData.findLoginsById(id);
    }

}

package ru.stepup.course2.repositories;

import ru.stepup.course2.model.Logins;
import ru.stepup.course2.model.Users;
import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.stepup.course2.services.DBConnector;


public class WriteData {
    // запись данных в БД
    public Users findById(long id) {
        return DBConnector.getSessionFactory().openSession().get(Users.class, id);
    }

    public static void save(Users users) {
        Session session = DBConnector.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(users);
        tx1.commit();
        session.close();
    }

    public static void update(Users users) {
        Session session = DBConnector.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(users);
        tx1.commit();
        session.close();
    }

    public static void delete(Users users) {
        Session session = DBConnector.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(users);
        tx1.commit();
        session.close();
    }

    public static Logins findLoginsById(long id) {
        return DBConnector.getSessionFactory().openSession().get(Logins.class, id);
    }

}

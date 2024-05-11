package ru.stepup.course2.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.stepup.course2.model.Users;

import java.util.Optional;

public interface UsersRepo extends CrudRepository<Users, Long> {
    Optional<Users> findByUsername(String username);
}

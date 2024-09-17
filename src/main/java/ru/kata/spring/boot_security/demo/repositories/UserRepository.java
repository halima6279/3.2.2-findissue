package ru.kata.spring.boot_security.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.kata.spring.boot_security.demo.models.User;

public interface UserRepository extends JpaRepository <User, Long> {
    @Query("Select u from User u left join fetch u.roles where u.username=:username")
    User findByUserName(String username);
}

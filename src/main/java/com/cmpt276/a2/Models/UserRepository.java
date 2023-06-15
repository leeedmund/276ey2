package com.cmpt276.a2.Models;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByEmailAddress(String emailAddress);

    List<User> findByName(String name);

    List<User> findByStudentID(int studentID);

    List<User> findByUserName(String userName);
}

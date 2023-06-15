package com.cmpt276.a2.Controllers;

import com.cmpt276.a2.Models.User;
import com.cmpt276.a2.Models.UserRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsersController {

    @Autowired
    private UserRepository userRepo;

    // @GetMapping("/users/view")
    // public String getAllUsers(Model model) {
    // System.out.println("Getting All Users:");
    // // get all users from db
    // // List<User> users = userRepo.findAll();
    // // public User(int studentID, String name, String userName, String
    // emailAddress,
    // // double gpa) {

    // List<User> users = new ArrayList<>();
    // users.add(new User(1, "Test", "Test", "yoo", 4.0));
    // users.add(new User(5, "bobby", "bobby", "yoo", 3.0));

    // model.addAttribute("us", users);
    // return "/mainpage";
    // }

    @GetMapping("/")
    public String mainPage(Model model) {
        // System.out.println("Getting All Users:");
        // get all users from db
        // List<User> users = userRepo.findAll();
        // public User(int studentID, String name, String userName, String
        // emailAddress,
        // double gpa) {

        List<User> users = new ArrayList<>();
        users.add(new User(1, "Test", "Test", "yoo", 4.0));
        users.add(new User(5, "bobby", "bobby", "yoo", 3.0));

        model.addAttribute("us", users);
        return "users/mainpage";
    }
}

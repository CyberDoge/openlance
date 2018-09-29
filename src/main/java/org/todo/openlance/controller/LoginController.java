package org.todo.openlance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.todo.openlance.model.User;


@RestController
public class LoginController {
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;
/*
    @PostMapping("/login")
    public ResponseEntity<String> loginApplication(@RequestBody User accountCredentials) {

        return ResponseEntity.ok().body(
                accountCredentials.getUsername() + "\n" + accountCredentials.getPassword() + "\n" + "You can access this page");

    }

    @PostMapping("/singup")
    public ResponseEntity<User> singupApplication(@RequestBody User users) {

        User result = userRepository.save(users);

        return ResponseEntity.ok().body(result);

    }*/
}

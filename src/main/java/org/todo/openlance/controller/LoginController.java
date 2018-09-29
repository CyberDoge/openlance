package org.todo.openlance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class LoginController {
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;
}

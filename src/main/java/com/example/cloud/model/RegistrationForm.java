package com.example.cloud.model;

import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;
import java.util.Collections;

@Data
public class RegistrationForm {
    private Long id;
    private String username;
    private String password;

    public Users toUser(PasswordEncoder passwordEncoder) {
        Users user = new Users();
        user.setUsername(username);
        user.setPassword(passwordEncoder.encode(password));
        user.setRoles(Collections.singleton(Role.USER));
        return user;
    }
}

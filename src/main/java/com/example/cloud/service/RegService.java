package com.example.cloud.service;

import com.example.cloud.model.RegistrationForm;
import com.example.cloud.model.Users;

import com.example.cloud.repository.CloudRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegService {

    @Autowired
    private CloudRepository cloudRepository;
    public ResponseEntity registration(Users users) {
        try {
            if (cloudRepository.findByUsername(users.getUsername()) != null) {
                return ResponseEntity.badRequest().body("Пользовотель с таким именем уже есть !");
            }
            cloudRepository.save(users);
            return ResponseEntity.ok("Регестрация прошла успешно !");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка !");
        }
    }

}

package com.example.cloud.controler;

import com.example.cloud.model.RegistrationForm;
import com.example.cloud.model.Users;
import com.example.cloud.repository.CloudRepository;
import com.example.cloud.service.RegService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
@RequestMapping("/registration")
public class CloudControlerHome {
    @Autowired
    private CloudRepository cloudRepository;
    @Autowired
    private RegService regService;
    private PasswordEncoder passwordEncoder;

    @PostMapping("/find")
    public Users findUser(String user){
        return cloudRepository.findByUsername(user);
    }
    //@PostMapping("/registration")
    public ResponseEntity registration(@RequestBody Users users){
       return regService.registration(users);
    }
    @GetMapping
    public String registration(){
        return "registration";
    }

    @PostMapping
    public String reg(RegistrationForm form){
        cloudRepository.save(form.toUser(passwordEncoder));
        return "redirect:/login";
    }
}

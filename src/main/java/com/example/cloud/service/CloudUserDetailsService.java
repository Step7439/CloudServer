package com.example.cloud.service;

import com.example.cloud.repository.CloudRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CloudUserDetailsService implements UserDetailsService
 {

    @Autowired
    private CloudRepository cloudRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return cloudRepository.findByUsername(username);
    }
}

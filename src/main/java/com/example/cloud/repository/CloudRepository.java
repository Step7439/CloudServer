package com.example.cloud.repository;

import com.example.cloud.model.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CloudRepository extends CrudRepository<Users, Long> {
Users findByUsername(String username);

}

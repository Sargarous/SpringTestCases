package com.example.firstProject.Repo;

import com.example.firstProject.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository <User, Long>{
    User findByUsername(String username);
}

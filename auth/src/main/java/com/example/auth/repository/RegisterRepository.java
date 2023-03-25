package com.example.auth.repository;

import com.example.auth.dto.RegisterDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterRepository extends JpaRepository<RegisterDto, Integer> {
    RegisterDto findUserById(Integer id);
}

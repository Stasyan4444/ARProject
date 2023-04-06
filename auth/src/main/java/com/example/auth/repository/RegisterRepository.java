package com.example.auth.repository;

import com.example.auth.dto.AuthDto;
import com.example.auth.dto.RegisterDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterRepository extends JpaRepository<RegisterDto, Long> {
    RegisterDto findUserById(Integer id);

    RegisterDto findUserByLogin(String login);
}

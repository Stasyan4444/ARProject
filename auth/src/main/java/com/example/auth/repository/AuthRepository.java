package com.example.auth.repository;

import com.example.auth.dto.AuthDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthRepository extends JpaRepository<AuthDto, Long> {
}

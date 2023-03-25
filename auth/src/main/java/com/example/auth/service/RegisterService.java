package com.example.auth.service;

import com.example.auth.dto.RegisterDto;
import com.example.auth.repository.RegisterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RegisterService {

    private final RegisterRepository authRepository;

    public RegisterDto userRegistration(RegisterDto registerDto) {
        return authRepository.save(registerDto);
    }

    public RegisterDto findUserById(Integer id) {
        return authRepository.findUserById(id);
    }
}

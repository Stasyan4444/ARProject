package com.example.auth.service;

import com.example.auth.dto.AuthDto;
import com.example.auth.dto.RegisterDto;
import com.example.auth.repository.AuthRepository;
import com.example.auth.repository.RegisterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    public String userAuthentication(AuthDto authDto) {
        RegisterDto register = new RegisterDto();
        authDto.setLogin(register.getLogin());
        authDto.setPassword(authDto.getPassword());

        if(authDto.getLogin().equals(register.getLogin()) &&
                authDto.getPassword().equals(register.getPassword())) {
            return "Logging was successful";
        } else {
            return "Logging was not successful";
        }
    }
}

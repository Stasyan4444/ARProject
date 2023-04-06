package com.example.auth.service;

import com.example.auth.dto.AuthDto;
import com.example.auth.dto.RegisterDto;
import com.example.auth.repository.RegisterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final RestTemplate template;
    private final RegisterRepository repository;

    public String userAuthentication(AuthDto authDto) {
        RegisterDto dto = repository.findUserByLogin(authDto.getLogin());
        ResponseEntity<AuthDto> response = template.getForEntity("http://localhost:8080/getUser/" +
                dto.getId(), AuthDto.class);

        if (authDto.getLogin().equals(Objects.requireNonNull(response.getBody()).getLogin())
                && authDto.getPassword().equals(response.getBody().getPassword())) {
            return "Login was successful";
        } else {
            return "Login was not successful";
        }
    }
}

package com.example.auth.controller;

import com.example.auth.dto.AuthDto;
import com.example.auth.dto.RegisterDto;
import com.example.auth.service.AuthService;
import com.example.auth.service.RegisterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;
    private final RegisterService registerService;

    @PostMapping("/register")
    public RegisterDto registration(@RequestBody RegisterDto registerDto) {
        return registerService.userRegistration(registerDto);
    }

    @PostMapping("/signin")
    public String authentication(@RequestBody AuthDto authDto) {
        return authService.userAuthentication(authDto);
    }

    @GetMapping(value = "/getUser/{id}", produces = "application/json")
    public RegisterDto getUser(@PathVariable("id") Integer id) {
        return registerService.findUserById(id);
    }
}

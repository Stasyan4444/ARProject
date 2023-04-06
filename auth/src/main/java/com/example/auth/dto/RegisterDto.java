package com.example.auth.dto;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "register")
public class RegisterDto {
    @Id
    @Column(name = "_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "_login")
    private String login;
    @Column(name = "_password")
    private String password;
}

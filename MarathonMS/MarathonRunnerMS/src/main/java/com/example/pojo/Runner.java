package com.example.pojo;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class Runner {

    private Long id;

    private String email;

    private String password;

    private String name;

    private String sex;

    private LocalDate birthDate;

    private Long city;

    private String avatarUrl;

    private String experience;

}

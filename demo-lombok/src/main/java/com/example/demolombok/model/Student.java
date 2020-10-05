package com.example.demolombok.model;

import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {

    private String name;
    private String email;
    private LocalDate birthDate;

}

package com.example.demolombok.model;

import lombok.*;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Teacher {
    @NotNull
    private String name;
    @Singular
    private List<Student> students = new ArrayList<>();
}

package com.example.demojunit.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public interface BirthdayService {
    LocalDate getValidBirthday(String birthdayString);

    String getBirthDOW(LocalDate birthday);

    String getChineseZodiac(LocalDate birthday);

    String getStarSign(LocalDate birthday);
}

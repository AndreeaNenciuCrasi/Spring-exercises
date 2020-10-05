package com.example.rpggame.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DiceRollResult {
    private int result;
    private String dice;
    private String port;
}

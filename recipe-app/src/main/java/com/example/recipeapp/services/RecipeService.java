package com.example.recipeapp.services;

import com.example.recipeapp.domain.Recipe;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}

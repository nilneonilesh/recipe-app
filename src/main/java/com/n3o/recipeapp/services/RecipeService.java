package com.n3o.recipeapp.services;

import com.n3o.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
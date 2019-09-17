package com.heiss.springtutorial.application;

import com.heiss.springtutorial.domain.Ingredient;

public interface IIngredientRepository {
    Iterable<Ingredient> byType(Ingredient.IngredientType ingredientType);
    Iterable<Ingredient> findAll();
    Ingredient findOne(String id);
    void save(Ingredient ingredient);
}
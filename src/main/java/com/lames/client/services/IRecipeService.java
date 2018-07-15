package com.lames.client.services;

import java.util.List;

import com.lames.client.model.RecipeEntity;



public interface IRecipeService {
	List<RecipeEntity> listRecipe();
	List<RecipeEntity> listRecipeByShopId(int shopid);

}

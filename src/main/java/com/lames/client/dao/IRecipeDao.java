package com.lames.client.dao;

import java.util.List;

import com.lames.client.model.RecipeEntity;

public interface IRecipeDao extends IBaseDao {
	List<RecipeEntity> findAll();
	List<RecipeEntity> findByShopId(int shopid);
}

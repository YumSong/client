package com.lames.client.dao;

import java.util.List;

import com.lames.client.model.ShopEntity;

public interface IShopDao extends IBaseDao {
	List<ShopEntity> findAll();
}

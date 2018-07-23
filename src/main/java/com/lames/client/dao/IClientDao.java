package com.lames.client.dao;

import com.lames.client.model1.NewClientEntity;

public interface IClientDao {
	NewClientEntity find(String name,String password);
	NewClientEntity findByName(String name);
	NewClientEntity persist(NewClientEntity client);
	NewClientEntity findByClient(NewClientEntity c);
	

}

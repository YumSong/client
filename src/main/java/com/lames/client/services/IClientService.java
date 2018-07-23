package com.lames.client.services;


import com.lames.client.model1.NewClientEntity;

public interface IClientService {
	NewClientEntity login(String name,String password);
	NewClientEntity checkName(NewClientEntity c);
	NewClientEntity register(NewClientEntity c);
	NewClientEntity loginByClient(NewClientEntity c);

}

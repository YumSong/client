package com.lames.client.service1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.lames.client.model1.NewClientEntity;
import com.lames.client.services.IClientService;
import com.lames.client.services.impl1.NewClientServiceImpl;

import junit.framework.Assert;

public class INewClientServiceTest {
	private IClientService clientService;
	
	@Before
	public void init() {
		clientService=new NewClientServiceImpl();
	}

	@Test
	public void testLogin() {
		String name="hahaha";
		String password="123456";
		NewClientEntity client=clientService.login(name, password);
		System.out.println(client);
		Assert.assertNotNull(client);
		
	}
	
	@Test
	public void testRegister() {
		NewClientEntity client1=new NewClientEntity(4,"LALALA","123456");
		NewClientEntity c=clientService.register(client1);
		System.out.println(client1);
		Assert.assertNotNull(c);
	}
	
	@Test
	public void testLoginByClient() {
		NewClientEntity client2=new NewClientEntity(1,"hahaha","123456");
		NewClientEntity c1=clientService.loginByClient(client2);
		Assert.assertNotNull(c1);
	}

}

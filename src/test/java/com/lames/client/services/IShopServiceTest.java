package com.lames.client.services;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.lames.client.model.ShopEntity;
import com.lames.client.services.impl.ShopServiceImpl;
import com.lames.client.utils.HttpUtils;
import com.lames.client.utils.PropertiesUtils;

public class IShopServiceTest {

	private IShopService shopService;
	
	@Before
	public void init() {
		shopService = new ShopServiceImpl();
	}
	
	@Test
	public void test() {
		List<ShopEntity> shopList= shopService.listShop();
		for(ShopEntity e : shopList) {
			System.out.println(e.toString());
		}
		Assert.assertTrue(shopList.size()==3);
	}	

}

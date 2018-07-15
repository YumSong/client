package com.lames.client.services.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.lames.client.dao.IShopDao;
import com.lames.client.dao.impl.*;
import com.lames.client.services.IShopService;
import com.lames.client.utils.HttpUtils;
import com.lames.client.utils.PropertiesUtils;
import com.lames.client.model.*;

public class ShopServiceImpl implements IShopService {
	private IShopDao shopDao;

	public ShopServiceImpl() {
		shopDao = new ShopDaoImpl();
	}

	public List<ShopEntity> listShop() {
		String str = HttpUtils.sendGet(PropertiesUtils.getProperty("adminUrl"), null);
		List<Integer> shopIds = JSON.parseArray(str, Integer.class);
		List<ShopEntity> shops = shopDao.findAll();
		List<ShopEntity> results = new ArrayList<ShopEntity>();
		if (shops.isEmpty())
			return null;
		if (shopIds.isEmpty())
			return null;
		for (ShopEntity entity : shops) {
			for (Integer shopId : shopIds) {
				if (entity.getshopid() == shopId) {
					results.add(entity);
				}
			}
		}
		return results;
	}
}

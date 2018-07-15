package com.lames.client.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lames.client.dao.IShopDao;
import com.lames.client.model.ShopEntity;
import com.lames.client.utils.DbPoolUtils;

public class ShopDaoImpl extends BaseDaoImpl<ShopEntity> implements IShopDao {

	public List<ShopEntity> findAll() {
		Connection connection = DbPoolUtils.getConnection();
		String sql = "select shop_id,shop_name,service_starttime,service_endtime,serviec_range,distribution_cost,shop_pic,business_pic,address from shop";
		PreparedStatement ps = null;
		ResultSet re = null;
		List<ShopEntity> list = new ArrayList<ShopEntity>();
		try {
			ps = connection.prepareStatement(sql);
			re = ps.executeQuery();
			while (re.next()) {
				ShopEntity shop = new ShopEntity(re.getInt(1), re.getString(2), re.getDate(3).getTime(), re.getDate(4).getTime(),
						re.getInt(5), re.getInt(6), re.getString(7), re.getString(8), re.getString(9));
				list.add(shop);
			}
			re.close();
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

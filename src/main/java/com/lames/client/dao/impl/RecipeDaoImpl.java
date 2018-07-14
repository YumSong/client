package com.lames.client.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lames.client.dao.IRecipeDao;
import com.lames.client.model.RecipeEntity;
import com.lames.client.utils.DbPoolUtils;

public class RecipeDaoImpl extends BaseDaoImpl<RecipeEntity> implements IRecipeDao {
	private Connection connection = null;

	public RecipeDaoImpl() throws SQLException {
		connection = DbPoolUtils.getConnection();
	}

	public List<RecipeEntity> findAll() {
		// create table recipe(
		// re_id NUMBER PRIMARY KEY --菜品id
		// ,re_name NVARCHAR2(255) --菜品的名字
		// ,re_pic NVARCHAR2(255) --圖片的url
		// ,detail NVARCHAR2(255) --菜品的介紹
		// ,price number --菜品的價格
		// ,shop_id number --店鋪的ID
		// );
		String sql = "select re_id,re_name,re_pic,detail,price,shop_id from recipe";
		PreparedStatement ps = null;
		ResultSet re = null;
		List<RecipeEntity> list = new ArrayList<RecipeEntity>();
		try {
			ps = connection.prepareStatement(sql);
			re = ps.executeQuery();
			while (re.next()) {
				RecipeEntity recipe = new RecipeEntity(re.getInt(1), re.getString(2), re.getString(3), re.getString(4),
						re.getInt(5), re.getInt(6));
				list.add(recipe);
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

package com.lames.client.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.management.Query;


import com.lames.client.dao.IRecipeDao;
import com.lames.client.model.RecipeEntity;
import com.lames.client.utils.DbPoolUtils;

public class RecipeDaoImpl extends BaseDaoImpl<RecipeEntity> implements IRecipeDao {

	public RecipeDaoImpl() {
	}

	public List<RecipeEntity> findAll() {
		Connection connection= DbPoolUtils.getConnection();
		String sql = "select re_id,re_name,re_pic,detail,price,shop_id from recipe";
		PreparedStatement ps = null;
		ResultSet re = null;
		List<RecipeEntity> list = new ArrayList<RecipeEntity>();
		try {
			ps = connection.prepareStatement(sql);
			re = ps.executeQuery();
			while (re.next()) {
				RecipeEntity recipe = new RecipeEntity(re.getInt(1), re.getString(2), 
														re.getString(3), re.getString(4),
														re.getInt(5), re.getInt(6));				
				list.add(recipe);
			}
			re.close();
			connection.close();
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				re.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


	public List<RecipeEntity> findByShopId(int shopid) {
		Connection connection= DbPoolUtils.getConnection();
		// TODO Auto-generated method stub
		String sql = "select re_id,re_name,re_pic,detail,price,shop_id from recipe where shop_id=?";
		PreparedStatement ps = null;
		ResultSet re = null;
		List<RecipeEntity> list = new ArrayList<RecipeEntity>();
		try {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, shopid);
			re = ps.executeQuery();
			while (re.next()) {
				
//				RecipeEntity recipe = new RecipeEntity(re.getInt(1), re.getString(2), re.getString(3), re.getString(4),
//						re.getInt(5), re.getInt(6));
//				list.add(recipe);
				RecipeEntity recipe = new RecipeEntity();
				recipe.setReId(re.getInt(1));
				recipe.setReName(re.getString(2));
				recipe.setRePic(re.getString(3));
				recipe.setDetail(re.getString(4));
				recipe.setPrice(re.getInt(5));
				recipe.setShopId(re.getInt(6));
				list.add(recipe);
				
			}
			re.close();
			connection.close();
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

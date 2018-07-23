package com.lames.client.model1;

import java.io.Serializable;

import com.jake.annotation.Column;
import com.jake.annotation.Entity;
import com.jake.annotation.ID;
import com.jake.annotation.Sequence;

@Entity("recipe")
public class NewRecipeEntity implements Serializable {
	// create table recipe(
	// re_id NUMBER PRIMARY KEY --菜品id
	// ,re_name NVARCHAR2(255) --菜品的名字
	// ,re_pic NVARCHAR2(255) --圖片的url
	// ,detail NVARCHAR2(255) --菜品的介紹
	// ,price number --菜品的價格
	// ,shop_id number --店鋪的ID
	// );
	@ID
	@Sequence("S_recipe")
	@Column("re_id")
	private Integer reId;
	@Column("re_name")
	private String reName;
	@Column("re_pic")
	private String rePic;
	@Column("detail")
	private String detail;
	@Column("price")
	private Integer price;
	@Column("shop_id")
	private Integer shopId;

	public NewRecipeEntity() {
		super();
	}

	public NewRecipeEntity(Integer reId, String reName, String rePic, String detail, Integer price, Integer shopId) {
		super();
		this.reId = reId;
		this.reName = reName;
		this.rePic = rePic;
		this.detail = detail;
		this.price = price;
		this.shopId = shopId;
	}

	@Override
	public String toString() {
		return "RecipeEntity [reId=" + reId + ", reName=" + reName + ", rePic=" + rePic + ", detail=" + detail
				+ ", price=" + price + ", shopId=" + shopId + "]\n";
	}

	public Integer getReId() {
		return reId;
	}

	public void setReId(Integer reId) {
		this.reId = reId;
	}

	public String getReName() {
		return reName;
	}

	public void setReName(String reName) {
		this.reName = reName;
	}

	public String getRePic() {
		return rePic;
	}

	public void setRePic(String rePic) {
		this.rePic = rePic;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

}

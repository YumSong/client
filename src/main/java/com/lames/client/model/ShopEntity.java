package com.lames.client.model;

import java.io.Serializable;

public class ShopEntity implements Serializable {
	// create table shop(
	// shop_id number primary key --店鋪id
	// ,shop_name NVARCHAR2(255) --店名
	// ,service_starttime TIMESTAMP --服務開始時間
	// ,service_endtime TIMESTAMP --服務結束時間
	// ,serviec_range number --配送範圍
	// ,distribution_cost number --配送費用
	// ,shop_pic NVARCHAR2(255) --店内圖片url拼接
	// ,business_pic NVARCHAR2(255) --工商照片
	// ,address NVARCHAR2(255) --店鋪地址
	// );

	private Integer shopid;
	private String shopName;
	private long serviceStarttime;
	private long serviceEndtime;
	private Integer serviceRangeNumber;
	private Integer distributionCost;
	private String shopPic;
	private String businessPic;
	private String address;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((businessPic == null) ? 0 : businessPic.hashCode());
		result = prime * result + ((distributionCost == null) ? 0 : distributionCost.hashCode());
		result = prime * result + (int) (serviceEndtime ^ (serviceEndtime >>> 32));
		result = prime * result + ((serviceRangeNumber == null) ? 0 : serviceRangeNumber.hashCode());
		result = prime * result + (int) (serviceStarttime ^ (serviceStarttime >>> 32));
		result = prime * result + ((shopName == null) ? 0 : shopName.hashCode());
		result = prime * result + ((shopPic == null) ? 0 : shopPic.hashCode());
		result = prime * result + ((shopid == null) ? 0 : shopid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShopEntity other = (ShopEntity) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (businessPic == null) {
			if (other.businessPic != null)
				return false;
		} else if (!businessPic.equals(other.businessPic))
			return false;
		if (distributionCost == null) {
			if (other.distributionCost != null)
				return false;
		} else if (!distributionCost.equals(other.distributionCost))
			return false;
		if (serviceEndtime != other.serviceEndtime)
			return false;
		if (serviceRangeNumber == null) {
			if (other.serviceRangeNumber != null)
				return false;
		} else if (!serviceRangeNumber.equals(other.serviceRangeNumber))
			return false;
		if (serviceStarttime != other.serviceStarttime)
			return false;
		if (shopName == null) {
			if (other.shopName != null)
				return false;
		} else if (!shopName.equals(other.shopName))
			return false;
		if (shopPic == null) {
			if (other.shopPic != null)
				return false;
		} else if (!shopPic.equals(other.shopPic))
			return false;
		if (shopid == null) {
			if (other.shopid != null)
				return false;
		} else if (!shopid.equals(other.shopid))
			return false;
		return true;
	}

	public ShopEntity() {
	}

	public ShopEntity(Integer shopid, String shopName, long serviceStarttime, long serviceEndtime,
			Integer serviceRangeNumber, Integer distributionCost, String shopPic, String businessPic, String address) {
		super();
		this.shopid = shopid;
		this.shopName = shopName;
		this.serviceStarttime = serviceStarttime;
		this.serviceEndtime = serviceEndtime;
		this.serviceRangeNumber = serviceRangeNumber;
		this.distributionCost = distributionCost;
		this.shopPic = shopPic;
		this.businessPic = businessPic;
		this.address = address;
	}

	

	@Override
	public String toString() {
		return "ShopEntity [shopid=" + shopid + ", shopName=" + shopName + ", serviceStarttime=" + serviceStarttime
				+ ", serviceEndtime=" + serviceEndtime + ", serviceRangeNumber=" + serviceRangeNumber
				+ ", distributionCost=" + distributionCost + ", shopPic=" + shopPic + ", businessPic=" + businessPic
				+ ", address=" + address + "]";
	}

	public Integer getshopid() {
		return shopid;
	}

	public void setshopid(Integer shopid) {
		this.shopid = shopid;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public long getServiceStarttime() {
		return serviceStarttime;
	}

	public void setServiceStarttime(long serviceStarttime) {
		this.serviceStarttime = serviceStarttime;
	}

	public long getServiceEndtime() {
		return serviceEndtime;
	}

	public void setServiceEndtime(long serviceEndtime) {
		this.serviceEndtime = serviceEndtime;
	}

	public Integer getServiceRangeNumber() {
		return serviceRangeNumber;
	}

	public void setServiceRangeNumber(Integer serviceRangeNumber) {
		this.serviceRangeNumber = serviceRangeNumber;
	}

	public Integer getDistributionCost() {
		return distributionCost;
	}

	public void setDistributionCost(Integer distributionCost) {
		this.distributionCost = distributionCost;
	}

	public String getShopPic() {
		return shopPic;
	}

	public void setShopPic(String shopPic) {
		this.shopPic = shopPic;
	}

	public String getBusinessPic() {
		return businessPic;
	}

	public void setBusinessPic(String businessPic) {
		this.businessPic = businessPic;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

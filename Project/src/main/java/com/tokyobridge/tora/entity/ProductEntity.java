package com.tokyobridge.tora.entity;

import lombok.Data;

@Data

public class ProductEntity extends Entity{
	private String productIndex;
	private String productName;
	private String regisrant;
	private String registrationDate;
	private String deleteFlg;
	private String price;
	private String discount;
	private String productMenual;
	
}

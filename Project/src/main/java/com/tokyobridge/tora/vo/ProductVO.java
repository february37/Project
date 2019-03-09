package com.tokyobridge.tora.vo;

import java.io.Serializable;

import lombok.Data;

@Data
public class ProductVO implements Serializable{
	private String productIndex;
	private String productName;
	private String regisrant;
	private String registrationDate;
	private String deleteFlg;
	private String price;
	private String discount;
	private String productMenual;
}

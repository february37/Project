package com.tokyobridge.tora.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.tokyobridge.tora.dao.ProductDAOImpl;
import com.tokyobridge.tora.entity.ProductEntity;
import com.tokyobridge.tora.vo.ProductVO;

public class productServiceImpl implements productServiceIF {

	@Inject
	private ProductDAOImpl dao;
	
	@Override
	public ProductEntity selecttProductTargetIndex(ProductVO vo) throws Exception {
		ProductEntity entity = dao.selectProductTargetIndex(vo);
		return entity;
	}

	@Override
	public List<ProductEntity> selecttProductTargetName(ProductVO vo) throws Exception {
		ArrayList<ProductEntity> list = new ArrayList<>(dao.selectProductTargetName(vo));
		return list;
	}

}

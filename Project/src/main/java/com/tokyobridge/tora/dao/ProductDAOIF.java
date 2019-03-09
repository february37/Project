package com.tokyobridge.tora.dao;

import java.util.List;

import com.tokyobridge.tora.entity.ProductEntity;
import com.tokyobridge.tora.vo.ProductVO;

public interface ProductDAOIF{
	public ProductEntity selectProductTargetIndex(ProductVO vo)throws Exception;
	public List<ProductEntity> selectProductTargetName(ProductVO vo)throws Exception;
}

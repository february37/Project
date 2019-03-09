package com.tokyobridge.tora.service;

import java.util.List;

import com.tokyobridge.tora.entity.ProductEntity;
import com.tokyobridge.tora.vo.ProductVO;

public interface productServiceIF {
	public ProductEntity selecttProductTargetIndex(ProductVO vo)throws Exception;
	public List<ProductEntity> selecttProductTargetName(ProductVO vo)throws Exception;
}

package com.tokyobridge.tora.dao;

import java.util.List;

import com.tokyobridge.tora.entity.ProductEntity;
import com.tokyobridge.tora.vo.ProductVO;

public interface ProductDAOIF{
	
	/**  
	 * 상품전체검색
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<ProductEntity> selectProductTargetAll()throws Exception;
	
	/** 
	 * 상품 인덱스 번호 검색
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	public ProductEntity selectProductTargetIndex(ProductVO vo)throws Exception;
	
	/**
	 * 상품 이름 검색
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	public List<ProductEntity> selectProductTargetName(ProductVO vo)throws Exception;
	
	/**
	 * 상품등록
	 * 
	 * @return
	 * @throws Exception
	 */
	public void insertProduct(ProductVO vo)throws Exception;

	/**
	 * 상품삭제(상품번호)
	 * 
	 * @param index
	 * @return
	 * @throws Exception
	 */
	public int deleteProductTargetIndex(ProductVO vo)throws Exception;

}
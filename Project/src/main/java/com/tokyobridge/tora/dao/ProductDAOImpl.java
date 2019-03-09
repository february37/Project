package com.tokyobridge.tora.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.tokyobridge.tora.entity.ProductEntity;
import com.tokyobridge.tora.vo.ProductVO;

@Repository
public class ProductDAOImpl implements ProductDAOIF {

	@Inject
	private SqlSession sqlSession;
	
	private static String Namespace = "com.tokyobridge.tora.mapper.productMapper";
	
	@Override
	public ProductEntity selectProductTargetIndex(ProductVO vo) throws Exception {
		return sqlSession.selectOne(Namespace+".selectProductTargetIndex", vo);
	}

	@Override
	public List<ProductEntity> selectProductTargetName(ProductVO vo) throws Exception {
		return sqlSession.selectList(Namespace+".selectProductTargetName", vo);
	}

}

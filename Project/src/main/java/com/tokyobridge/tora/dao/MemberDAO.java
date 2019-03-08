/**
 * Member Table DAO
 * 
 * @author 김정헌
 * @since 2018.12.02
 * 
 */
package com.tokyobridge.tora.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.tokyobridge.tora.vo.MemberVO;

@Repository
public class MemberDAO implements MemberDAOIF {

	@Inject
	private SqlSession sqlSession;
	
	private static String Namespace = "com.tokyobridge.tora.mapper.memberMapper";
	
	/**
	 * 
	 * 회원 관리 테이블의 기본 SELECT문
	 * 会員管理テーブルの基本select文
	 * 
	 * @author 김정헌
	 * @return
	 * @throws Exception
	 */
	@Override
	public MemberVO selectMember(MemberVO vo) throws Exception {
		return sqlSession.selectOne(Namespace+".selectMember", vo);
	}
}

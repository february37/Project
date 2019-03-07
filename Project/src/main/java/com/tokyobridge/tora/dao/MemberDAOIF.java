/**
 * Member Table DAO
 * 
 * @author 김정헌
 * @since 2018.12.02
 * 
 */
package com.tokyobridge.tora.dao;

import com.tokyobridge.tora.vo.MemberVO;


public interface MemberDAOIF {
	
	/**
	 * 
	 * 회원 관리 테이블의 기본 SELECT문
	 * 会員管理テーブルの基本select文
	 * 
	 * @author 김정헌
	 * @return
	 * @throws Exception
	 */
	public MemberVO selectMember(MemberVO vo)throws Exception;
	
}

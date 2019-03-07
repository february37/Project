/**
 * 로그인 서비스 
 * 
 * @author 김정헌
 * @since 2018.12.02
 *
 */
package com.tokyobridge.tora.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.tokyobridge.tora.dao.MemberDAO;
import com.tokyobridge.tora.vo.MemberVO;

@Service
public class LoginService implements LoginServiceIF {

	@Inject
	private MemberDAO dao;
	
	/**
	 * 로그인 할 때, 회원 테이블에서 회원 존재 유무와 로그인을 도와준다.
	 * 
	 * @author 김정헌
	 * @return List<MemberVO>
	 * @throws Exception
	 */
	@Override
	public MemberVO selectMember(MemberVO vo) throws Exception {
		vo = dao.selectMember(vo);
		return vo;
	}

}

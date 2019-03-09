package com.tokyobridge.tora.vo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
public class MemberVO implements Serializable{
	
	/** Index (PK)*/
	private String index_no;
	/** Del Sign 삭제싸인 1이면 삭제된 데이터*/
	private String del_sign;
	private String zip;
	private String address;
	private String tel1;
	private String tel2;
	private String email1;
	private String email2;
	/** User Id */
	private String user_id;
	/** User Name */
	private String user_nm;
	private String user_nm_kanji;
	private String user_nm_kana;
	/** User Password*/
	private String user_pw;
	/** Responsibility 직책 회원:0 관리자:9*/
	private String responsibility;
	private String company_position;
	private String company_registant;
	private String registration_date;
	private String modified_date;
	/** Spare Flag 예비플레그 1*/
	private String spare_flg1;
	/** Spare Flag 예비플레그 2*/
	private String spare_flg2;
	/** Spare Flag 예비플레그 3*/
	private String spare_flg3;
	/** Spare Flag 예비플레그 4*/
	private String spare_flg4;
	/** Spare Flag 예비플레그 5*/
	private String spare_flg5;
}

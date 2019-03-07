CREATE TABLE `breakdwon_tbl` (
  `INDEX_NO` int(1) NOT NULL COMMENT '인덱스 번호',
  `DEL_SIGN` varchar(1) COLLATE utf8_bin NOT NULL DEFAULT '0' COMMENT '삭제 사인',
  `STATUS_CD` varchar(6) COLLATE utf8_bin NOT NULL COMMENT '주문 상태',
  `BREAKDOWN_CD` varchar(10) COLLATE utf8_bin NOT NULL COMMENT '명세 번호',
  `PRODUCT_COUNT` varchar(3) COLLATE utf8_bin NOT NULL DEFAULT '0' COMMENT '상품 수',
  `TOTAL_PRICE` decimal(7,0) NOT NULL DEFAULT '0' COMMENT '총합',
  `TOTAL_PRICEWARI` decimal(7,0) NOT NULL DEFAULT '0' COMMENT '총 할인가',
  `USER_ID` varchar(20) COLLATE utf8_bin NOT NULL COMMENT '고객 아이디',
  `START_DATE` datetime NOT NULL COMMENT '등록일',
  `END_DATE` datetime DEFAULT NULL COMMENT '종료일',
  `SPARE_FLG1` varchar(1) COLLATE utf8_bin DEFAULT NULL,
  `SPARE_FLG2` varchar(1) COLLATE utf8_bin DEFAULT NULL,
  `SPARE_FLG3` varchar(1) COLLATE utf8_bin DEFAULT NULL,
  `SPARE_FLG4` varchar(1) COLLATE utf8_bin DEFAULT NULL,
  `SPARE_FLG5` varchar(1) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`INDEX_NO`,`BREAKDOWN_CD`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='명세서 테이블'

CREATE TABLE `company_tbl` (
  `INDEX_NO` int(11) NOT NULL COMMENT '인덱스 번호',
  `DEL_SIGN` varchar(1) COLLATE utf8_bin NOT NULL DEFAULT '0' COMMENT '삭제사인',
  `COMPANY_CD` varchar(10) COLLATE utf8_bin NOT NULL COMMENT '회사 코드',
  `TYPE_BUSINESS` varchar(4) COLLATE utf8_bin DEFAULT NULL COMMENT '업종',
  `COMPANY_NM` varchar(20) COLLATE utf8_bin NOT NULL COMMENT '회사명',
  `COMPANY_KANA` varchar(30) COLLATE utf8_bin NOT NULL COMMENT '회사명 히라가나',
  `ZIP` varchar(10) COLLATE utf8_bin NOT NULL COMMENT '우편번호',
  `ADDRESS` varchar(30) COLLATE utf8_bin NOT NULL COMMENT '주소',
  `CEO_NM` varchar(10) COLLATE utf8_bin DEFAULT NULL COMMENT '대표이사 성함',
  `CEO_KANA` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '대표이사 성함 히라가나',
  `HOMEPAGE` varchar(45) COLLATE utf8_bin DEFAULT NULL COMMENT '회사 홈페이지',
  `START_TIME` datetime NOT NULL COMMENT '등록일',
  `END_TIME` datetime NOT NULL COMMENT '종료일',
  `SPARE_FLG1` varchar(1) COLLATE utf8_bin DEFAULT NULL COMMENT '예비 플레그',
  `SPARE_FLG2` varchar(1) COLLATE utf8_bin DEFAULT NULL COMMENT '예비 플레그',
  `SPARE_FLG3` varchar(1) COLLATE utf8_bin DEFAULT NULL COMMENT '예비 플레그',
  `SPARE_FLG4` varchar(1) COLLATE utf8_bin DEFAULT NULL COMMENT '예비 플레그',
  `SPARE_FLG5` varchar(1) COLLATE utf8_bin DEFAULT NULL COMMENT '예비 플레그',
  PRIMARY KEY (`INDEX_NO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='회사 테이블'

CREATE TABLE `member_info_tbl` (
  `INDEX_NO` int(11) NOT NULL COMMENT '인덱스 번호',
  `DEL_SIGN` varchar(1) COLLATE utf8_bin NOT NULL COMMENT '삭제 사인',
  `USER_ID` varchar(20) COLLATE utf8_bin NOT NULL COMMENT '고객 아이디',
  `MEMER_INFO` varchar(45) COLLATE utf8_bin DEFAULT NULL COMMENT '고객 정보',
  `ORDER_COUNT` varchar(3) COLLATE utf8_bin NOT NULL DEFAULT '0' COMMENT '주문 수',
  `ORDER_SUBTOTAL` decimal(10,0) NOT NULL DEFAULT '0' COMMENT '누적 주문 가격',
  `ORDER_SUBTAX` decimal(10,0) NOT NULL DEFAULT '0' COMMENT '누적 세금',
  `SPARE_FLG1` varchar(1) COLLATE utf8_bin DEFAULT NULL,
  `SPARE_FLG2` varchar(1) COLLATE utf8_bin DEFAULT NULL,
  `SPARE_FLG3` varchar(1) COLLATE utf8_bin DEFAULT NULL,
  `SPARE_FLG4` varchar(1) COLLATE utf8_bin DEFAULT NULL,
  `SPARE_FLG5` varchar(1) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`INDEX_NO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='고객 이력 정보'

CREATE TABLE `member_tbl` (
  `INDEX_NO` int(11) NOT NULL COMMENT '인덱스 번호 PK',
  `DEL_SIGN` varchar(1) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL DEFAULT '0' COMMENT '삭제 싸인',
  `ZIP` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '우편 번호',
  `ADDRESS` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '주소',
  `TEL1` varchar(15) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '전화',
  `TEL2` varchar(15) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '핸드폰',
  `FAX` varchar(15) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `EMAIL1` varchar(35) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '이메일 아이디',
  `EMAIL2` varchar(35) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '이메일 주소',
  `USER_ID` varchar(25) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '아이디',
  `USER_NM` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '이름',
  `USER_NM_KANJI` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '이름 한자',
  `USER_NM_KANA` varchar(25) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '이름 히라가나',
  `USER_PW` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '비밀번호',
  `RESPONSIBILITY` varchar(1) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '직책',
  `COMPANY` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '회사 또는 상호',
  `COMPANY_POSITION` varchar(5) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '회사에서의 직책',
  `REGISTANT` int(11) DEFAULT NULL COMMENT '회원등록 시켜준 관리자 아이디',
  `REGISTRATION_DATE` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '등록일',
  `MODIFIED_DATE` datetime DEFAULT NULL COMMENT '수정일',
  `SPARE_FIG1` varchar(1) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '예비 키',
  `SPARE_FIG2` varchar(1) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '예비 키',
  `SPARE_FIG3` varchar(1) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '예비 키',
  `SPARE_FIG4` varchar(1) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '예비 키',
  `SPARE_FIG5` varchar(1) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '예비 키',
  PRIMARY KEY (`INDEX_NO`,`USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='member table'

CREATE TABLE `notice_info_tbl` (
  `INDEX_NO` int(11) NOT NULL,
  `DEL_SIGN` varchar(1) COLLATE utf8_bin NOT NULL DEFAULT '0',
  `TEXT_CD` varchar(8) COLLATE utf8_bin NOT NULL,
  `START_DATE` datetime DEFAULT NULL,
  `MODIFYED_DATE` datetime NOT NULL,
  `TEXT_INFO1` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `TEXT_INFO2` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `TEXT_INFO3` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `TEXT_INFO4` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `TEXT_INFO5` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `TEXT_INFO6` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `TEXT_INFO7` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `TEXT_INFO8` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `TEXT_INFO9` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `TEXT_INFO10` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `TEXT_INFO11` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `TEXT_INFO12` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `TEXT_INFO13` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `TEXT_INFO14` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `TEXT_INFO15` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `TEXT_INFO16` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `TEXT_INFO17` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `TEXT_INFO18` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `TEXT_INFO19` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `TEXT_INFO20` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `TEXT_INFO21` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `TEXT_INFO22` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `TEXT_INFO23` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `TEXT_INFO24` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `TEXT_INFO25` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`INDEX_NO`,`MODIFYED_DATE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='공지 내용 테이블'

CREATE TABLE `notice_tbl` (
  `INDEX_NO` int(11) NOT NULL COMMENT '인덱스 번호',
  `DEL_SIGN` varchar(1) COLLATE utf8_bin NOT NULL DEFAULT '0' COMMENT '삭제 사인',
  `TITLE` varchar(45) COLLATE utf8_bin NOT NULL,
  `START_DATE` datetime NOT NULL,
  `MODIFYED_DATE` datetime NOT NULL,
  `REGISTER` varchar(20) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`INDEX_NO`,`START_DATE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='공지 테이블'

CREATE TABLE `order_status_tbl` (
  `INDEX_NO` int(1) NOT NULL,
  `DEL_SIGN` varchar(1) COLLATE utf8_bin NOT NULL,
  `STATUS` varchar(1) COLLATE utf8_bin NOT NULL,
  `STATUS_NM` varchar(5) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`INDEX_NO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='주문상태 테이블'

CREATE TABLE `order_tbl` (
  `INDEX_NO` int(11) NOT NULL,
  `DEL_SIGN` varchar(1) COLLATE utf8_bin NOT NULL DEFAULT '0',
  `ORDER_CD` varchar(10) COLLATE utf8_bin NOT NULL,
  `USER_ID` varchar(20) COLLATE utf8_bin NOT NULL,
  `PRODUCT_CD` varchar(10) COLLATE utf8_bin NOT NULL,
  `PRODUCT_NM` varchar(10) COLLATE utf8_bin NOT NULL,
  `PRICE` decimal(7,0) NOT NULL DEFAULT '0',
  `PERCENTWARI` varchar(4) COLLATE utf8_bin NOT NULL DEFAULT '0',
  `TAX` decimal(7,0) DEFAULT '0',
  `STATUS_CD` varchar(1) COLLATE utf8_bin NOT NULL DEFAULT '0',
  `QUANTITY` decimal(3,0) NOT NULL DEFAULT '0',
  `START_DATE` datetime NOT NULL,
  `END_DATE` datetime NOT NULL,
  `SPARE_FLG1` varchar(1) COLLATE utf8_bin DEFAULT NULL,
  `SPARE_FLG2` varchar(1) COLLATE utf8_bin DEFAULT NULL,
  `SPARE_FLG3` varchar(1) COLLATE utf8_bin DEFAULT NULL,
  `SPARE_FLG4` varchar(1) COLLATE utf8_bin DEFAULT NULL,
  `SPARE_FLG5` varchar(1) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`INDEX_NO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='주문 테이블'

CREATE TABLE `product_tbl` (
  `INDEX_NO` int(11) NOT NULL COMMENT '인덱스 번호 PK',
  `DEL_SIGN` varchar(1) COLLATE utf8_bin NOT NULL DEFAULT '0' COMMENT '삭제싸인',
  `PRODUCT_NM` varchar(10) COLLATE utf8_bin NOT NULL COMMENT '상품 이름',
  `PRODUCT_CD` varchar(10) COLLATE utf8_bin NOT NULL COMMENT '상품 코드',
  `PRICE` varchar(45) COLLATE utf8_bin NOT NULL DEFAULT '0' COMMENT '단가',
  `PERCENTWARI` varchar(3) COLLATE utf8_bin NOT NULL DEFAULT '0' COMMENT '할인율',
  `PRODUCT_NM_KANJI` varchar(20) COLLATE utf8_bin NOT NULL COMMENT '상품 한자',
  `PRODUCT_NM_KANA` varchar(25) COLLATE utf8_bin NOT NULL COMMENT '상품 히라가나',
  `START_DATE` datetime NOT NULL COMMENT '시작일',
  `END_DATE` datetime NOT NULL COMMENT '종료일',
  `MODIFIED_DATE` datetime NOT NULL COMMENT '수정일',
  `SORT_KEY` varchar(10) COLLATE utf8_bin NOT NULL COMMENT '분류 키',
  `MANUFACTURER` varchar(10) COLLATE utf8_bin DEFAULT NULL COMMENT '제조사또는 원산지',
  `PRODUCT_INFO` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '제품 정보',
  `SPARE_FLG1` varchar(1) COLLATE utf8_bin DEFAULT NULL COMMENT '예비 키',
  `SPARE_FLG2` varchar(1) COLLATE utf8_bin DEFAULT NULL COMMENT '예비 키',
  `SPARE_FLG3` varchar(1) COLLATE utf8_bin DEFAULT NULL COMMENT '예비 키',
  `SPARE_FLG4` varchar(1) COLLATE utf8_bin DEFAULT NULL COMMENT '예비 키',
  `SPARE_FLG5` varchar(1) COLLATE utf8_bin DEFAULT NULL COMMENT '예비 키',
  PRIMARY KEY (`INDEX_NO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='상품 테이블'

CREATE TABLE `type_business_tbl` (
  `INDEX_NO` int(3) NOT NULL COMMENT '인덱스 번호',
  `DEL_SIGN` varchar(1) COLLATE utf8_bin NOT NULL DEFAULT '0' COMMENT '삭제 사인',
  `TYPE_CD` varchar(1) COLLATE utf8_bin NOT NULL COMMENT '타입 코드',
  `TYPE_NM` varchar(5) COLLATE utf8_bin NOT NULL COMMENT '업종 명칭',
  PRIMARY KEY (`INDEX_NO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='업종 테이블'

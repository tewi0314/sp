/*
데이터 추가
-데이터는 객체가 아니다(Create로 시작하지 않는다)
-테이블은 이미 생성되어 있어야한다
-숫자는 따옴표를 붙이지않는다
-문자열은 따옴표 1개짜리를 붙인다.

INSET INTO 테이블이름(집어넣을 컬럼)  VALUES( 집어넣을 값);

*/

INSERT INTO WORLDCUP(RANK, NAME, NATION, GOAL)
VALUES(1,'음바페','프랑스',8);

--데이터 조회
SELECT * FROM WORLDCUP;

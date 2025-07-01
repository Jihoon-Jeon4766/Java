-- 동일한 데이터베이스 안에서 이름이 같은 컬럼이 존재하면 안됨
-- 단, 상속 받은 컬럼은 제외
CREATE TABLE idolGroup(
	IdolGroupName VARCHAR2(27) PRIMARY KEY,
	company VARCHAR2(18) NOT NULL,
	gender CHAR(1) NOT NULL,
	genre VARCHAR2(20) NOT NULL,
	year NUMBER NOT NULL,
	song VARCHAR2(30) NOT NULL,
	generation NUMBER NOT NULL
)

# 중복 제거(DISTINCT)
SELECT JOB FROM EMP;

#EX EMP 테이블에 저장된 직급의 종류를 조회
SELECT DISTINCT JOB FROM EMP;

SELECT DISTINCT
DEPTNO FROM EMP;

#DISTINCT 키워드는 하나만 붙이면 조회하는 모든 컬럼에 적용
#모든 컬럼의 값이 일치하는 행을 중복으로 처리
SELECT DISTINCT JOB, DEPTNO FROM EMP;

####################################################

# 1. 수치 관련 함수
# CEIL : 올림, FLOOR 버림, ROUND : 반올림
SELECT 70.5, CEIL(70.3), FLOOR(70.7), ROUND(70.5);

# TRUNCATE(숫자, 소수점자리) : 소수점자리까지
SELECT TRUNCATE(123.456, 1)
      ,TRUNCATE(123.456, 2)
      ,ROUND(123.456)
      ,ROUND(123.456, 1)

# MOD연산자(나머지 연산)
SELECT MOD(10, 4); #2

#EMP 테이블에서 사번이 짝수인 사원의 모든 정보를 조회
SELECT * FROM EMP
WHERE MOD(EMPNO, 2) = 0

#문자 관련 함수
#1. 문자 일부 추출
#SUBSTR(), SUBSTRING()
SELECT SUBSTR('ABCDE', 3)
	 , SUBSTR('ABCDE',2 ,3)
	 , SUBSTRING('ABCDE', 3)
	 , SUBSTRING('ABCDE',2,3)
	 
#2. 대소문자 변경 함수
# UPPER(문자) : 문자를 대문자로 변경	
# LOWER(문자) : 문자를 소문자로 변경
SELECT 'Hello World', UPPER('Hello World'), LOWER('Hello World');

#모든 대소문자 구분없이 검색
SELECT *
FROM BOARD
WHERE LOWER(TITLE) %hello%

#3. 공백 제거
# TRIM(문자), LTRIM(문자), RTRIM(문자)
SELECT TRIM(' DB '), LTRIM(' DB '), RTRIM(' DB '); #모든공백,왼쪽공백,오른쪽공백지움

#4. 글자 수 및 크기 확인
# 영어는 글자당 1BYTE, 한글은 글자당 3BYTE (DB마다 다름)
SELECT CHAR_LENGTH('HELLO'), LENGTHB('헬로');

#5. 문자 나열 함수
SELECT CONCAT('A','B','C');
SELECT CONCAT(ENAME, '직원은 급여가',)FROM EMP;

#6. 자릿수 채우기
# LPAD(문자, 글자수, 채울문자)
# RPAD(문자, 글자수, 채울문자)
SELECT LPAD('ABC', 5, '1'), RPAD('ABC', 5, '1') #5자리 맞추고 남는자리는 3번째 변수가 채워줌

#7. 문자 대체 함수
SELECT REPLACE('나는 JAVA(을)를 잘 한다', 'JAVA', 'PYTHON')

#8(시험) 논리함수
#8-1. IF(조건, 참일 때 값, 거짓일 때 값);
SELECT IF(10>2, '참','거짓');

#8-2. IFNULL(데이터, NULL일 때 대체 데이터)
# ORACLE 디비에서는 IFULL() 함수가 없음, 대신 NVL() 함수를 사용함. 기능은 동일\
SELECT EMPNO, ENAME, COMM, IFNULL(COMM,0), NVL(COMM,0)FROM EMP;

#8-3. CASE 문법 
#EX> 부서번호가 10 => 개발부 , 20 => 영업부, 30 => 인사부
SELECT ENAME, DEPTNO, IF(DEPTNO = 10, '개발부', '영업부') AS '부서명' FROM EMP;

#EX
SELECT ENAME
    , DEPTNO 
    , CASE DEPTNO
    	WHEN 10 THEN '개발부'
    	WHEN 20 THEN '영업부'
    	ELSE '인사부' 
      END 부서명 
          , CASE DEPTNO
    	WHEN DEPTNO = 10 THEN '개발부'
    	WHEN DEPTNO = 20 THEN '영업부'
    	ELSE '인사부' 
      END 부서명
FROM EMP;
#########################################################################
#연습문제
CREATE TABLE BOOK_STORE (
    BOOK_ID INT PRIMARY KEY,        -- 도서 번호
    TITLE VARCHAR(100),             -- 도서 제목
    AUTHOR VARCHAR(50),             -- 저자
    CATEGORY VARCHAR(20),           -- 카테고리
    PRICE DECIMAL(10, 2),           -- 가격
    STOCK INT,                      -- 재고 수량
    DISCOUNT_RATE DOUBLE            -- 할인율 (예: 0.15는 15%)
);

INSERT INTO BOOK_STORE VALUES 
(101, '  Java Programming  ', 'KIM', 'IT', 35000.55, 12, 0.1),
(102, 'Python Master', 'LEE', 'IT', 28000.40, 5, 0.2),
(103, 'SQL Beginner', 'PARK', 'DB', 22000.00, 3, NULL),
(104, 'The Great Gatsby', 'F. Scott', 'NOVEL', 15000.80, 8, 0.05),
(105, 'Data Science 101', 'CHOI', 'IT', 42000.00, 0, 0.3),
(106, 'Learning SQL', 'KIM', 'DB', 31000.25, 11, NULL);
SELECT *FROM BOOK_STORE;

#[Part 1: 중복 제거 및 수치 함수]
#BOOK_STORE 테이블에 있는 카테고리의 종류를 중복 없이 조회하세요.
SELECT DISTINCT CATEGORY
FROM BOOK_STORE;

#모든 도서의 가격(PRICE)을 소수점 첫째 자리에서 반올림하여 조회하세요.
SELECT ROUND(PRICE,1)
FROM BOOK_STORE;

#도서 번호(BOOK_ID)가 홀수인 도서들의 제목과 저자를 조회하세요.
SELECT TITLE, AUTHOR
FROM BOOK_STORE
WHERE MOD(BOOK_ID, 2) = 1;

#가격(PRICE)을 소수점 이하를 버리고(FLOOR) '정수가격'이라는 별칭으로 조회하세요.
SELECT FLOOR(PRICE) '정수가격' FROM BOOK_STORE;

#[Part 2: 문자 함수]
#도서 제목(TITLE)의 좌우 공백을 제거하고, 모두 대문자로 변환하여 조회하세요.
SELECT UPPER(TRIM(TITLE))
FROM BOOK_STORE;


#저자(AUTHOR)의 이름이 3글자 이상이라면, 앞의 2글자만 추출하여 조회하세요.
SELECT IF(CHAR_LENGTH(AUTHOR) >= 3, SUBRSTR(AUTHOR,1,2), AUTHOR)
FROM BOOK_STORE;

#제목(TITLE)에 있는 'SQL'이라는 단어를 'DATABASE'로 교체하여 조회하세요.
SELECT REPLACE(TITLE, 'SQL','DATABASE')
FROM BOOK_STORE;
#저자(AUTHOR) 이름의 오른쪽에 '*'를 채워 총 5글자로 만드세요. (예: KIM -> KIM**)
SELECT RPAD(AUTHOR,5,'*')
FROM BOOK_STORE;

#[Part 3: 논리 및 NULL 처리]
#DISCOUNT_RATE(할인율)가 NULL인 경우 0으로 표시하고, '할인율'이라는 별칭으로 조회하세요.
SELECT NVL(DISCOUNT_RATE,0) 할인율
FROM BOOK_STORE;

#IF 함수를 사용하여 재고(STOCK)가 0이면 '품절', 아니면 **'판매중'**이라고 표시되는 컬럼을 추가하세요.
SELECT *, IF(STOCK=0,'품절','판매중')
FROM BOOK_STORE;

#CASE 문을 사용하여 카테고리별 위치를 출력하세요.
#IT -> 1층 로비
#DB -> 2층 사무실
#NOVEL -> 3층 서고
#그 외 -> 기타
SELECT  DISTINCT  CATEGORY
	 , CASE CATEGORY
	 WHEN 'IT' THEN '1층 로비'
	 WHEN 'DB' THEN '2층 사무실'
	 WHEN 'NOVEL'THEN '3층 서고'
	 ELSE '기타' END '위치'
FROM BOOK_STORE;


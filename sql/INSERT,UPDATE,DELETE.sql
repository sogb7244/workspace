# 주석
# 현재 쿼리 실행 : ctrl + enter
# 폰트 크기 변경 :ctrl + '+' or '-'
# 드래그 영역 실행 : ALT + x
SELECT * FROM emp;
# 데이터 삽입, 삭제, 수정 쿼리

CREATE TABLE STUDENT (
	STU_NUM INT PRIMARY KEY #중복 불가, NULL도 못들어옴
	, STU_NAME VARCHAR(30)
	, KOR_SCORE INT 
	, ENG_SCORE INT 
);

SELECT * FROM STUDENT;

	# 데이터 삽입 : INSERT
# INSERT INTO 테이블명 (컬럼명) VALUES (저장할 데이터);
# INSERT문에서 나열한 컬럼 순서에 맞게 데이터를 추가한다.
# INSERT 시 모든 컬럼에 데이터를 넣을 필요는 없다. 단, 지정하지 않은 컬럼에는 NULL데이터가 들어감
INSERT INTO STUDENT (STU_NUM, STU_NAME, KOR_SCORE, ENG_SCORE)
VALUES (1, '김자바', 80, 80);

INSERT INTO STUDENT (KOR_SCORE, ENG_SCORE, STU_NUM, STU_NAME)
VALUES (90, 70, 2, '박자바');

INSERT INTO STUDENT (STU_NUM, STU_NAME)
VALUES (3,'이자바');

INSERT INTO STUDENT (STU_NUM, STU_NAME)
VALUES (4,'윤자바');

INSERT INTO STUDENT (stu_name,kor_score,stu_num)
VALUES ('정자바',85,7);

SELECT * FROM student;

# 취소 : ROLLBACK
# 확정 : COMMIT
ROLLBACK;

INSERT INTO STUDENT VALUES (10, 'kim' ,60 ,90);
INSERT INTO STUDENT VALUES (11, 'kim1' ,80 ,90);
INSERT INTO STUDENT VALUES (12, 'kim2' ,90 ,90);
INSERT INTO STUDENT VALUES (13, 'kim3' ,100 ,90);
INSERT INTO STUDENT VALUES (14, 'kim4' ,70 ,90);
COMMIT;

# 데이터 삭제 : DELETE
# DELETE FROM 테이블명 WHERE 조건;

DELETE FROM STUDENT;
DELETE FROM STUDENT WHERE ENG_SCORE  >= 90;

#데이터 수정 : UPDATE
#학번이 10번인 학생의 이름은 'AAA', 국어점수는 100점으로 변경
UPDATE STUDENT 
SET
STU_NAME = 'AAA',
KOR_SCORE = 100
WHERE STU_NUM = 10;

SELECT * FROM student;
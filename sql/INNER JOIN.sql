# 별칭 사용법
SELECT EMP.EMPNO, EMP.ENAME, EMP.SAL
FROM EMP;

# 테이블에 별칭 줄 때는 AS 키워드 붙이지 마세요! // ORACLE은 붙이면 오류남
SELECT E.EMPNO, E.ENAME, E.SAL 
FROM EMP E; # 별칭은 간단히

# JOIN(조인) : 둘 이상의 테이블에서 데이터를 조회할 때 사용하는 문법
SELECT * FROM EMP;
SELECT * FROM DEPT;

# CROSS JOIN - 사용못하는 JOIN
# 사번, 사원명, 급여, 부서명, 지역 조회
# 두 테이블에 공통으로 존재하는 컬럼 조회 시 주의 필요함 (객체명을 써줘야함)
SELECT EMPNO, ENAME, SAL, DNAME, LOC, EMP.DEPTNO
FROM EMP, DEPT

# Inner Join 
# 조인 조건 : 조인하고자 하는 두 테이블이 공통으로 가진 컬럼이 같은 값만 조회한다는 조건 추가
SELECT EMPNO, ENAME, SAL, DNAME, LOC, D.DEPTNO, E.DEPTNO
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO;


# 직급이 사원이 아닌 직원의 사번, 사원명, 직급, 부서번호, 부서명 조회
SELECT EMPNO, ENAME, JOB, E.DEPTNO, D.DNAME
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO
AND JOB != '사원';

# ANSI 문법
SELECT EMPNO, ENAME, JOB, E.DEPTNO, D.DNAME
FROM EMP E INNER JOIN  DEPT D
ON E.DEPTNO = D.DEPTNO
WHERE JOB != '사원';

# 부서번호가 10번 혹은 20번인 직원의 사번, 사원명, 부서명, 부서의 지역을 조회
SELECT EMPNO, ENAME, JOB, D.LOC
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO 
AND E.DEPTNO IN(10,20) #(밑에랑 같은 것임)
#AND (E.DEPTNO =10 OR E.DEPTNO =20);

#ANSI 문법의 JOIN
#ANSI - 국제표준으로 만들어 놓은 SQL 문법
#ANSI문법은 국제표준이기 때문에 DB종류와 상관없이 모든 디비에서 공통으로 사용할 수 있는 문법
#위에서 배운 JOIN문법은 ORACLE, MARIADB, MYSQL 디비의 JOIN문법
SELECT EMPNO, ENAME, E.DEPTNO, DNAME
FROM EMP E INNER JOIN DEPT D;
ON E.DEPTNO = D.DEPTNO;

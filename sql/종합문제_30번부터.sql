-- 21.08.20 1차 --------------------------------------------------------------------
--30> 모든 사원의 급여 최고액,최저액,총액 및 평균액을 출력하되 
-- 각 컬럼명을 Maximum,Minimum,Sum,Average로 지정하여 출력하라.
SELECT MAX(SAL) Maximum, MIN(SAL) Minimum, SUM(SAL) Sum, ROUND(AVG(SAL),2) Average
FROM EMP;

--31> 각 직업별로 급여 최저액.최고액,총액 및 평균액을 출력하라.
SELECT JOB, MIN(SAL) 최저액, MAX(SAL) 최고액, SUM(SAL) 총액, ROUND(AVG(SAL),2) 평균액
FROM EMP
GROUP BY JOB;

--32> 직업이 동일한 사람 수를 직업과 같이 출력하라.
SELECT JOB, COUNT(*)
FROM EMP
GROUP BY JOB;

--33> 관리자의 수를 출력하되, 관리자 번호가 중복되지 않게하라.
-- 그리고, 컬럼명을 Number of Manager로 지정하여 출력하라.
SELECT MGR, COUNT(*) "Number of Manager"
FROM EMP
GROUP BY MGR; 

-- 21.08.25 2차 --------------------------------------------------------------------
--34> 최고 급여와 최저 급여의 차액을 출력하라.
SELECT MAX(SAL), MIN(SAL)
FROM EMP;

--35> 관리자 번호 및 해당 관리자에 속한 사원들의 최저 급여를 출력하라.
-- 단, 관리자가 없는 사원 및 최저 급여가 1000 미만인 그룹은 제외시키고 
-- 급여를 기준으로 출력 결과를 내림차순으로 정렬하라.
SELECT MGR, MIN(SAL) 최저급여
FROM EMP
WHERE MGR IS NOT NULL
GROUP BY MGR
HAVING MIN(SAL) > 1000
ORDER BY 최저급여 DESC;

--36> 부서별로 부서이름, 부서위치, 사원 수 및 평균 급여를 출력하라.
-- 그리고 각각의 컬럼명을 부서명,위치,사원의 수,평균급여로 표시하라.
SELECT D.DNAME 부서명, D.LOC 위치, COUNT(E.EMPNO) "사원의 수", ROUND(AVG(E.SAL),2) 평균급여
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO
GROUP BY E.DEPTNO, D.DNAME, D.LOC;

--37> Smith와 동일한 부서에 속한 모든 사원의 이름 및 입사일을 출력하라.
-- 단, Smith는 제외하고 출력하시오
SELECT ENAME, HIREDATE
FROM EMP
WHERE DEPTNO = (SELECT DEPTNO FROM EMP WHERE ENAME = 'SMITH')
AND ENAME <> 'SMITH';

-- 21.08.30 3차 --------------------------------------------------------------------
--38> 자신의 급여가 평균 급여보다 많은 모든 사원의 사원 번호, 이름, 급여를 
--    표시하는 질의를 작성하고 급여를 기준으로 결과를 내림차순으로 정렬하라.
SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE SAL > (SELECT AVG(SAL) FROM EMP)
ORDER BY SAL DESC;

--39> 이름에 T가 들어가는 사원의 속한 부서에서 근무하는 모든 사원의 사원번호
-- 및 이름을 출력하라.
SELECT EMPNO, ENAME
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO
AND D.DNAME LIKE '%T%';

--40> 부서위치가 Dallas인 모든 사원의 이름,부서번호 및 직위를 출력하라.
SELECT E.ENAME, E.DEPTNO, E.JOB
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO
AND LOC = 'DALLAS';

--41> KING에게 보고하는 모든 사원의 이름과 급여를 출력하라.
SELECT ENAME, SAL
FROM EMP
WHERE MGR = (SELECT EMPNO FROM EMP WHERE ENAME = 'KING');

-- 21.03.02 4차 --------------------------------------------------------------------
--42> Sales 부서의 모든 사원에 대한 부서번호, 이름 및 직위를 출력하라.


--43> 자신의 급여가 평균 급여보다 많고 이름에 T가 들어가는 사원과 동일한
-- 부서에 근무하는 모든 사원의 사원 번호, 이름 및 급여를 출력하라.


--44> 커미션을 받는 사원과 급여가 일치하는 사원의 이름,부서번호,급여를 
-- 출력하라.


--45> Dallas에서 근무하는 사원과 직업이 일치하는 사원의 이름,부서이름,
--     및 급여를 출력하시오


--46> Scott과 동일한 급여 및 커미션을 받는 모든 사원의 이름, 입사일 및 
-- 급여를 출력하시오


--47> 직업이 Clerk 인 사원들보다 더 많은 급여를 받는 사원의 사원번호,
-- 이름, 급여를 출력하되, 결과를 급여가 높은 순으로 정렬하라.

		
--48> 이름에 A가 들어가는 사원과 같은 직업을 가진 사원의 이름과
-- 월급, 부서번호를 출력하라.


--49> New  York 에서 근무하는 사원과 급여 및 커미션이 같은 사원의 
-- 사원이름과 부서명을 출력하라.



--50> Dallas에서 근무하는 사원과 직업 및 관리자가 같은 사원의 사원번호,사원이름,
--    직업,월급,부서명,커미션을 출력하되 커미션이 책정되지 않은 사원은 NoCommission
--    으로 표시하고, 커미션의 컬럼명은 Comm으로 나오게 출력하시오.
--    단, 최고월급부터 출력되게 하시오


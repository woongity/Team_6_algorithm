--30> 모든 사원의 급여 최고액,최저액,총액 및 평균액을 출력하되 
-- 각 컬럼명을 Maximum,Minimum,Sum,Average로 지정하여 출력하라.
SELECT * FROM EMPLOYEES;

SELECT MAX(SALARY) Maximum, MIN(SALARY) Minimum, SUM(SALARY) Sum, ROUND(AVG(SALARY),2) Average
FROM EMPLOYEES;

--31> 각 직업별로 급여 최저액.최고액,총액 및 평균액을 출력하라.
SELECT JOB_ID, MIN(SALARY) 최저액, MAX(SALARY) 최고액, SUM(SALARY) 총액, ROUND(AVG(SALARY),2) 평균액
FROM EMPLOYEES
GROUP BY JOB_ID;

--32> 직업이 동일한 사람 수를 직업과 같이 출력하라.
SELECT JOB_ID, COUNT(*)
FROM EMPLOYEES
GROUP BY JOB_ID;

--33> 관리자의 수를 출력하되, 관리자 번호가 중복되지 않게하라.
-- 그리고, 컬럼명을 Number of Manager로 지정하여 출력하라.
SELECT MANAGER_ID, COUNT(*) "Number of Manager"
FROM EMPLOYEES
GROUP BY MANAGER_ID; 
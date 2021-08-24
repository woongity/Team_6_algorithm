--1> 부서테이블의 모든 데이터를 출력하라.
select * 
from dept;

--2> EMP테이블에서 각 사원의 직업, 사원번호, 이름, 입사일을 출력하라.
select job, empno, ename, hiredate 
from emp;

--3> EMP테이블에서 직업을 출력하되, 각 항목(ROW)가 중복되지 않게
-- 출력하라.
select distinct job 
from emp;

--4> 급여가 2850 이상인 사원의 이름 및 급여를 출력하라.
select ename, sal
from emp
where sal >= 2850;

--5> 사원번호가 7566인 사원의 이름 및 부서번호를 출력하라.
select ename, deptno
from emp
where empno = 7566;

--6> 급여가 1500이상 ~ 2850이하의 범위에 속하지 않는 모든 사원의 이름
-- 및 급여를 출력하라.
select ename, sal
from emp
where not(sal between 1500 and 2850);

--7> 1981년 2월 20일 ~ 1981년 5월 1일에 입사한 사원의 이름,직업 및 
--입사일을 출력하라. 입사일을 기준으로 해서 오름차순으로 정렬하라.
select ename, job, hiredate
from emp
where hiredate between '810220' and '810501'
order by hiredate asc;

--8> 10번 및 30번 부서에 속하는 모든 사원의 이름과 부서 번호를
-- 출력하되, 이름을 알파벳순으로 정렬하여 출력하라.
select ename, deptno
from emp
where deptno = 10 or deptno = 30
order by ename asc;

--9> 10번 및 30번 부서에 속하는 모든 사원 중 급여가 1500을 넘는
-- 사원의 이름 및 급여를 출력하라.
--(단 컬럼명을 각각 employee 및 Monthly Salary로 지정하시오)
select ename as "employee", sal as "Monthly Salary"
from emp
where deptno = 10 or deptno = 30;

--10> 관리자가 없는 모든 사원의 이름 및 직위를 출력하라.
select ename, job
from emp
where mgr is null;

--11> 커미션을 받는 모든 사원의 이름, 급여 및 커미션을 출력하되, 
-- 급여를 기준으로 내림차순으로 정렬하여 출력하라.
select ename, sal, comm
from emp
order by sal desc;

--12> 이름의 세 번째 문자가 A인 모든 사원의 이름을 출력하라.
select ename
from emp
where ename like '__A%';

--13> 이름에 L이 두 번 들어가며 부서 30에 속해있는 사원의 이름을 
--출력하라.
select ename
from emp
where deptno = 30 and ename like '%L%L%';

--14> 직업이 Clerk 또는 Analyst 이면서 급여가 1000,3000,5000 이 
-- 아닌 모든 사원의 이름, 직업 및 급여를 출력하라.
select ename, job, sal
from emp
where job in ('CLERK', 'ALANYST') and sal not in (1000, 3000, 5000);

--15> 사원번호, 이름, 급여 그리고 15%인상된 급여를 정수로 표시하되 
--컬럼명을 New Salary로 지정하여 출력하라.
select empno, ename, sal, trunc(sal * 1.15) as "New Salary"
from emp;

--16> 15번 문제와 동일한 데이타에서 급여 인상분(새 급여에서 이전 
-- 급여를 뺀 값)을 추가해서 출력하라.(컬럼명은 Increase로 하라).
select empno, ename, sal, trunc(sal * 0.15) as "Increase"
from emp;

--18> 모든 사원의 이름(첫 글자는 
-- 대문자로, 나머지 글자는 소문자로 표시) 및 이름 길이를 표시하는
-- 쿼리를 작성하고 컬럼 별칭은 적당히 넣어서 출력하라.
select initcap(ename), length(ename) as "Name Length"
from emp;


--19> 사원의 이름과 커미션을 출력하되, 커미션이 책정되지 않은 
-- 사원의 커미션은 'no commission'으로 출력하라.
select ename, concat('no commission', comm), lpad('no commission', 13, 1)
from emp
where comm is null;


--20> 모든 사원의 이름,부서번호,부서이름을 표시하는 질의를 작성하라.
select e.ename, e.empno, e.deptno, d.dname
from emp e, dept d
where e.deptno = d.deptno;


--21> 30번 부서에 속한 사원의 이름과 부서번호 그리고 부서이름을 출력하라.
select e.ename, e.deptno, d.dname
from emp e, dept d
where e.deptno = d.deptno and d.deptno = 30;


--22> 30번 부서에 속한 사원들의 모든 직업과 부서위치를 출력하라.
--(단, 직업 목록이 중복되지 않게 하라.)


--23> 커미션이 책정되어 있는 모든 사원의 이름, 부서이름 및 위치를 출력하라.


--24> 이름에 A가 들어가는 모든 사원의 이름과 부서 이름을 출력하라.


--25> Dallas에서 근무하는 모든 사원의 이름, 직업, 부서번호 및 부서이름을 
-- 출력하라.


--26> 사원이름 및 사원번호, 해당 관리자이름 및 관리자 번호를 출력하되,
-- 각 컬럼명을 employee,emp#,manager,mgr#으로 표시하여 출력하라.

--27> 모든 사원의 이름,직업,부서이름,급여 및 등급을 출력하라.


--28> Smith보다 늦게 입사한 사원의 이름 및 입사일을 출력하라.

--29> 자신의 관리자보다 먼저 입사한 모든 사원의 이름, 입사일, 
-- 관리자의 이름, 관리자의 입사일을 출력하되 각각 컬럼명을 
-- Employee,EmpHiredate, Manager,MgrHiredate로 표시하여 
-- 출력하라.


--30> 모든 사원의 급여 최고액,최저액,총액 및 평균액을 출력하되 
-- 각 컬럼명을 Maximum,Minimum,Sum,Average로 지정하여 출력하라.
select max(sal) as Maximum, min(sal) as Minimum, sum(sal) as Sum, trunc(avg(sal)) as Average
from emp;

--31> 각 직업별로 급여 최저액.최고액,총액 및 평균액을 출력하라.
select  min(sal), max(sal), sum(sal), trunc(avg(sal))
from emp
group by job;

--32> 직업이 동일한 사람 수를 직업과 같이 출력하라.
select count(empno), job
from emp
group by job;

--33> 관리자의 수를 출력하되, 관리자 번호가 중복되지 않게하라.
-- 그리고, 컬럼명을 Number of Manager로 지정하여 출력하라.
select distinct count(mgr) as "Number of Manager"
from emp;

--34> 최고 급여와 최저 급여의 차액을 출력하라.
select max(sal) - min(sal)
from emp;

--35> 관리자 번호 및 해당 관리자에 속한 사원들의 최저 급여를 출력하라.
-- 단, 관리자가 없는 사원 및 최저 급여가 1000 미만인 그룹은 제외시키고 
-- 급여를 기준으로 출력 결과를 내림차순으로 정렬하라.


--36> 부서별로 부서이름, 부서위치, 사원 수 및 평균 급여를 출력하라.
-- 그리고 각각의 컬럼명을 부서명,위치,사원의 수,평균급여로 표시하라.


--37> Smith와 동일한 부서에 속한 모든 사원의 이름 및 입사일을 출력하라.
-- 단, Smith는 제외하고 출력하시오


--38> 자신의 급여가 평균 급여보다 많은 모든 사원의 사원 번호, 이름, 급여를 
--    표시하는 질의를 작성하고 급여를 기준으로 결과를 내림차순으로 정렬하라.


--39> 이름에 T가 들어가는 사원의 속한 부서에서 근무하는 모든 사원의 사원번호
-- 및 이름을 출력하라.


--40> 부서위치가 Dallas인 모든 사원의 이름,부서번호 및 직위를 출력하라.


--41> KING에게 보고하는 모든 사원의 이름과 급여를 출력하라.


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



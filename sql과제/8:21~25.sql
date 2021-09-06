---1 -----
select * from department;

----2-----
select job,empno, ename, hiredate
from emp;

---- 3 -----
select distinct job 
from emp
order by job;

---4 ----
select ename, sal 
from emp
where sal>=2850;

---5 ----
select ename, deptno 
from emp
where empno=7566;

---- 6----
select ename, sal 
from emp
where sal not between 1500 and 2850;

---- 7 -----

select ename, job, hiredate 
from emp
where hiredate between '81/2/20' and '81/5/21'
order by hiredate;

---- 8-----
select ename, deptno 
from emp
where deptno=10 or deptno=30
order by ename;

---- 9 ----

select ename employee, deptno Montly_Salary
from emp
where sal>1500;

---- 10 -----
select ename, job
from emp
where mgr is null;

--11> 커미션을 받는 모든 사원의 이름, 급여 및 커미션을 출력하되, 
-- 급여를 기준으로 내림차순으로 정렬하여 출력하라.

select ename, sal, comm
from emp
where comm is not null and comm!=0
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

select ename, job,sal
from emp
where job in ('CLERK','ANALYST') and sal not in (1000,3000,5000);

--15> 사원번호, 이름, 급여 그리고 15%인상된 급여를 정수로 표시하되 
--컬럼명을 New Salary로 지정하여 출력하라.

select empno, ename, sal, round(sal*1.15,0) New_Salary
from emp;

--16> 15번 문제와 동일한 데이타에서 급여 인상분(새 급여에서 이전 
-- 급여를 뺀 값)을 추가해서 출력하라.(컬럼명은 Increase로 하라). 

select empno, ename, round(sal*1.15,0)-sal Increase
from emp;

--18> 모든 사원의 이름(첫 글자는 
-- 대문자로, 나머지 글자는 소문자로 표시) 및 이름 길이를 표시하는
-- 쿼리를 작성하고 컬럼 별칭은 적당히 넣어서 출력하라.

select initcap(ename)
from emp;

--19> 사원의 이름과 커미션을 출력하되, 커미션이 책정되지 않은 
-- 사원의 커미션은 'no commission'으로 출력하라.

select ename, decode(comm, null,'no commission',comm)
from emp;

--20> 모든 사원의 이름,부서번호,부서이름을 표시하는 질의를 작성하라.

select e.ename, e.deptno, d.dname 
from emp e join dept d on e.deptno=d.deptno;

--21> 30번 부서에 속한 사원의 이름과 부서번호 그리고 부서이름을 출력하라.

select e.ename, e.deptno, d.dname 
from emp e join dept d on e.deptno=d.deptno
where d.deptno=30;

--22> 30번 부서에 속한 사원들의 모든 직업과 부서위치를 출력하라.
--(단, 직업 목록이 중복되지 않게 하라.)

select distinct e.job, d.loc 
from emp e join dept d on e.deptno=d.deptno
where d.deptno=30;

--23> 커미션이 책정되어 있는 모든 사원의 이름, 부서이름 및 위치를 출력하라.

select e.ename, d.dname,d.loc 
from emp e join dept d on e.deptno=d.deptno
where e.comm is not null;

--24> 이름에 A가 들어가는 모든 사원의 이름과 부서 이름을 출력하라.

select e.ename, d.dname
from emp e join dept d on e.deptno = d.deptno
where e.ename like '%A%';

--25> Dallas에서 근무하는 모든 사원의 이름, 직업, 부서번호 및 부서이름을 
-- 출력하라.

select e.ename, e.job, d.deptno, d.dname
from emp e join dept d on e.deptno = d.deptno
where lower(d.loc) = 'dallas';


--26> 사원이름 및 사원번호, 해당 관리자이름 및 관리자 번호를 출력하되,
-- 각 컬럼명을 employee,emp#,manager,mgr#으로 표시하여 출력하라.

select e1.ename employee, e1.empno emp#, e2.ename, e2.empno 
from emp e1 join emp e2 on e1.mgr = e2.empno;

--27> 모든 사원의 이름,직업,부서이름,급여 및 등급을 출력하라.
select e.ename, e.job, d.dname, e.sal, s.grade
from emp e join dept d on e.deptno = d.deptno, salgrade s
where e.sal between s.losal and s.hisal;

--28> Smith보다 늦게 입사한 사원의 이름 및 입사일을 출력하라.
select ename, hiredate
from emp
where to_date(hiredate)>to_date((select hiredate from emp where ename='SMITH'));

--29> 자신의 관리자보다 먼저 입사한 모든 사원의 이름, 입사일, 
-- 관리자의 이름, 관리자의 입사일을 출력하되 각각 컬럼명을 
-- Employee,EmpHiredate, Manager,MgrHiredate로 표시하여 
-- 출력하라.

select e1.ename employee, e1.hiredate emphiredate, e2.ename manager,e2.hiredate mgrhiredate  
from emp e1 join emp e2 
on e1.mgr = e2.empno
where to_date(e1.hiredate)<to_date(e2.hiredate);


--30> 모든 사원의 급여 최고액,최저액,총액 및 평균액을 출력하되 
-- 각 컬럼명을 Maximum,Minimum,Sum,Average로 지정하여 출력하라

select max(sal), min(sal), sum(sal), round(avg(sal))
from emp;

--31> 각 직업별로 급여 최저액.최고액,총액 및 평균액을 출력하라.
select job,max(sal), min(sal), sum(sal), round(avg(sal))
from emp
group by job;

--32> 직업이 동일한 사람 수를 직업과 같이 출력하라.

select job, count(job)
from emp
group by job;

--33> 관리자의 수를 출력하되, 관리자 번호가 중복되지 않게하라.
-- 그리고, 컬럼명을 Number of Manager로 지정하여 출력하라.

select count(distinct(mgr)) number_of_manager
from emp;

--34> 최고 급여와 최저 급여의 차액을 출력하라.

select max(sal)-min(sal)
from emp;

--35> 관리자 번호 및 해당 관리자에 속한 사원들의 최저 급여를 출력하라.
-- 단, 관리자가 없는 사원 및 최저 급여가 1000 미만인 그룹은 제외시키고 
-- 급여를 기준으로 출력 결과를 내림차순으로 정렬하라.

select e2.empno,min(e2.sal)
from emp e1 join emp e2 
on e1.mgr = e2.empno
group by e2.empno
having min(e2.sal)>=1000
order by min(e2.sal);

--36> 부서별로 부서이름, 부서위치, 사원 수 및 평균 급여를 출력하라.
-- 그리고 각각의 컬럼명을 부서명,위치,사원의 수,평균급여로 표시하라.

select dname, loc, avg(sal), count( 
from emp e1 join 

--37> Smith와 동일한 부서에 속한 모든 사원의 이름 및 입사일을 출력하라.
-- 단, Smith는 제외하고 출력하시오
-- e1: SMITH
-- e2: SMITH와 동일한 부서에 속한 사원
select e2.ename, e2.hiredate
from emp e1, emp e2
where e1.ename = 'SMITH' and e1.deptno = e2.deptno and e2.ename != 'SMITH';


--38> 자신의 급여가 평균 급여보다 많은 모든 사원의 사원 번호, 이름, 급여를 
--    표시하는 질의를 작성하고 급여를 기준으로 결과를 내림차순으로 정렬하라.
select empno, ename, sal
from emp
where sal > (select avg(sal) from emp)
order by sal desc;

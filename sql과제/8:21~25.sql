--30

select max(sal) Maximum,min(sal) Minimum, sum(sal) Sum, avg(sal) Average
from emp;

-- 31
select * from emp;
select max(sal) Maximum,min(sal) Minimum, sum(sal) Sum, avg(sal) Average
from emp
group by job; 

-- 32 

select count(job), job
from emp
group by job;

-- 33 

select count(distinct(mgr)) Number_of_Manager
from emp;
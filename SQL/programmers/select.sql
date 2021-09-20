-------------------SELECT-------------------

--1.모든 레코드 조회하기
select * from ANIMAL_INS
order by ANIMAL_ID;

--2. 역순 정렬하기
select NAME, DATETIME from ANIMAL_INS
order by ANIMAL_ID desc;

--3. 아픈 동물 찾기
select ANIMAL_ID, NAME from ANIMAL_INS
where INTAKE_CONDITION = "Sick";

--4. 어린 동물 찾기
select ANIMAL_ID, NAME from ANIMAL_INS
where INTAKE_CONDITION <> 'Aged'
order by ANIMAL_ID;

--5. 동물의 아이디와 이름
select ANIMAL_ID, NAME from ANIMAL_INS
order by ANIMAL_ID;

--6. 여러 기준으로 정렬하기
select ANIMAL_ID, NAME, DATETIME from ANIMAL_INS
order by NAME, DATETIME desc;

--7. 상위 n개 레코드
select NAME from ANIMAL_INS
order by DATETIME
limit 1;

-------------------SUM, MAX, MIN-------------------

--1. 최댓값 구하기
select DATETIME from ANIMAL_INS
order by DATETIME desc
limit 1;

--2. 최솟값 구하기
select DATETIME as '시간'
from ANIMAL_INS
order by DATETIME limit 1;

--3. 동물 수 구하기
select count(*) as 'count'
from ANIMAL_INS;

--4. 중복 제거하기
select count(distinct NAME) as 'count'
from ANIMAL_INS;

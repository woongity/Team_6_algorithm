--1.모든 레코드 조회하기
select * from ANIMAL_INS
order by ANIMAL_ID;

--2. 역순 정렬하기
select NAME, DATETIME from ANIMAL_INS
order by ANIMAL_ID desc;

--3. 아픈 동물 찾기
select ANIMAL_ID, NAME from ANIMAL_INS
where INTAKE_CONDITION = "Sick";
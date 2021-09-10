[프로그래머스: SQL 고득점 Kit: SELECT 문제](https://programmers.co.kr/learn/courses/30/parts/17042)

---

### **TABLE INFO**

ANIMAL\_INS 테이블은 동물 보호소에 들어온 동물의 정보를 담은 테이블입니다. ANIMAL\_INS 테이블 구조는 다음과 같으며, ANIMAL\_ID, ANIMAL\_TYPE, DATETIME, INTAKE\_CONDITION, NAME, SEX\_UPON\_INTAKE는 각각 동물의 아이디, 생물 종, 보호 시작일, 보호 시작 시 상태, 이름, 성별 및 중성화 여부를 나타냅니다.

<table style="border-collapse: collapse; width: 57.3082%; height: 133px;" border="1" data-ke-align="alignLeft"><tbody><tr><td style="width: 38.1339%;"><span style="color: #000000;"><b>NAME</b></span></td><td style="width: 35.6998%;"><span style="color: #000000;"><b>TYPE</b></span></td><td style="width: 25.9635%;"><span style="color: #000000;"><b>NULLABLE</b></span></td></tr><tr><td style="width: 38.1339%;"><span style="color: #000000;">ANIMAL_ID</span></td><td style="width: 35.6998%;"><span style="color: #000000;">VARCHAR(N)</span></td><td style="width: 25.9635%;"><span style="color: #000000;">FALSE</span></td></tr><tr><td style="width: 38.1339%;"><span style="color: #000000;">ANIMAL_TYPE</span></td><td style="width: 35.6998%;"><span style="color: #000000;">VARCHAR(N)</span></td><td style="width: 25.9635%;"><span style="color: #000000;">FALSE</span></td></tr><tr><td style="width: 38.1339%;"><span style="color: #000000;">DATETIME</span></td><td style="width: 35.6998%;"><span style="color: #000000;">DATETIME</span></td><td style="width: 25.9635%;"><span style="color: #000000;">FALSE</span></td></tr><tr><td style="width: 38.1339%;"><span style="color: #000000;">INTAKE_CONDITION</span></td><td style="width: 35.6998%;"><span style="color: #000000;">VARCHAR(N)</span></td><td style="width: 25.9635%;"><span style="color: #000000;">FALSE</span></td></tr><tr><td style="width: 38.1339%;"><span style="color: #000000;">NAME</span></td><td style="width: 35.6998%;"><span style="color: #000000;">VARCHAR(N)</span></td><td style="width: 25.9635%;"><span style="color: #000000;">TRUE</span></td></tr><tr><td style="width: 38.1339%;"><span style="color: #000000;">SEX_UPON_INTAKE</span></td><td style="width: 35.6998%;"><span style="color: #000000;">VARCHAR(N)</span></td><td style="width: 25.9635%;"><span style="color: #000000;">FALSE</span></td></tr></tbody></table>

---

# **모든 레코드 조회하기**

### **문제 설명**

동물 보호소에 들어온 모든 동물의 정보를 ANIMAL\_ID순으로 조회하는 SQL문을 작성해주세요. SQL을 실행하면 다음과 같이 출력되어야 합니다.

<table style="border-collapse: collapse; width: 90.814%;" border="1" data-ke-align="alignLeft"><tbody><tr><td style="width: 12.2093%;"><span style="color: #000000;"><b>ANIMAL_ID</b></span></td><td style="width: 13.9796%;"><span style="color: #000000;"><b>ANIMAL_TYPE</b></span></td><td style="width: 19.0437%;"><span style="color: #000000;"><b>DATETIME</b></span></td><td style="width: 19.0829%;"><span style="color: #000000;"><b>INTAKE_CONDITION</b></span></td><td style="width: 7.66125%;"><span style="color: #000000;"><b>NAME</b></span></td><td style="width: 18.8255%;"><span style="color: #000000;"><b>SEX_UPON_INTAKE</b></span></td></tr><tr><td style="width: 12.2093%;"><span style="color: #000000;">A349996</span></td><td style="width: 13.9796%;"><span style="color: #000000;">Cat</span></td><td style="width: 19.0437%;"><span style="color: #000000;">2018-01-22 14:32:00</span></td><td style="width: 19.0829%;"><span style="color: #000000;">Normal</span></td><td style="width: 7.66125%;"><span style="color: #000000;">Sugar</span></td><td style="width: 18.8255%;"><span style="color: #000000;">Neutered Male</span></td></tr><tr><td style="width: 12.2093%;"><span style="color: #000000;">A350276</span></td><td style="width: 13.9796%;"><span style="color: #000000;">Cat</span></td><td style="width: 19.0437%;"><span style="color: #000000;">2017-08-13 13:50:00</span></td><td style="width: 19.0829%;"><span style="color: #000000;">Normal</span></td><td style="width: 7.66125%;"><span style="color: #000000;">Jewel</span></td><td style="width: 18.8255%;"><span style="color: #000000;">Spayed Female</span></td></tr><tr><td style="width: 12.2093%;"><span style="color: #000000;">A350375</span></td><td style="width: 13.9796%;"><span style="color: #000000;">Cat</span></td><td style="width: 19.0437%;"><span style="color: #000000;">2017-03-06 15:01:00</span></td><td style="width: 19.0829%;"><span style="color: #000000;">Normal</span></td><td style="width: 7.66125%;"><span style="color: #000000;">Meo</span></td><td style="width: 18.8255%;"><span style="color: #000000;">Neutered Male</span></td></tr><tr><td style="width: 12.2093%;"><span style="color: #000000;">A352555</span></td><td style="width: 13.9796%;"><span style="color: #000000;">Dog</span></td><td style="width: 19.0437%;"><span style="color: #000000;">2014-08-08 04:20:00</span></td><td style="width: 19.0829%;"><span style="color: #000000;">Normal</span></td><td style="width: 7.66125%;"><span style="color: #000000;">Harley</span></td><td style="width: 18.8255%;"><span style="color: #000000;">Spayed Female</span></td></tr></tbody></table>

..이하 생략

### **나의 풀이**

```
SELECT *
FROM ANIMAL_INS
ORDER BY ANIMAL_ID;
```

---

# **역순 정렬하기**

### **문제 설명**

동물 보호소에 들어온 모든 동물의 이름과 보호 시작일을 조회하는 SQL문을 작성해주세요. 이때 결과는 ANIMAL\_ID 역순으로 보여주세요. SQL을 실행하면 다음과 같이 출력되어야 합니다.

<table style="border-collapse: collapse; width: 38.1395%; height: 105px;" border="1" data-ke-align="alignLeft"><tbody><tr><td style="width: 14.8837%;"><span style="color: #000000;"><b>NAME</b></span></td><td style="width: 23.0232%;"><span style="color: #000000;"><b>DATETIME</b></span></td></tr><tr style="height: 19px;"><td style="height: 19px; width: 14.8837%;"><span style="color: #000000;">Rocky</span></td><td style="height: 19px; width: 23.0232%;"><span style="color: #000000;">2016-06-07 09:17:00</span></td></tr><tr style="height: 19px;"><td style="height: 19px; width: 14.8837%;"><span style="color: #000000;">Shelly</span></td><td style="height: 19px; width: 23.0232%;"><span style="color: #000000;">2015-01-29 15:01:00</span></td></tr><tr style="height: 19px;"><td style="height: 19px; width: 14.8837%;"><span style="color: #000000;">Benji</span></td><td style="height: 19px; width: 23.0232%;"><span style="color: #000000;">2016-04-19 13:28:00</span></td></tr><tr style="height: 19px;"><td style="height: 19px; width: 14.8837%;"><span style="color: #000000;">Jackie</span></td><td style="height: 19px; width: 23.0232%;"><span style="color: #000000;">2016-01-03 16:25:00</span></td></tr><tr style="height: 19px;"><td style="height: 19px; width: 14.8837%;"><span style="color: #000000;">*Sam</span></td><td style="height: 19px; width: 23.0232%;"><span style="color: #000000;">2016-03-13 11:17:00</span></td></tr></tbody></table>

..이하 생략

### **나의 풀이**

```
SELECT NAME, DATETIME
FROM ANIMAL_INS
ORDER BY ANIMAL_ID DESC;
```

---

# **아픈 동물 찾기**

### **문제 설명**

동물 보호소에 들어온 동물 중 아픈 동물[1](https://programmers.co.kr/learn/courses/30/lessons/59036#fn1)의 아이디와 이름을 조회하는 SQL 문을 작성해주세요. 이때 결과는 아이디 순으로 조회해주세요.예시

예를 들어 ANIMAL\_INS 테이블이 다음과 같다면

<table style="border-collapse: collapse; width: 94.8837%;" border="1" data-ke-align="alignLeft"><tbody><tr><td style="width: 12.0081%;"><span style="color: #000000;"><b>ANIMAL_ID</b></span></td><td style="width: 14.3024%;"><span style="color: #000000;"><b>ANIMAL_TYPE</b></span></td><td style="width: 18.5733%;"><span style="color: #000000;"><b>DATETIME</b></span></td><td style="width: 19.6511%;"><span style="color: #000000;"><b>INTAKE_CONDITION</b></span></td><td style="width: 11.628%;"><span style="color: #000000;"><b>NAME</b></span></td><td style="width: 18.6046%;"><span style="color: #000000;"><b>SEX_UPON_INTAKE</b></span></td></tr><tr><td style="width: 12.0081%;"><span style="color: #000000;">A365172</span></td><td style="width: 14.3024%;"><span style="color: #000000;">Dog</span></td><td style="width: 18.5733%;"><span style="color: #000000;">2014-08-26 12:53:00</span></td><td style="width: 19.6511%;"><span style="color: #000000;">Normal</span></td><td style="width: 11.628%;"><span style="color: #000000;">Diablo</span></td><td style="width: 18.6046%;"><span style="color: #000000;">Neutered Male</span></td></tr><tr><td style="width: 12.0081%;"><span style="color: #000000;">A367012</span></td><td style="width: 14.3024%;"><span style="color: #000000;">Dog</span></td><td style="width: 18.5733%;"><span style="color: #000000;">2015-09-16 09:06:00</span></td><td style="width: 19.6511%;"><span style="color: #000000;">Sick</span></td><td style="width: 11.628%;"><span style="color: #000000;">Miller</span></td><td style="width: 18.6046%;"><span style="color: #000000;">Neutered Male</span></td></tr><tr><td style="width: 12.0081%;"><span style="color: #000000;">A365302</span></td><td style="width: 14.3024%;"><span style="color: #000000;">Dog</span></td><td style="width: 18.5733%;"><span style="color: #000000;">2017-01-08 16:34:00</span></td><td style="width: 19.6511%;"><span style="color: #000000;">Aged</span></td><td style="width: 11.628%;"><span style="color: #000000;">Minnie</span></td><td style="width: 18.6046%;"><span style="color: #000000;">Spayed Female</span></td></tr><tr><td style="width: 12.0081%;"><span style="color: #000000;">A381217</span></td><td style="width: 14.3024%;"><span style="color: #000000;">Dog</span></td><td style="width: 18.5733%;"><span style="color: #000000;">2017-07-08 09:41:00</span></td><td style="width: 19.6511%;"><span style="color: #000000;">Sick</span></td><td style="width: 11.628%;"><span style="color: #000000;">Cherokee</span></td><td style="width: 18.6046%;"><span style="color: #000000;">Neutered Male</span></td></tr></tbody></table>

이 중 아픈 동물은 Miller와 Cherokee입니다. 따라서 SQL문을 실행하면 다음과 같이 나와야 합니다.

<table style="border-collapse: collapse; width: 29.5349%; height: 57px;" border="1" data-ke-align="alignLeft"><tbody><tr style="height: 19px;"><td style="height: 19px; width: 15%;"><span style="color: #000000;"><b>ANIMAL_ID</b></span></td><td style="height: 19px; width: 14.3023%;"><span style="color: #000000;"><b>NAME</b></span></td></tr><tr style="height: 19px;"><td style="height: 19px; width: 15%;"><span style="color: #000000;">A367012</span></td><td style="height: 19px; width: 14.3023%;"><span style="color: #000000;">Miller</span></td></tr><tr style="height: 19px;"><td style="height: 19px; width: 15%;"><span style="color: #000000;">A381217</span></td><td style="height: 19px; width: 14.3023%;"><span style="color: #000000;">Cherokee</span></td></tr></tbody></table>

### **나의 풀이**

```
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE INTAKE_CONDITION = "Sick"
ORDER BY ANIMAL_ID;
```

---

# **어린 동물 찾기**

### **문제 설명**

동물 보호소에 들어온 동물 중 젊은 동물[1](https://programmers.co.kr/learn/courses/30/lessons/59037#fn1)의 아이디와 이름을 조회하는 SQL 문을 작성해주세요. 이때 결과는 아이디 순으로 조회해주세요.

**예시**

예를 들어 ANIMAL\_INS 테이블이 다음과 같다면

<table style="border-collapse: collapse; width: 100%;" border="1" data-ke-align="alignLeft"><tbody><tr><td><b><span style="color: #000000;"><span style="color: #000000;">ANIMAL_ID</span></span></b></td><td><b><span style="color: #000000;"><span style="color: #000000;">ANIMAL_TYPE</span></span></b></td><td><b><span style="color: #000000;"><span style="color: #000000;">DATETIME</span></span></b></td><td><b><span style="color: #000000;"><span style="color: #000000;">INTAKE_CONDITION</span></span></b></td><td><b><span style="color: #000000;"><span style="color: #000000;">NAME</span></span></b></td><td><b><span style="color: #000000;"><span style="color: #000000;">SEX_UPON_INTAKE</span></span></b></td></tr><tr><td><span style="color: #000000;">A365172</span></td><td><span style="color: #000000;">Dog</span></td><td><span style="color: #000000;">2014-08-26 12:53:00</span></td><td><span style="color: #000000;">Normal</span></td><td><span style="color: #000000;">Diablo</span></td><td><span style="color: #000000;">Neutered Male</span></td></tr><tr><td><span style="color: #000000;">A367012</span></td><td><span style="color: #000000;">Dog</span></td><td><span style="color: #000000;">2015-09-16 09:06:00</span></td><td><span style="color: #000000;">Sick</span></td><td><span style="color: #000000;">Miller</span></td><td><span style="color: #000000;">Neutered Male</span></td></tr><tr><td><span style="color: #000000;">A365302</span></td><td><span style="color: #000000;">Dog</span></td><td><span style="color: #000000;">2017-01-08 16:34:00</span></td><td><span style="color: #000000;">Aged</span></td><td><span style="color: #000000;">Minnie</span></td><td><span style="color: #000000;">Spayed Female</span></td></tr><tr><td><span style="color: #000000;">A381217</span></td><td><span style="color: #000000;">Dog</span></td><td><span style="color: #000000;">2017-07-08 09:41:00</span></td><td><span style="color: #000000;">Sick</span></td><td><span style="color: #000000;">Cherokee</span></td><td><span style="color: #000000;">Neutered Male</span></td></tr></tbody></table>

이 중 젊은 동물은 Diablo, Miller, Cherokee입니다. 따라서 SQL문을 실행하면 다음과 같이 나와야 합니다.

<table style="border-collapse: collapse; width: 32.7868%;" border="1" data-ke-align="alignLeft"><tbody><tr><td style="width: 15.1751%;"><b><span style="color: #000000;"><span style="color: #000000;">ANIMAL_ID</span></span></b></td><td style="width: 19.4553%;"><b><span style="color: #000000;"><span style="color: #000000;">NAME</span></span></b></td></tr><tr><td style="width: 15.1751%;"><span style="color: #000000;">A365172</span></td><td style="width: 19.4553%;"><span style="color: #000000;">Diablo</span></td></tr><tr><td style="width: 15.1751%;"><span style="color: #000000;">A367012</span></td><td style="width: 19.4553%;"><span style="color: #000000;">Miller</span></td></tr><tr><td style="width: 15.1751%;"><span style="color: #000000;">A381217</span></td><td style="width: 19.4553%;"><span style="color: #000000;">Cherokee</span></td></tr></tbody></table>

### **나의 풀이**

```
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE INTAKE_CONDITION != 'Aged'
ORDER BY ANIMAL_ID;
```

---

# **동물의 아이디와 이름**

### **문제 설명**

동물 보호소에 들어온 모든 동물의 아이디와 이름을 ANIMAL\_ID순으로 조회하는 SQL문을 작성해주세요. SQL을 실행하면 다음과 같이 출력되어야 합니다.

<table style="border-collapse: collapse; width: 34.3024%;" border="1" data-ke-align="alignLeft"><tbody><tr><td style="width: 11.5264%;"><b>ANIMAL_ID</b></td><td style="width: 11.6212%;"><b>NAME</b></td></tr><tr><td style="width: 11.5264%;">A349996</td><td style="width: 11.6212%;">Sugar</td></tr><tr><td style="width: 11.5264%;">A350276</td><td style="width: 11.6212%;">Jewel</td></tr><tr><td style="width: 11.5264%;">A350375</td><td style="width: 11.6212%;">Meo</td></tr><tr><td style="width: 11.5264%;">A352555</td><td style="width: 11.6212%;">Harley</td></tr><tr><td style="width: 11.5264%;">A352713</td><td style="width: 11.6212%;">Gia</td></tr><tr><td style="width: 11.5264%;">A352872</td><td style="width: 11.6212%;">Peanutbutter</td></tr><tr><td style="width: 11.5264%;">A353259</td><td style="width: 11.6212%;">Bj</td></tr></tbody></table>

((이하 생략))

### **나의 풀이**

```
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
ORDER BY ANIMAL_ID;
```

---

# **여러 기준으로 정렬하기**

### **문제 설명**

동물 보호소에 들어온 모든 동물의 아이디와 이름, 보호 시작일을 이름 순으로 조회하는 SQL문을 작성해주세요. 단, 이름이 같은 동물 중에서는 보호를 나중에 시작한 동물을 먼저 보여줘야 합니다.

**예시**

예를 들어,ANIMAL\_INS테이블이 다음과 같다면

<table style="border-collapse: collapse; width: 100%; height: 114px;" border="1" data-ke-align="alignLeft"><tbody><tr style="height: 19px;"><td style="height: 19px;"><b>ANIMAL_ID</b></td><td style="height: 19px;"><b>ANIMAL_TYPE</b></td><td style="height: 19px;"><b>DATETIME</b></td><td style="height: 19px;"><b>INTAKE_CONDITION</b></td><td style="height: 19px;"><b>NAME</b></td><td style="height: 19px;"><b>SEX_UPON_INTAKE</b></td></tr><tr style="height: 19px;"><td style="height: 19px;">A349996</td><td style="height: 19px;">Cat</td><td style="height: 19px;">2018-01-22 14:32:00</td><td style="height: 19px;">Normal</td><td style="height: 19px;">Sugar</td><td style="height: 19px;">Neutered Male</td></tr><tr style="height: 19px;"><td style="height: 19px;">A350276</td><td style="height: 19px;">Cat</td><td style="height: 19px;">2017-08-13 13:50:00</td><td style="height: 19px;">Normal</td><td style="height: 19px;">Jewel</td><td style="height: 19px;">Spayed Female</td></tr><tr style="height: 19px;"><td style="height: 19px;">A396810</td><td style="height: 19px;">Dog</td><td style="height: 19px;">2016-08-22 16:13:00</td><td style="height: 19px;">Injured</td><td style="height: 19px;">Raven</td><td style="height: 19px;">Spayed Female</td></tr><tr style="height: 19px;"><td style="height: 19px;">A410668</td><td style="height: 19px;">Cat</td><td style="height: 19px;">2015-11-19 13:41:00</td><td style="height: 19px;">Normal</td><td style="height: 19px;">Raven</td><td style="height: 19px;">Spayed Female</td></tr></tbody></table>

1.  이름을 사전 순으로 정렬하면 다음과 같으며, 'Jewel', 'Raven', 'Sugar'
2.  'Raven'이라는 이름을 가진 개와 고양이가 있으므로, 이 중에서는 보호를 나중에 시작한 고양이를 먼저 조회합니다.

따라서 SQL문을 실행하면 다음과 같이 나와야 합니다.

<table style="border-collapse: collapse; width: 58.4884%;" border="1" data-ke-align="alignLeft"><tbody><tr><td style="width: 15.814%;"><b>ANIMAL_ID</b></td><td style="width: 16.6279%;"><b>NAME</b></td><td style="width: 25.9302%;"><b>DATETIME</b></td></tr><tr><td style="width: 15.814%;">A350276</td><td style="width: 16.6279%;">Jewel</td><td style="width: 25.9302%;">2017-08-13 13:50:00</td></tr><tr><td style="width: 15.814%;">A396810</td><td style="width: 16.6279%;">Raven</td><td style="width: 25.9302%;">2016-08-22 16:13:00</td></tr><tr><td style="width: 15.814%;">A410668</td><td style="width: 16.6279%;">Raven</td><td style="width: 25.9302%;">2015-11-19 13:41:00</td></tr><tr><td style="width: 15.814%;">A349996</td><td style="width: 16.6279%;">Sugar</td><td style="width: 25.9302%;">2018-01-22 14:32:00</td></tr></tbody></table>

### **나의 풀이**

```
SELECT ANIMAL_ID, NAME, DATETIME
FROM ANIMAL_INS
ORDER BY NAME, DATETIME DESC;
```

---

# **상위 n개 레코드**

### **문제 설명**

동물 보호소에 가장 먼저 들어온 동물의 이름을 조회하는 SQL 문을 작성해주세요.예시

예를 들어ANIMAL\_INS테이블이 다음과 같다면

<table style="border-collapse: collapse; width: 100%; height: 95px;" border="1" data-ke-align="alignLeft"><tbody><tr style="height: 19px;"><td style="height: 19px;"><b>ANIMAL_ID</b></td><td style="height: 19px;"><b>ANIMAL_TYPE</b></td><td style="height: 19px;"><b>DATETIME</b></td><td style="height: 19px;"><b>INTAKE_CONDITION</b></td><td style="height: 19px;"><b>NAME</b></td><td style="height: 19px;"><b>SEX_UPON_INTAKE</b></td></tr><tr style="height: 19px;"><td style="height: 19px;">A399552</td><td style="height: 19px;">Dog</td><td style="height: 19px;">2013-10-14 15:38:00</td><td style="height: 19px;">Normal</td><td style="height: 19px;">Jack</td><td style="height: 19px;">Neutered Male</td></tr><tr style="height: 19px;"><td style="height: 19px;">A379998</td><td style="height: 19px;">Dog</td><td style="height: 19px;">2013-10-23 11:42:00</td><td style="height: 19px;">Normal</td><td style="height: 19px;">Disciple</td><td style="height: 19px;">Intact Male</td></tr><tr style="height: 19px;"><td style="height: 19px;">A370852</td><td style="height: 19px;">Dog</td><td style="height: 19px;">2013-11-03 15:04:00</td><td style="height: 19px;">Normal</td><td style="height: 19px;">Katie</td><td style="height: 19px;">Spayed Female</td></tr><tr style="height: 19px;"><td style="height: 19px;">A403564</td><td style="height: 19px;">Dog</td><td style="height: 19px;">2013-11-18 17:03:00</td><td style="height: 19px;">Normal</td><td style="height: 19px;">Anna</td><td style="height: 19px;">Spayed Female</td></tr></tbody></table>

이 중 가장 보호소에 먼저 들어온 동물은 Jack입니다. 따라서 SQL문을 실행하면 다음과 같이 나와야 합니다.

<table style="border-collapse: collapse; width: 7.90502%; height: 29px;" border="1" data-ke-align="alignLeft"><tbody><tr><td style="width: 100%;"><b>NAME</b></td></tr><tr style="height: 19px;"><td style="height: 19px; width: 100%;">Jack</td></tr></tbody></table>

※ 보호소에 가장 먼저 들어온 동물은 한 마리인 경우만 테스트 케이스로 주어집니다.

### **나의 풀이**

```
SELECT NAME
FROM ANIMAL_INS
WHERE DATETIME = (SELECT MIN(DATETIME)
                  FROM ANIMAL_INS);
```
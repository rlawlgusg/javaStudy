숙제)

1) table 생성
```
create table salesperson(
	name varchar2(20) primary key,
	age number,
	salary number
);
```
```
create table customer(
	name varchar2(20) primary key,
	city varchar2(20),
	industrytype varchar2(20)
);
```
```
create table orders(
	no number,
	custname varchar2(20) references customer(name),
	salesperson varchar2(20) references salesperson(name),
	amount number,
	primary key(custname, salesperson)
);
```
```
insert into salesperson values('김수연',26,500);
insert into salesperson values('임하연',37,500);
insert into salesperson values('유하림',40,600);
insert into salesperson values('이건우',50,700);
insert into salesperson values('박지예',27,500);
insert into salesperson values('이재명',50,400);

insert into customer values('최현호','서울','공무원');
insert into customer values('김지현','서울','IT');
insert into customer values('윤서우','서울','IT');
insert into customer values('정자영','서울','교사');
insert into customer values('윤태인','인천','서비스업');
insert into customer values('김시아','인천','서비스업');
insert into customer values('노유나','대전','건설');
insert into customer values('박성미','광주','건설');
insert into customer values('임상진','대전','교사');
insert into customer values('안철수','서울','기업인');
insert into customer values('윤석열','서울','정치인');
```
# 시퀀스
컬럼의 종류가 숫자인 경우

알아서 자동으로 1부터 1씩 증가하는 값으로 순번을 매겨야 하는 경우에 사용

## 시퀀스 만드는 방법

`create sequence 시퀀스이름;`
```
create sequence seq_orders;
SQL> create sequence seq_orders;
시퀀스가 생성되었습니다.
```
## 시퀀스 사용 방법
`insert into 테이블이름 values(시퀀스이름.nextval, ...);`

`insert into orders values(seq_orders.nextval,~~ )`

**시퀀스를 이용하여 만약  sql 명령 자체에 결함이 있어 실패했을 때는 시퀀스를 이용한 순번은 이미 발행이 되었기 때문에 순서대로 되지 않을 수 있음**

**꼭 순서대로 해야한다면 "max(컬럼)+1"을 사용**

시퀀스는 겹치지 않도록 번호만 매기는 용도로 사용
```
insert into orders values(seq_orders.nextval,'최현호','김수연',1);
insert into orders values(seq_orders.nextval,'김지현','김수연',1);
insert into orders values(seq_orders.nextval,'윤서우','김수연',1);
insert into orders values(seq_orders.nextval,'정자영','임하연',1);
insert into orders values(seq_orders.nextval,'윤태인','임하연',1);
insert into orders values(seq_orders.nextval,'김시아','유하림',1);
insert into orders values(seq_orders.nextval,'노유나','이건우',1);
insert into orders values(seq_orders.nextval,'박성미','박지예',1);
insert into orders values(seq_orders.nextval,'임상진','박지예',1);
insert into orders values(seq_orders.nextval,'최현호','박지예',1);
insert into orders values(seq_orders.nextval,'최현호','이건우',1);
insert into orders values(seq_orders.nextval,'김시아','박지예',1);
update orders set amount = 10 where no =1;
update orders set amount = 5 where no =10;
```

2) 모든 판매원의 이름과 급여 출력, 단 중복행은 제거

`select name,salary from salesperson;`
```
NAME        SALARY
---------- -------
김수연         500
임하연         500
유하림         600
이건우         700
박지예         500
이재명         400
```

3) 나이가 30세 미만인 판매원의 이름 출력

`select name from salesperson where age<30;`
```
NAME
----------
김수연
박지예
```

4) '주'로 끝나는 도시에 사는 고객의 이름을 출력

`select name from customer where city like '%주';`
```
NAME
----------
김지현
박성미
윤석열
```

5) 주문을 한 고객의 수(서로 다른 고객)를 출력
`select count(distinct custname) from orders;`
```
COUNT(DISTINCTCUSTNAME)
-----------------------
                      9
```

6-1) 판매원 각각에 대하여 주문의 수를 계산
```
select salesperson, count(*) from orders
group by salesperson;
```
```
SALESPERSO   COUNT(*)
---------- ----------
박지예              4
유하림              1
김수연              3
이건우              2
임하연              2
```

6-2) 각 판매원 별로 총 주문 수량을 출력
```
select salesperson, sum(amount) from orders
group by salesperson;
```
```
SALESPERSO SUM(AMOUNT)
---------- -----------
김수연              12
임하연               2
유하림               1
박지예               4
이건우               6
```

7) 서울에 사는 고객으로 부터 주문을 받은 판매원의 이름과 나이를 출력

**서브쿼리 이용**

-서울에 사는 고객이름 출력

`select name from customer where city = '서울';` A로둠
```
NAME
----------
최현호
윤서우
정자영
안철수
```

-A에게 판매한 판매원의 이름 출력

`select distinct salesperson from orders where custname in (select name from customer where city = '서울');`
```
SALESPERSO
----------
김수연
임하연
박지예
이건우
```

-이름이 B에 해당하는 판매원이름과 나이 출력

`select name, age from salesperson where name in (select distinct salesperson from orders where custname in (select name from customer where city = '서울'));`

**join식 이용**
```
select distinct s.name,age from salesperson s, orders o,customer c 
where s.name = o.salesperson and
c.name = o.custname and
city = '서울';
```
```
NAME         AGE
---------- -----
김수연        26
임하연        37
이건우        50
박지예        27
```

9) 두번이상 주문을 받은 판매원의 이름을 출력
```
select salesperson, count(salesperson) from orders 
group by salesperson
having count(salesperson) >=2;
```
```
SALESPERSO COUNT(SALESPERSON)
---------- ------------------
박지예                      4
김수연                      3
이건우                      2
임하연                      2
```

10) 판매원 박지예의 급여를 600으로 변경하는 sql명령어 작성

`update salesperson set salary = 600 where name = '박지예';`

# 데이터베이스 명령의 종류

1.DCL(Data Control Language) 데이터 제어어

권한부여, 권한을 제어하는 명령어

grant , revoke

2.DDL(Data Definition Language) 데이터 정의어

테이블(뷰, 인덱스)을 생성, 삭제, 수정

create, drop, alter

3.DML(Data Manupulation Language) 데이터 조작어

자료를 추가, 검색, 수정, 삭제

insert, select, update, delete

**서브쿼리에 대하여 설명**

sql명령어 안에 포함되는 또다른 sql을 말함

**서브쿼리는 sql명령어의 어디에 올 수 있나요?**

서브쿼리는 select절에 올 수도 있고 from절에 올 수도 있고 where절에 올 수도 있음

**다중행 연산자에 대하여 설명**

서브쿼리가 where절에 사용이 될때 서브쿼리의 건수가 여러건일 때 사용하는 연산자

**다중행 연산자의 종류는 어떤것들이 있나요?**

in, not in, any(some), all, exists, not exists가 있음

연습) 대한민국에 거주하는 고객에게 판매한 도서의 총 판매액 출력

-대한민국에 거주하는 고객의 번호 출력

`select custid from customer where address like '대한민국%'`
```
CUSTID
------
     5
    14
    15
     6
     7
     8
     9
    10
    11
    12
    13
     2
     3
```
A로 둠

-주문테이블로 고객번호가 A에 해당하는 판매액의 총합을 출력

`select sum(saleprice) from orders where custid = (select custid from customer where address like '대한민국%');`
```
SQL> select sum(saleprice) from orders where custid = (select custid from customer where address like '대한민국%');
select sum(saleprice) from orders where custid = (select custid from customer where address like '대한민국%'
                                                  *
1행에 오류:
ORA-01427: 단일 행 하위 질의에 2개 이상의 행이 리턴되었습니다.
```

**서브쿼리 건수가 여러건 일때는 =대신에 in을 사용해야 함**

`select sum(saleprice) from orders where custid in (select custid from customer where address like '대한민국%');`
```
SUM(SALEPRICE)
--------------
        249500
```

연습) 3번 고객이 주문한 도서의 최고금액보다 더 비싼 도서를 구입한 주문의 주문번호와 금액 출력

-3번 고객이 주문한 주문금액 출력

`select saleprice from orders where custid = 3;`
```
SALEPRICE
---------
   10,000
   10,000
   10,000
   10,000
    6,000
   12,000
   13,000
```
A로둠

-주문테이블로 부터 주문가격이 A보다 큰 주문의 주문번호, 주문금액을 출력
```
select orderid, saleprice 
from orders 
where saleprice > (select saleprice from orders where custid = 3);
```
```
SQL> select orderid, saleprice 
from orders where saleprice > (select saleprice from orders where custid = 3);
select orderid, saleprice from orders where saleprice > (select saleprice from orders where custid = 3)                                                         *
1행에 오류:
ORA-01427: 단일 행 하위 질의에 2개 이상의 행이 리턴되었습니다.
```

서브쿼리의 건수가 여러건 이어서 비교연산 > 를 사용할 수 없음!

다중행 연산자인 any(some),all과 같이 사용해야 함 
```
select orderid, saleprice 
from orders where saleprice > all (select saleprice from orders where custid = 3);
```
```
ORDERID SALEPRICE
------- ---------
     11    14,000
     17    20,000
     12    20,000
      5    20,000
      2    21,000
     15    35,000
     13    49,000
     14    50,000
```
```
select orderid, saleprice 
from orders where saleprice > (select max(saleprice) from orders where custid = 3);
```
```
ORDERID SALEPRICE
------- ---------
     11    14,000
     12    20,000
     13    49,000
     14    50,000
     15    35,000
     17    20,000
      2    21,000
      5    20,000
```

**all은 max함수를 사용하여 단일행 연산자로 표현할 수 있음!!**
```
select orderid, saleprice 
from orders where saleprice > any (select saleprice from orders where custid = 3);
```
```
ORDERID SALEPRICE
------- ---------
     14    50,000
     13    49,000
     15    35,000
      2    21,000
     12    20,000
      5    20,000
     17    20,000
     11    14,000
      7    13,000
     10    13,000
      6    12,000
      8    12,000
     23    10,000
     22    10,000
     19    10,000
     21    10,000
     20    10,000
     24    10,000
     25    10,000
      3     8,000
     16     7,500
     18     7,000
      9     7,000
```
```
select orderid, saleprice 
from orders where saleprice > some (select saleprice from orders where custid = 3);
```
```
ORDERID SALEPRICE
------- ---------
     14    50,000
     13    49,000
     15    35,000
      2    21,000
     12    20,000
      5    20,000
     17    20,000
     11    14,000
      7    13,000
     10    13,000
      6    12,000
      8    12,000
     23    10,000
     22    10,000
     19    10,000
     21    10,000
     20    10,000
     24    10,000
     25    10,000
      3     8,000
     16     7,500
     18     7,000
      9     7,000
```

**some(any)는 min함수를 사용하여 단일행 연산자로 표현가능**
```
select orderid, saleprice 
from orders where saleprice > (select min(saleprice) from orders where custid = 3);
```
```
ORDERID SALEPRICE
------- ---------
     19    10,000
     20    10,000
     21    10,000
     22    10,000
     23    10,000
     24    10,000
     25    10,000
     11    14,000
     12    20,000
     13    49,000
     14    50,000
     15    35,000
     16     7,500
     17    20,000
     18     7,000
      2    21,000
      3     8,000
      5    20,000
      6    12,000
      7    13,000
      8    12,000
      9     7,000
     10    13,000
```

연습) 모든 출판사 별 평균가격이 최대값 보다 더 비싼 도서의 정보를 출력

-max함수를 사용

-출판사별 도서의 평균가격 출력

`select avg(price) from book group by publisher;` A로둠
```
PUBLISHER  AVG(PRICE)
---------- ----------
쌍용미디어 32333.3333
굿스포츠        10250
나무수          13000
대한미디어      28500
이상미디어      16500
삼성당           7500
Pearson         13000
```

-book테이블로부터 price가 A보다 큰 값의 도서를 출력
```
select * from book where price > all (select avg(price) from book group by publisher);
select * from book where price > (select max(avg(price)) from book group by publisher);
```

**다중행 연산자 in, not in, any(some), all에 각각 설명하시오**

in, not in, any(some), all 모두 서브쿼리의 건수가 여러건 일때 사용하며

in은 =을 대신하여 사용하며 not in !=을 대신하여 사용하며

any(some), all은  >,<,>=,<= 연산자와 함께 사용함

any(some), all은 min함수나 max함수를 사용하면 단일행 연산자로도 표현가능!

## exists , not exists 연산자

다중행 연산자 종류 중 하나이며 

서브쿼리의 건수가 존재하는지 존재하지 않은지 여부를 판별하는 연산자

exists는 서브쿼리가 반환하는 조건에 맞는 메인쿼리를 실행하고

not exists는 서브쿼리의 조건에 만족하지 않는 메인쿼리를 실행

exists, not exists 다중행 연산자를 사용할 때에는 반드시 상관서브쿼리 이어야 함!

연습) 대한민국에 거주하는 고객에게 판매한 도서의 총판액을 출력

-join 이용
```
select sum(saleprice) from customer c, orders o 
where c.custid = o.custid and
address like '대한민국%';
```
```
SUM(SALEPRICE)
--------------
        249500
```

-in 이용

`select sum(saleprice) from orders where custid in (select custid from customer where address like '대한민국%');`
```
SUM(SALEPRICE)
--------------
        249500
```

-exists 이용

`select sum(saleprice) from orders o where exists (select custid from customer c where address like '대한민국%' and o.custid = c.custid);`
```
SUM(SALEPRICE)
--------------
        249500
```

# View
실제로는 존재 하지 않는 논리적인 가상의 테이블을 말함

자주사용하는 복잡한 조건식을 갖는 select문이 있다면 그것을 조회하는 sql 명령어를 뷰로 만들어 놓으면 사용이 용이함 

보안유지상 특정 테이블의 컬럼을 제한하여 접근할 수 있도록 할 때에도 뷰를 사용함 

**뷰를 만드는 방법**

`create view 뷰이름 as select문`

연습) 오늘날짜의 출판사별 총 판매수량, 총 판매금액을 출력
```
select publisher, count(publisher) cnt, nvl(sum(saleprice),0) sum 
from book b, orders o 
where b.bookid = o.bookid(+) and
to_char(orderdate,'yyyy/mm/dd') = to_char(sysdate,'yyyy/mm/dd')
group by publisher;
```
A로둠

`select distinct publisher, 0 cnt from book;`
B로둠

A에 있는 cnt + B에 있는 cnt
```
select b.publisher, nvl(A.cnt,0) cnt , nvl(A.sum,0) sum from (select publisher, count(publisher) cnt, nvl(sum(saleprice),0) sum 
from book b, orders o 
where b.bookid = o.bookid(+) and
to_char(orderdate,'yyyy/mm/dd') = to_char(sysdate,'yyyy/mm/dd')
group by publisher) A right outer join (select distinct publisher, 0 cnt from book) B
on A.publisher = B.publisher
order by nvl(A.cnt,0) desc;
```

위와같이 조회할 일이 많다고 할 때 매번 sql을 작성하는 것은 번거로운 일임

이런경우 뷰를 만들어두면 조회를 쉽게 할 수 있다!!!!!!!!!
```
create view today_sale 
as 
select b.publisher, nvl(A.cnt,0) cnt , nvl(A.sum,0) sum from (select publisher, count(publisher) cnt, nvl(sum(saleprice),0) sum 
from book b, orders o 
where b.bookid = o.bookid(+) and
to_char(orderdate,'yyyy/mm/dd') = to_char(sysdate,'yyyy/mm/dd')
group by publisher) A right outer join (select distinct publisher, 0 cnt from book) B
on A.publisher = B.publisher
order by nvl(A.cnt,0) desc;
```

`select * from today_sale;`

```
PUBLISHER         CNT        SUM
---------- ---------- ----------
굿스포츠            5      70000
쌍용미디어          4     116000
대한미디어          3      55000
삼성당              1       7500
나무수              1      10000
이상미디어          0          0
Pearson             0          0
```

연습) 도서명에 축구를 포함하고 있는 도서의 정보를 조회하는 뷰를 생성 
뷰이름은 vw_book이라고 함
```
create view vw_book as
select * from book where bookname like '%축구%';
```

`select * from vw_book;`
```
BOOKID BOOKNAME             PUBLISHER     PRICE
------ -------------------- ---------- --------
     1 축구의 역사          굿스포츠      7,000
     2 축구아는 여자        나무수       13,000
     3 축구의 이해          대한미디어   22,000
    11 재미있는 축구        쌍용미디어   17,000
    12 이기는 축구기술      굿스포츠     20,000
```

연습) 대한민국에 거주하는 고객의 정보를 출력하는 뷰를 생성 vw_customer
```
create view vw_customer as
select * from customer where address like '대한민국%'
```

`select * from vw_customer;`
```
CUSTID NAME       ADDRESS         PHONE
------ ---------- ------------- ---------------
     5 박세리     대한민국 대전
    14 안철수     대한민국 서울
    15 심상정     대한민국 서울  null
     6 윤석열     대한민국 서울 010-9000-0001
```
```
CUSTID NAME       ADDRESS            PHONE
------ ---------- --------------- ---------------
     7 이재명     대한민국 경기도  010-1000-0001
     8 Tiger      대한민국 인천    010-1234-1234
     9 tiger      대한민국 부산    010-2222-2222
    10 TIGER      대한민국 전주    010-3333-3333
    11    tiger   대한민국 강원도  010-3333-3333
    12 TIGER      대한민국 서울    010-4444-3333
    13 Tiger      대한민국 대구    010-5555-3333
     2 김연아     대한민국 서울    010-6000-0001
     3 장미란     대한민국 강원도  010-7000-0001
```

연습) 주문번호, 고객번호, 고객이름, 도서번호, 도서명, 판매가격, 주문일을 출력하는 view를 생성  vw_orders
```
create view vw_orders
as
select o.orderid, o.custid, c.name, o.bookid, b.bookname, o.saleprice, o.orderdate 
from book b, orders o, customer c
where b.bookid = o.bookid and
o.custid = c.custid;
```

`select * from vw_orders;`
```
ORDERID CUSTID NAME       BOOKID BOOKNAME             SALEPRICE ORDERDATE
------- ------ ---------- ------ -------------------- --------- ---------------
     25      6 윤석열          1 축구의 역사             10,000 21/11/19
     11      6 윤석열          8 야구를 부탁해           14,000 21/11/11
     14      6 윤석열         13 재미있는 오라클         50,000 21/11/19
     16      6 윤석열          9 올림픽 이야기            7,500 21/11/19
     18      6 윤석열         13 재미있는 오라클          7,000 21/11/19
     12      7 이재명         12 이기는 축구기술         20,000 21/11/19
     15      7 이재명          4 골프 바이블             35,000 21/11/19
     13      1 박지성         13 재미있는 오라클         49,000 21/11/19
     17      1 박지성         12 이기는 축구기술         20,000 21/11/19
      1      1 박지성          1 축구의 역사              6,000 20/11/01
      2      1 박지성          3 축구의 이해             21,000 20/11/03
      6      1 박지성          2 축구아는 여자           12,000 20/11/05
     23      2 김연아          1 축구의 역사             10,000 21/11/19
     24      2 김연아          3 축구의 이해             10,000 21/11/19
      3      2 김연아          5 피겨 교본                8,000 21/11/03
      9      2 김연아         10 Olymphic Champions       7,000 21/11/09
     19      3 장미란          1 축구의 역사             10,000 21/11/19
     20      3 장미란          2 축구아는 여자           10,000 21/11/19
     21      3 장미란          3 축구의 이해             10,000 21/11/19
     22      3 장미란         13 재미있는 오라클         10,000 21/11/19
      4      3 장미란          6 역도 단계별 기술         6,000 21/11/03
      8      3 장미란         10 Olymphic Champions      12,000 21/11/07
     10      3 장미란          8 야구를 부탁해           13,000 21/11/08
      5      4 추신수          7 야구의 추억             20,000 19/11/05
      7      4 추신수          8 야구를 부탁해           13,000 19/11/08
```

연습) vw_orders를 통해서 김연아 고객의 주문내역 조회

`select * from vw_orders where name = '김연아';`
```
ORDERID CUSTID NAME       BOOKID BOOKNAME             SALEPRICE ORDERDATE
------- ------ ---------- ------ -------------------- --------- ---------------
     23      2 김연아          1 축구의 역사             10,000 21/11/19
     24      2 김연아          3 축구의 이해             10,000 21/11/19
      3      2 김연아          5 피겨 교본                8,000 21/11/03
      9      2 김연아         10 Olymphic Champions       7,000 21/11/09
```

**view 사용하는 목적**

-자주 사용하는 복잡한 sql 대신

-보안유지상 사용자별로 조회할 수 있는 컬럼을 제한

실습을 위하여 사용자 계정을 만들어 봄
```
create user c##hong identified by hong;
grant connect, resource to c##hong;
```
연습) c##madang이 자신의 테이블인 emp 중에서 사원번호, 사원명, 부서번호, 주소, 전화번호만 조회할 수 있도록 뷰를 생성하여 hong에게 권한을 부여해봄 view이름은 vw_emp
```
create view vw_emp 
as
select eno,ename,dno,addr,phone from emp;
```

**권한부여**

`grant select on c##madang.vw_emp to c##hong;`
```
SQL> grant select on c##madang.vw_emp to c##hong;
권한이 부여되었습니다.
```
**결과**

c##hong계정에서 `select * from c##madang.vw_emp;` 하면 c##madang의 view를 볼 수 있음
```
ENO     ENAME     DNO   ADDR      PHONE
----- ---------- ----- ------ --------------
1000    이건우    30    서울   010-000-1111
1001    김수연    10    서울   010-000-2222
1002    최현호    20    인천   010-000-3333
1003    윤태인    30    김포   010-000-4444
1004    박지예    10   의정부  010-2222-2222
1005    김지현    20    서울   010-3333-2222
1006    김시아    30    서울   010-4444-2222
1007    유하림    10    인천   010-0000-2220
1008    임하연    10    서울   010-0000-2223
1009    윤서우    20    서울   010-0000-2225
1010    정자영    20    인천
1011    노유나    30    서울   010-0000-2227
1012    박성미    30    인천   010-0000-2228
1013    임상진    30    인천   010-0000-2229
1014    윤석열    20    서울   010-0000-0001
```

**권한제거**
```
revoke select on c##madang.vw_emp from c##hong;
SQL> revoke select on c##madang.vw_emp from c##hong;
권한이 취소되었습니다.
```
**결과**
```
SQL> select * from c##madang.vw_emp;
select * from c##madang.vw_emp
                        *
1행에 오류:
ORA-00942: 테이블 또는 뷰가 존재하지 않습니다
```

연습) 20번 부서에 근무하는 직원들의 사원번호, 사원명, 주소, 전화, 부서번호를 조회하는 뷰 생성 vw_emp20
```
create view vw_emp20
as
select eno, ename, addr, phone, dno from emp 
where dno = 20; 
```

**뷰를 통하여 insert, update, delete를 실험해봄

`insert into vw_emp20 values(2000,'홍길동','서울','010-7777-7777',20);`

**뷰를 통하여 insert할 수 있음!** 

실제로 레코드는 뷰를 생성할 때 사용한 모테이블에 추가됨 

그렇기 때문에 뷰생성시에 사용한 컬럼 이외의 컬럼들은 null을 허용하거나 

default값이 있어야 함

`update vw_emp20 set addr = '서울' where eno = 1010;`

**뷰를 통하여 update할 수 있음!**

뷰 생성시에 사용한 모테이블의 내용이 수정됨

`delete vw_emp20 where eno = 1014;`

**뷰를 통하여 delete를 수행할 수 있음**

실제 레코드가 있는 모테이블에서 삭제가 수행됨

연습) 뷰를 생성시 조건에 맞지 않는 레코드를 추가 할 수 있는지 실험

`insert into vw_emp20 values(2001,'이순신','경기도','010-1234-1234',30);`

**뷰 생성시에 조건에 맞지 않는 레코드 추가 가능**

그러나 뷰에는 나타나지 않고 모테이블에 추가됨 

연습) 뷰 생성시에 조건에 맞지 않는 값으로 레코드를 수정할 수 있는지 실험

`update vw_emp20 set dno = 30 where eno = 2000;`

**뷰 생성시에 설정한 조건에 맞지 않은 값으로 뷰를 통해 update할 수 있음**

모테이블의 내용이 변경되고 뷰에는 조건에 맞지 않기 때문에 나타나지 않음

**뷰를 삭제하는 방법**

`drop view 뷰이름;`

`drop view vw_emp20;`

**뷰 생성시에 설정한 조건에 맞지 않는 레코드를 추가할 수 없도록,조건에 맞지 않는 값으로 수정할 수 없도록 하고 싶음!!**

`create view 뷰이름 as select ~~ 조건식 with check option;`

with check option을 설정하여 뷰를 생성한다음 조건에 맞지 않는 레코드를 추가하고 

조건에 맞지 않는 값으로 수정해봄
```
create view vw_emp20
as
select eno, ename, addr, phone, dno from emp 
where dno = 20
with check option; 
```

-조건에 맞는 레코드 추가

`insert into vw_emp20 values(4000,'유관순','서울','010-0000-0000',20);`

-조건에 맞지 않는 레코드 추가

`insert into vw_emp20 values(5000,'문재인','서울','010-0000-0000',30);`
```
SQL> insert into vw_emp20 values(5000,'문재인','서울','010-0000-0000',30);
insert into vw_emp20 values(5000,'문재인','서울','010-0000-0000',30)
            *
1행에 오류:
ORA-01402: 뷰의 WITH CHECK OPTION의 조건에 위배 됩니다
```

**뷰 생성시에 with check option을 주었기 때문에 조건에 맞지 않는 레코드를 추가할 수 없음!!**

-수정
`update vw_emp20 set phone = '010-2222-2222' where eno = 4000;`
이건 가능!!

`update vw_emp20 set dno = 30 where eno = 1010;`
```
SQL> update vw_emp20 set dno = 30 where eno = 1010;
update vw_emp20 set dno = 30 where eno = 1010
       *
1행에 오류:
ORA-01402: 뷰의 WITH CHECK OPTION의 조건에 위배 됩니다
```

조회(읽기)만 가능한 뷰를 생성

`create view 뷰이름 as select ~ with read only;`

연습) vw_emp20을 삭제하고 읽기만 가능한 뷰로 만들어 데이터를 추가, 수정, 삭제를 실험

`drop view vw_emp20;`
```
create view vw_emp20
as
select eno, ename, addr, phone, dno from emp 
where dno = 20
with read only; 
```
```
insert into vw_emp20 values(4001,'김유신','서울','010-2222-2222',20);
SQL> insert into vw_emp20 values(4001,'김유신','서울','010-2222-2222',20);
insert into vw_emp20 values(4001,'김유신','서울','010-2222-2222',20)
*
1행에 오류:
ORA-42399: 읽기 전용 뷰에서는 DML 작업을 수행할 수 없습니다.
```
```
update vw_emp20 set addr = '인천' where eno = 1010;
SQL> update vw_emp20 set addr = '인천' where eno = 1010;
update vw_emp20 set addr = '인천' where eno = 1010
                    *
1행에 오류:
ORA-42399: 읽기 전용 뷰에서는 DML 작업을 수행할 수 없습니다.
```

`delete vw_emp20 where eno = 4000;`
```
SQL> delete vw_emp20 where eno = 4000;
delete vw_emp20 where eno = 4000
       *
1행에 오류:
ORA-42399: 읽기 전용 뷰에서는 DML 작업을 수행할 수 없습니다.
```

**view에 대하여 설명하시오**

실제로는 존재하지 않는 가상의 논리적인 테이블을 말하며 

복잡한 sql을 대신하거나 사용자별 접근권한을 설정하는 용도로 사용

뷰를 통해서 추가,수정,삭제가 가능하며 

with check option을 설정하여 조건에 맞는 레코드만 추가,수정할 수 있도록하고

with read only을 설정하여 읽기만 가능한 뷰를 만들 수 있음

# 시스템 뷰

오라클이 제공하는 데이터 사전을 말함

user_objects 사용자가 만든 모든 객체의 정보를 갖고 있음

user_tables   사용자가 만든 모든 테이블의 정보를 갖고 있음

user_constraints 사용자가 만든 모든 제약의 정보를 갖고 있음

`select constraint_name , constraint_type , table_name, status from user_constraints;`

# 제약의 비활성화

`alter table 테이블이름 disable constraint 제약명;`
```
SYS_C008318     P                    BOOK       ENABLED
SYS_C008323     R                    ORDERS     ENABLED
SYS_C008324     R                    ORDERS     ENABLED
```

`insert into book values (14,'즐거운 오라클','쌍용미디어',3000);`
```
SQL> insert into book values (14,'즐거운 오라클','쌍용미디어',3000);
insert into book values (14,'즐거운 오라클','쌍용미디어',3000)
*
1행에 오류:
ORA-00001: 무결성 제약 조건(C##MADANG.SYS_C008318)에 위배됩니다
```

-제약을 비활성화 시킴(참조키,프라이머리키 모두)
```
alter table orders disable constraint SYS_C008323;     
alter table orders disable constraint SYS_C008324;     
alter table book disable constraint SYS_C008318;     
```
```
SYS_C008323     R                    ORDERS     DISABLED
SYS_C008324     R                    ORDERS     DISABLED
SYS_C008318     P                    BOOK       DISABLED
```
```
SQL> insert into book values (14,'즐거운 오라클','쌍용미디어',3000);
1 개의 행이 만들어졌습니다.
```

# 제약의 활성화

`alter table 테이블이름 enable constraint 제약명;`

제약을 활성화를 하려면 활성화 하려는 제약에 대하여 만족하는 상태로 만들어야 함
```
alter table book enable constraint SYS_C008318;     
alter table orders enable constraint SYS_C008323;     
alter table orders enable constraint SYS_C008324;
```
```
SQL> alter table book enable constraint SYS_C008318;
alter table book enable constraint SYS_C008318
*
1행에 오류:
ORA-02437: (C##MADANG.SYS_C008318)을 검증할 수 없습니다 - 잘못된 기본 키입니다
```
활성화 하려는 제약에 대해 만족하지 않는 데이터가 있어서 오류가 발생

`delete book where bookname = '재미있는 자바';`

결과
```
SYS_C008318     P                    BOOK       ENABLED
SYS_C008323     R                    ORDERS     ENABLED
SYS_C008324     R                    ORDERS     ENABLED
```
`insert into book values (14,'재미있는 웹','쌍용미디어',3500);`

```
SQL> insert into book values (14,'재미있는 웹','쌍용미디어',3500);
insert into book values (14,'재미있는 웹','쌍용미디어',3500)
*
1행에 오류:
ORA-00001: 무결성 제약 조건(C##MADANG.SYS_C008318)에 위배됩니다
```
**제약이 활성화 되어 동일한 도서번호의 레코드를 추가할 수 없음!**

# 인덱스
조건식에 자주 사용되는 칼럼에 대하여 미리 색인표를 만들어 두는 것을 말함

인덱스를 만들어두면 검색시에 빠른 성능을 기대할 수 있음 

어떤 책이 한권 있다고 가정, 책이 얇고 10페이지도 안된다.. 이런경우에는 굳이 색인표를 만들 필요가 없음

책이 굉장히 두꺼움 한 600~1000페이지정도 된다면 책의 내용을 빠르게 찾도록 책 맨뒤에 색인표를 만들어두면 원하는 내용을 빨리 찾을 수 있음 

마치 이것처럼 데이터량이 많을 때 검색(조건식)에 빈번히 사용하는 칼럼에 대하여 

"인덱스"를 만들어두면 검색시에 성능효과를 기대할 수 있음

데이터양이 적으면 "인덱스"가 있으나 없으나 성능효과를 체감하기 어려움

만약 책을 만들어 놓고 책 맨뒤에 "색인표"까지 만들어 두었는데 

책 내용이 빈번히 바뀐다면 "색인표"는 의미가 없어지고

오히려 찾기 어려워짐

마찬가지로 데이터의 수정, 삭제가 빈번한 칼럼에 "인덱스"를 만들어 두면 

오히려 "성능저하"의 요인이 됨

## 인덱스 만드는 방법
`create index 인덱스이름 on 테이블이름(컬럼이름,[컬럼이름])`

연습) bookname을 대상으로 인덱스를 생성 (idx_book)

-인덱스를 만들지 않고 책이름으로 검색

`select * from book where bookname = '즐거운 오라클';`

-인덱스를 만든 후 책이름으로 검색

`create index idx_book on book(bookname);`

**인덱스 삭제**

`drop index 인덱스명;`

**인덱스가 있어서 검색 속도 차이 나는것을 보고싶음**

member에 dummy 데이터 50만명의 데이터를 insert하는 프로그램을 만들어봄
```
create table member100(
	id varchar2(50) primary key,
	pwd varchar2(50),
	name varchar2(50)
);
```
`create index idx_member100 on member100(name);`


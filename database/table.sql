-- attendance 테이블
drop table attendance;
create table attendance(
no number(10),
name varchar2(21),
phone char(13)
);

-- worldcup 테이블
drop table worldcup;
create table worldcup(
rank number(3),
name varchar2(39),
nation varchar2(15),
goal number(2)
);

INSERT INTO WORLDCUP(RANK, NAME, NATION, GOAL)
VALUES(1, '음바페', '프랑스', 8);
INSERT INTO WORLDCUP(RANK, NAME, NATION, GOAL)
VALUES(2, '리오넬 메시', '아르헨티나', 7);
insert into worldcup(rank, name, nation, goal)
values(3, '올리비에 지루', '프랑스', 4);
insert into worldcup(rank, name, nation, goal)
values(4, '훌리안 알바레스', '아르헨티나', 4);
commit;

-- pocketmon 테이블
drop table pocketmon;
CREATE TABLE POCKETMON(
NO NUMBER,--안쓰면 자동으로 38자리가 됨
NAME VARCHAR2(21),
TYPE VARCHAR2(9)
);
insert into pocketmon(no,name,type) values(1,'이상해씨','풀');
insert into pocketmon(no,name,type) values(4,'파이리','불꽃');
insert into pocketmon(no,name,type) values(7,'꼬부기','물');
insert into pocketmon(no,name,type) values(25,'피카츄','전기');
commit;

-- medalist 테이블
DROP TABLE MEDALIST;
CREATE TABLE MEDALIST(
NAME VARCHAR2(21),
EVENT VARCHAR2(30),
TYPE CHAR(6),
GOLD NUMBER(2),
SILVER NUMBER(2),
BRONZE NUMBER(2)
);
insert into medalist(name,event,type,gold,silver,bronze)
values('진종오','사격','하계',4,2,0);
insert into medalist(name,event,type,gold,silver,bronze)
values('김수녕','양궁','하계',4,1,1);
insert into medalist(name,event,type,gold,silver,bronze)
values('전이경','쇼트트랙','동계',4,0,1);
commit;

-- plan 테이블
drop table plan;
create table plan(
telecom char(2) not null check(telecom in ('SK','KT','LG')),
name varchar2(60) not null unique,
price number not null check(price >= 0),
data number not null check(data >= 0),
call number not null check(call >= 0),
sms number not null check(sms >= 0)
);

insert into plan(telecom,name,price,data,call,sms)
values('SK', '5G 언택트 52', 52000, 200, 1000, 2000);
commit;

-- menu 테이블
drop table menu;
create table menu(
name varchar2(30) not null unique,
type varchar2(9) not null check(type in ('음료','디저트')),
price number not null check(price >= 0),
event char(1) not null check(event in ('0','1'))
);
insert into menu(name, type, price, event)
values('아메리카노', '음료', 2500, '1');
insert into menu(name, type, price, event)
values('모카라떼', '음료', 3500, '0');
insert into menu(name, type, price, event)
values('치즈케이크', '디저트', 5000, '1');
insert into menu(name, type, price, event)
values('마카롱', '디저트', 3000, '0');
commit;

-- mobile 테이블
drop table mobile;
create table mobile (
name varchar2(12) not null,
telecom char(2) not null check(telecom in ('SK','KT','LG')),
price number not null check(price >= 0),
month number(2) check(month in (24, 30, 36)),
unique(name, telecom)
);
insert into mobile(name,telecom,price,month) 
values('갤럭시22s', 'SK', 1800000, null);
insert into mobile(name,telecom,price,month) 
values('갤럭시22s', 'KT', 1750000, 24);
insert into mobile(name,telecom,price,month) 
values('아이폰14', 'LG', 2000000, 30);
insert into mobile(name,telecom,price,month) 
values('아이폰14', 'SK', 1990000, null);
commit;

-- item 테이블
drop table item;
create table item (
--대표항목(not null+unique)
no number primary key,
name varchar2(60) not null check(regexp_like(name,'^[가-힣0-9]+$')),
type varchar2(15) not null,
price number not null check(price >= 0),
early char(1) not null check(early in ('0','1')),
event char(1) not null check(event in ('0','1'))
);
drop sequence item_seq;
create sequence item_seq;

insert into item(no,name,type,price,early,event)
values(item_seq.nextval,'참이슬후레시','주류',1200,'1','1');
insert into item(no,name,type,price,early,event)
values(item_seq.nextval,'클라우드맥주','주류',3000,'0','1');
insert into item(no,name,type,price,early,event)
values(item_seq.nextval,'바나나킥','과자',1500,'0','1');
insert into item(no,name,type,price,early,event)
values(item_seq.nextval,'허니버터칩','과자',2000,'1','0');
commit;

-- subject 테이블
drop table subject;
drop sequence subject_seq;
create table subject (
no number primary key,
name varchar2(60) not null,
period number not null check(mod(period, 30) = 0),
price number not null check(price >= 0),
type varchar2(12) not null check(type in ('온라인','오프라인','혼합'))
);
create sequence subject_seq;

insert into subject(no,name,period,price,type) 
values(subject_seq.nextval,'자바 마스터과정', 90, 1000000, '온라인');
insert into subject(no,name,period,price,type) 
values(subject_seq.nextval,'파이썬 기초', 60, 600000, '온라인');
insert into subject(no,name,period,price,type) 
values(subject_seq.nextval,'웹 개발자 단기완성', 120, 1200000, '오프라인');

commit;

-- product 테이블
drop table product;
create table product(
no number primary key,
name varchar2(30) not null,
type varchar2(15) check(type in ('과자','아이스크림','주류','사탕')),
price number,
made date,
expire date
);

insert into product values(1, '스크류바', '아이스크림', 1200, '2020-05-01', '2020-10-01');
insert into product values(2, '마이쮸', '사탕', 900, '2020-01-01', '2021-01-01');
insert into product values(3, '초코파이', '과자', 3000, '2020-01-01', '2021-01-01');
insert into product values(4, '맛동산', '과자', 2200, '2020-02-01', '2020-10-20');
insert into product values(5, '참이슬', '주류', 1000, '2020-01-05', '2020-04-05');
insert into product values(6, '처음처럼', '주류', 1000, '2020-03-15', '2020-08-15');
insert into product values(7, '바나나킥', '과자', 1500, '2020-05-03', '2020-06-03');
insert into product values(8, '빠삐코', '아이스크림', 1000, '2019-12-01', '2020-06-01');
insert into product values(9, '멘토스', '사탕', 1200, '2020-03-20', '2020-12-31');
insert into product values(10, '오레오', '과자', 2100, '2019-06-01', '2020-06-01');

commit;

-- student 테이블
drop table student;
drop sequence student_seq;
create table student(
no number primary key,
name varchar2(21) not null check(regexp_like(name, '^[가-힣]{2,7}$')),
korean number(3) not null check(korean between 0 and 100),
english number(3) not null check(english between 0 and 100),
math number(3) not null check(math between 0 and 100)
);
create sequence student_seq;



create table req(
name varchar2(21) not null check(regexp_like(name, '^[가-힣]{2,7}$'))
);

insert into req values('가나다라마바사하');
select * from req;

create table student(
student_no number primary key,
student_name varchar2(21) not null check(regexp_like(student_name, '^[가-힣]{2,7}$')),
exam_score number not null check(exam_score>=0 and exam_score<=100)
);

create table member(
    member_id varchar2(20) primary key check(regexp_like(member_id, '^[a-z0-9-_]{5,20}$')),
    member_pw varchar2(16) check(regexp_like(member_pw, '^[a-zA-Z0-9\\d`~!@#$%^&*()-_=+]{8,16}$')),
    member_nick varchar2(30) unique check(regexp_like(member_nick, '^[가-힣0-9]{2,10}$')),
    member_tell varchar2(11) check(regexp_like(member_tell, '^010[0-9]{8}$')),
    member_email varchar2(100) not null,
    member_birth varchar2(10) check(regexp_like(member_birth, '^[0-9]{4}-[0-9]{2}-[0-9]{2}$')),
    member_post varchar2(6) check(regexp_like(member_post, '^[0-9]{5,6}$')),
    member_basic_addr varchar2(300) check(regexp_like(member_basic_addr, '^[가-힣]{0,100}$')),
    member_detail_addr varchar2(300) check(regexp_like(member_detail_addr, '^[가-힣]{0,100}$')),
    member_level varchar2(12) check(member_level in('준회원', '일반회원', '우수회원', '관리자')),
    
    

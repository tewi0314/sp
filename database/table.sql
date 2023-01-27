-- attendance ���̺�
drop table attendance;
create table attendance(
no number(10),
name varchar2(21),
phone char(13)
);

-- worldcup ���̺�
drop table worldcup;
create table worldcup(
rank number(3),
name varchar2(39),
nation varchar2(15),
goal number(2)
);

INSERT INTO WORLDCUP(RANK, NAME, NATION, GOAL)
VALUES(1, '������', '������', 8);
INSERT INTO WORLDCUP(RANK, NAME, NATION, GOAL)
VALUES(2, '������ �޽�', '�Ƹ���Ƽ��', 7);
insert into worldcup(rank, name, nation, goal)
values(3, '�ø��� ����', '������', 4);
insert into worldcup(rank, name, nation, goal)
values(4, '�Ǹ��� �˹ٷ���', '�Ƹ���Ƽ��', 4);
commit;

-- pocketmon ���̺�
drop table pocketmon;
CREATE TABLE POCKETMON(
NO NUMBER,--�Ⱦ��� �ڵ����� 38�ڸ��� ��
NAME VARCHAR2(21),
TYPE VARCHAR2(9)
);
insert into pocketmon(no,name,type) values(1,'�̻��ؾ�','Ǯ');
insert into pocketmon(no,name,type) values(4,'���̸�','�Ҳ�');
insert into pocketmon(no,name,type) values(7,'���α�','��');
insert into pocketmon(no,name,type) values(25,'��ī��','����');
commit;

-- medalist ���̺�
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
values('������','���','�ϰ�',4,2,0);
insert into medalist(name,event,type,gold,silver,bronze)
values('�����','���','�ϰ�',4,1,1);
insert into medalist(name,event,type,gold,silver,bronze)
values('���̰�','��ƮƮ��','����',4,0,1);
commit;

-- plan ���̺�
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
values('SK', '5G ����Ʈ 52', 52000, 200, 1000, 2000);
commit;

-- menu ���̺�
drop table menu;
create table menu(
name varchar2(30) not null unique,
type varchar2(9) not null check(type in ('����','����Ʈ')),
price number not null check(price >= 0),
event char(1) not null check(event in ('0','1'))
);
insert into menu(name, type, price, event)
values('�Ƹ޸�ī��', '����', 2500, '1');
insert into menu(name, type, price, event)
values('��ī��', '����', 3500, '0');
insert into menu(name, type, price, event)
values('ġ������ũ', '����Ʈ', 5000, '1');
insert into menu(name, type, price, event)
values('��ī��', '����Ʈ', 3000, '0');
commit;

-- mobile ���̺�
drop table mobile;
create table mobile (
name varchar2(12) not null,
telecom char(2) not null check(telecom in ('SK','KT','LG')),
price number not null check(price >= 0),
month number(2) check(month in (24, 30, 36)),
unique(name, telecom)
);
insert into mobile(name,telecom,price,month) 
values('������22s', 'SK', 1800000, null);
insert into mobile(name,telecom,price,month) 
values('������22s', 'KT', 1750000, 24);
insert into mobile(name,telecom,price,month) 
values('������14', 'LG', 2000000, 30);
insert into mobile(name,telecom,price,month) 
values('������14', 'SK', 1990000, null);
commit;

-- item ���̺�
drop table item;
create table item (
--��ǥ�׸�(not null+unique)
no number primary key,
name varchar2(60) not null check(regexp_like(name,'^[��-�R0-9]+$')),
type varchar2(15) not null,
price number not null check(price >= 0),
early char(1) not null check(early in ('0','1')),
event char(1) not null check(event in ('0','1'))
);
drop sequence item_seq;
create sequence item_seq;

insert into item(no,name,type,price,early,event)
values(item_seq.nextval,'���̽��ķ���','�ַ�',1200,'1','1');
insert into item(no,name,type,price,early,event)
values(item_seq.nextval,'Ŭ�������','�ַ�',3000,'0','1');
insert into item(no,name,type,price,early,event)
values(item_seq.nextval,'�ٳ���ű','����',1500,'0','1');
insert into item(no,name,type,price,early,event)
values(item_seq.nextval,'��Ϲ���Ĩ','����',2000,'1','0');
commit;

-- subject ���̺�
drop table subject;
drop sequence subject_seq;
create table subject (
no number primary key,
name varchar2(60) not null,
period number not null check(mod(period, 30) = 0),
price number not null check(price >= 0),
type varchar2(12) not null check(type in ('�¶���','��������','ȥ��'))
);
create sequence subject_seq;

insert into subject(no,name,period,price,type) 
values(subject_seq.nextval,'�ڹ� �����Ͱ���', 90, 1000000, '�¶���');
insert into subject(no,name,period,price,type) 
values(subject_seq.nextval,'���̽� ����', 60, 600000, '�¶���');
insert into subject(no,name,period,price,type) 
values(subject_seq.nextval,'�� ������ �ܱ�ϼ�', 120, 1200000, '��������');

commit;

-- product ���̺�
drop table product;
create table product(
no number primary key,
name varchar2(30) not null,
type varchar2(15) check(type in ('����','���̽�ũ��','�ַ�','����')),
price number,
made date,
expire date
);

insert into product values(1, '��ũ����', '���̽�ũ��', 1200, '2020-05-01', '2020-10-01');
insert into product values(2, '������', '����', 900, '2020-01-01', '2021-01-01');
insert into product values(3, '��������', '����', 3000, '2020-01-01', '2021-01-01');
insert into product values(4, '������', '����', 2200, '2020-02-01', '2020-10-20');
insert into product values(5, '���̽�', '�ַ�', 1000, '2020-01-05', '2020-04-05');
insert into product values(6, 'ó��ó��', '�ַ�', 1000, '2020-03-15', '2020-08-15');
insert into product values(7, '�ٳ���ű', '����', 1500, '2020-05-03', '2020-06-03');
insert into product values(8, '������', '���̽�ũ��', 1000, '2019-12-01', '2020-06-01');
insert into product values(9, '���佺', '����', 1200, '2020-03-20', '2020-12-31');
insert into product values(10, '������', '����', 2100, '2019-06-01', '2020-06-01');

commit;

-- student ���̺�
drop table student;
drop sequence student_seq;
create table student(
no number primary key,
name varchar2(21) not null check(regexp_like(name, '^[��-�R]{2,7}$')),
korean number(3) not null check(korean between 0 and 100),
english number(3) not null check(english between 0 and 100),
math number(3) not null check(math between 0 and 100)
);
create sequence student_seq;



create table req(
name varchar2(21) not null check(regexp_like(name, '^[��-�R]{2,7}$'))
);

insert into req values('�����ٶ󸶹ٻ���');
select * from req;

create table student(
student_no number primary key,
student_name varchar2(21) not null check(regexp_like(student_name, '^[��-�R]{2,7}$')),
exam_score number not null check(exam_score>=0 and exam_score<=100)
);

create table member(
    member_id varchar2(20) primary key check(regexp_like(member_id, '^[a-z0-9-_]{5,20}$')),
    member_pw varchar2(16) check(regexp_like(member_pw, '^[a-zA-Z0-9\\d`~!@#$%^&*()-_=+]{8,16}$')),
    member_nick varchar2(30) unique check(regexp_like(member_nick, '^[��-�R0-9]{2,10}$')),
    member_tell varchar2(11) check(regexp_like(member_tell, '^010[0-9]{8}$')),
    member_email varchar2(100) not null,
    member_birth varchar2(10) check(regexp_like(member_birth, '^[0-9]{4}-[0-9]{2}-[0-9]{2}$')),
    member_post varchar2(6) check(regexp_like(member_post, '^[0-9]{5,6}$')),
    member_basic_addr varchar2(300) check(regexp_like(member_basic_addr, '^[��-�R]{0,100}$')),
    member_detail_addr varchar2(300) check(regexp_like(member_detail_addr, '^[��-�R]{0,100}$')),
    member_level varchar2(12) check(member_level in('��ȸ��', '�Ϲ�ȸ��', '���ȸ��', '������')),
    
    

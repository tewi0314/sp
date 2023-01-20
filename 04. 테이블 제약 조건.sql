create table plan(
telecom char(2) not null check(telecom in ('SK', 'KT', 'LG')),
name varchar2(60) not null unique,
price number not null check(price>=0),
data number not null check(data>=0),
call number not null check(call>=0),
sms number not null check(sms>=0)
);

insert into plan(telecom, name, price, data, call, sms)
values(null, null, null, null, null, null);

insert into plan(telecom, name, price, data, call, sms)
values('SK', '5G ¾ðÅÃÆ®52', 52000, 200, 1000, 2000);

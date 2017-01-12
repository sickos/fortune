create table info (
gender nvarchar2(10),
name nvarchar2(100),
birth number,
bt nvarchar2(100),
color nvarchar2(100));

create table color (
no number,
color nvarchar2(100),
ans nvarchar2(100));

insert into info values('m','이창주',880731,'A','Red');
insert into info values('m','김기호',901120,'O','Blue');
insert into info values('m','박민호',901213,'AB','Green');
insert into info values('m','이호성',911116,'AB','Pink');
insert into info values('f','방가은',930601,'B','Black');

insert into color values(1,'Red','활발하고 감수성이 강한 이성');
insert into color values(2,'Blue','능력있는 경영자 타입의 이성');
insert into color values(3,'Green','건강에 신경쓰며 심신을 편안하게 해주는 이성');
insert into color values(4,'Pink','포용력이 강한 이성');
insert into color values(5,'Black','이성보다 자기자신을 더 사랑하는 타입');

select a.name as 이름, a.color as 선택색상, b.ans as 이성타입
from info a, color b
where a.color = b.color;
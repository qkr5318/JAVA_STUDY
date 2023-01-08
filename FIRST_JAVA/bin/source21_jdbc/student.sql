--student.sql

create table student(
num NUMBER(4) PRIMARY KEY,
name VARCHAR2(10),
phone VARCHAR2(15),
addr VARCHAR2(20));

INSERT INTO student VALUES(1,'홍길동','010-111-1234','영등포');
INSERT INTO student VALUES(2,'김다미','010-222-2222','이태원');
INSERT INTO student VALUES(3,'장나라','010-333-3333','건대');
INSERT INTO student VALUES(4,'임꺽정','010-444-4444','잠실');
INSERT INTO student VALUES(5,'이순신','010-555-5555','역삼동');
INSERT INTO student VALUES(6,'김국진','010-666-6666','서초동');
COMMIT;

drop table student;

select * from student;

select * from STUDENT where NUM = 8;

update STUDENT set ADDR = '독도' where NUM = 2;

insert into STUDENT values(7, '김연아', '010-2222-3333', '독도');

delete from STUDENT where num = 8;

commit;


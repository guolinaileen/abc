
Insert into employee (last, first) values (‘a’, ‘b’);
Delete from employee where last=’a’; 

--Add column to an existing table: 
Alter table student add column department varchar(100);
--Rename a table: 
Alter table student rename to studentdata; 

--how to implement is-a relationship
create table employee(
ast varchar(20) not null, 
firstname varchar(200) not null, 
surname varchar(200) not null, 
primary key(ast)
);

create table administrative(
employee_ast varchar(20) not null references employee(ast),
primary key(employee_ast)
);

create table technical(
employee_ast varchar(20) not null references employee(ast),
primary key(employee_ast)
);
/*
how to implement weak entity
the implementation of weak entity is different from binary relationship

*/
create table movie(
movieNum varchar(20) not null, 
title varchar(100) unique, 
--constraint pk_movie
primary key(movieNum)
);
create table movie_copy(
movieNum varchar(20) not null,
copyNum varchar(20) not null,
primary key(movieNum, copyNum)
);
/*
create triggers
you cannot create an after trigger on a view
you cannot update the :NEW values
you cannot update the :OLD values
*/
create trigger tri_account
before insert or update on account
for each row
begin 
if(:new.acct_id=2 and :new.cust_id=23)
then raise_application_error(-20001, 'no insertion with 2 or 23');
end if; 
end; 
/*
trigger to call a procedure
*/
Create trigger salary_check
Before insert or update of salary, job_id ON employees
For each row
When (new.job_id<>’VP’)
Call check_sal(:new.job_id, :new.salary, :new.last_name)


create or replace trigger orders_after_insert
after insert on orders
for each row

declare --variable declarations
v_username varchar2(10);
begin  --trigger code
select user into v_username
from dual; 
insert into orders_audit (order_id, username)
values (:new.order_id, v_username);

exception
when 
--exception handling
end;


--check if null then replace it by 0
select d.name,  NVL(avg(salary), 0) 
from dept d left join emp e on d.deptno=e.deptno
group by d.name

--remove duplicated values
delete 
from employee
where rowid not in
(
select min(rowid)
from employee
group by firstName, lastName
)
--sum up values and listed in a line
select  SUM (case when col='a' then 1 else 0 end) as Acount, 
  	SUM (case when col='b' then 1 else 0 end) as Bcount, 
		SUM (case when col='c' then 1 else 0 end) as Ccount
from table_name
;

select sum(1), sum(case when one=two then 1 else 0 end), sum(case when one<>two then 1 else 0 end)
from twocols
;

--case when .. then .. when .. then.. else .. end
select ab.nameA, (case when ab.marks>=700 then 'A' when ab.marks>=500 and ab.marks<700 then 'B' else 'C' end) as grade
from guol.abc ab
;

--select table information
select table_name, column_name, data_type, data_length
from user_tab_columns
where table_name='emp'
;

select Products.pname 
from Orders, Products
where Orders.pid=Products.pid and date=sysdate
; 

select DEPT.name, T.sal
from DEPT left join(
select deptno,avg(salary) as sal
from EMP 
group by deptno ) T on DEPT.deptno=T.deptno; 


select q.fav_id, count(p.id) as votes
from Persons q, 
group by q.fav_id
order by votes desc
having votes>=
(
select p.fav_id as fav_id, count(p.id) as votes
from Persons p
group by p.fav_id
order by votes desc
limit 9, 1 ) T
;

select TOP 10 r.id, r.name, count(p.fav_id) as votes
from rides r left join persons p on r.id=p.fav_id
group by r.id, r.name
order by count(p.fav_id) desc 

select *
from people
where empName like '%ab%'
; 

-- to_char() function is used to convert data to character we can specify format also in which we want the output

select to_char(to_date('11-01-2012', 'DD-MM-YYYY'), 'YYYY-MM-DD')
from dual
; 

-- to_date('2012/06/12', 'yyyy/mm/dd')  it will return June 12, 2012

delete 
from products
where name='abc'
; 

update abc
set abc.aid=3
where abc.aid=1
;

--A faculty member may only be assigned to teach no more than 12 credit hours per semester.
CREATE ASSERTION Faculty_Load 
CHECK
(SELECT Count(*) 
 FROM ASSIGNED 
 WHERE Faculty_ID = 'BOCK') <= 12; 
 

select d.name, avg(salary) 
from dept d left join emp e on d.deptno=e.deptno
group by d.name


--team compete with another team
select t1.team_name as C1, t2.team_name as C2
from team t1, team t2
where t1.team_id<t2.team_id

--join exchange with union when no duplicated exist in two tables
select *
from table1 full outer join table2 using (name, num)


--learn extract month & year from date 
select e.empid, e.empname, T.yearR, T.monthR, T.salary
from guol.emp e left join
(
select h.empid as eid, extract(year from t.dateE) as yearR, extract(month from t.dateE) as monthR, sum(t.no_of_hours*h.rate) as salary
from guol.emp_h h, guol.emp_t t
where h.empid=t.empid
group by h.empid, extract(year from t.dateE), extract(month from t.dateE) ) T on e.empid=T.eid
;

--oracle applies the order by rownum first then order by, so rownum should be applied after ordering
select ep.eid, ep.salary
from guol.employee ep
where ep.salary< All (
select *
from
(
select e.salary
from guol.employee e
order by e.salary desc
)
where rownum<=3)
order by ep.salary desc
; 

--Give an example of a stored procedure, delete, update, insert
Create procedure guol.updateEmployee
(d integer, sal integer )
as
emp number

begin
Update guol.employee set salary=sal
where did=d
;
emp:=did;
end
;


--cursor example
CREATE OR REPLACE Function FindCourse
   ( name_in IN varchar2 ) --parameter
   RETURN number -- return type
IS
   cnumber number;

   CURSOR c1
   IS
     SELECT course_number
     from courses_tbl
     where course_name = name_in;

BEGIN

   open c1;
   fetch c1 into cnumber;

   if c1%notfound then
      cnumber := 9999;
   end if;

   close c1;

RETURN cnumber;

END;
--create a view
Create or replace view (col1, col2)
As
Select col1, col2
From table_name
Where condition

--Composite data type: 
Type student_data IS RECORD 
{
First_name VARCHAR(20),
Id NUMBER(2),
};
--Create a record type to hold the values declared above: 
Student_record student_data; 
--To access a field: 
Student_record.id
--Assign a value: 
Student_record.id=1 

Constraint: 
Create table employee
{
Id, varchar(10),
Constraint id check (id between 10 and 1000)
};

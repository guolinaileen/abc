select *
from rides, (
select Top 10 persons.fav_ride_id as fav_id, count(*)
from persons,
group by persons.fav_ride_id
order by count(*) desc
) temp
where rides.id=temp.fav_id
; 

select DEPT.name, TEMP.avg_sal
from DEPT left join (
select deptno, avg(salary) as avg_sal
from EMP
group by deptno) TEMP on DEPT.deptno=TEMP.avg_sal
;

select  SUM (case when col='a' then 1 else 0 end) as Acount, 
  	SUM (case when col='b' then 1 else 0 end) as Bcount, 
		SUM (case when col='c' then 1 else 0 end) as Ccount
from table

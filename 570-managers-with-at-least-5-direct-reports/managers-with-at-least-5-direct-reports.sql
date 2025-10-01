# Write your MySQL query statement below
select name from 
employee as a
join (select managerId from employee group by managerId having count(managerId) >=5) as b
on a.id=b.managerId
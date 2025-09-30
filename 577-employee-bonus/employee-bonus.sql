# Write your MySQL query statement below
Select a.name , b.bonus
from employee as a
left join bonus as b
on a.empid=b.empid
where b.bonus is null or b.bonus<1000
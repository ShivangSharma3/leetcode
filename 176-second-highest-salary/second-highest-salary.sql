# Write your MySQL query statement below
select max(employee.salary) as SecondHighestSalary
from employee
where employee.salary!=(
    select max(salary)
    from employee
)

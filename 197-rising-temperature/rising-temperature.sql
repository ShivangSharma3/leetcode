# Write your MySQL query statement below
select w1.id 
from weather w1, weather w2
where w1.recorddate=date_add(w2.recorddate,interval 1 day)
And w1.temperature>w2.temperature
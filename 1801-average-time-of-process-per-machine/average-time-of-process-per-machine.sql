# Write your MySQL query statement below
Select b.machine_id ,Round(AVG(b.timestamp-a.timestamp),3) as processing_time
from Activity a ,Activity b
where a.machine_id = b.machine_id
And a.process_id = b.process_id
And a.activity_type='start'
And b.activity_type='end'
Group by b.machine_id

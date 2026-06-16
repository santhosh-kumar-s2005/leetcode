# Write your MySQL query statement below
select activity_date as day,count(distinct user_id) as active_users
from Activity
where timestampdiff(DAY,activity_date,'2019-07-27') between 0 and 29
group by activity_date;

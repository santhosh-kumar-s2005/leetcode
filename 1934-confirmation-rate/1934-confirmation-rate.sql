# Write your MySQL query statement belo
select s.user_id,round(
    if(sum(action='confirmed')/count(action) is null,0,sum(action='confirmed')/count(action)),2) as confirmation_rate
from signups s
left join confirmations c
on s.user_id=c.user_id
group by user_id;



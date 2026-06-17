# Write your MySQL query statement belo
select s.user_id,round(         case
                                 when sum(action='confirmed')/count(action) is null then 0
                                else sum(action='confirmed')/count(action)
                                end 
                                ,2) as confirmation_rate
from signups s
left join confirmations c
on s.user_id=c.user_id
group by user_id;



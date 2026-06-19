# Write your MySQL query statement below
select distinct num as ConsecutiveNums
from Logs l1
where num=(
select num
from logs l2
where l1.id+1=l2.id
)
and num=(
    select num
    from logs l3
    where l1.id+2=l3.id
);
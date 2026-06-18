(select u.name as results
from MovieRating m
join users u
on m.user_id=u.user_id
group by u.user_id
having count(*)=(
select max(cnt)
from(
    select  count(*) as cnt
    from movierating
    group by user_id 
) t
)
order by u.name
limit 1)   union all(
    select m.title as results
    from movies  m
    inner join 
    movierating mr
    on m.movie_id=mr.movie_id
    where created_at>='2020-02-01' and created_at<='2020-02-29'
    group by m.title
    order by avg(rating) desc,title asc
    limit 1

);
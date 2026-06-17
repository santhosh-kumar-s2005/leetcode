select name 
from employee
where id in
(
select managerId
 from Employee
 Group by managerId
 Having count(*)>=5
 );
# Write your MySQL query statement below
select ifnull((select num from Mynumbers group by num having count(*) = 1 order by num desc limit 1),null) as num;
# Write your MySQL query statement below
SELECT R.contest_id , ROUND(count(*) * 100 /(SELECT COUNT(*) FROM Users),2) as PERCENTAGE
from Users U join Register R on U.user_id = R.user_id group by contest_id order by   percentage desc , contest_id ;
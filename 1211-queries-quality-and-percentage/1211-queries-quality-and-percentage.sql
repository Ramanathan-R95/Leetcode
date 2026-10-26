# Write your MySQL query statement below
SELECT query_name , ROUND(SUM(rating / position) / count(*) , 2) as Quality ,
ROUND( 100 * SUM(rating < 3) / count(*),2) as poor_query_percentage
FROM Queries
GROUP BY query_name;
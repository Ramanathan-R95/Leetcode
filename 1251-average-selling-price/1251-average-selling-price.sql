# Write your MySQL query statement below
select P.product_id , 
 COALESCE(
 ROUND(SUM(price * units)/SUM(units),2),0.00)
 as average_price

from Prices P left join UnitsSold U
on P.product_id = U.product_id and purchase_date BETWEEN start_date and end_date group by P.product_id;
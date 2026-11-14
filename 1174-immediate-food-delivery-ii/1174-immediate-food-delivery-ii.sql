# Write your MySQL query statement below

select  Round( 100 * 
(select count(*) from Delivery as A join
(select customer_id , min(order_date) as first_date from Delivery group by customer_id )  as B
on A.customer_id = B.customer_id and A.customer_pref_delivery_date = B.first_date) / (select count(distinct customer_id) from Delivery),2) as immediate_percentage;
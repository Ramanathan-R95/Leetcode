# Write your MySQL query statement below
select name as Customers from Customers where id not in (select c.id  from Customers c, orders o where c.id = o.customerId);
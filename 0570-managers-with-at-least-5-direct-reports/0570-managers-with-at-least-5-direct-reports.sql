# Write your MySQL query statement below
select name from Employee E join (select managerId , count(managerId) as reports from Employee group by managerId) S on E.id = S.managerId where reports >= 5;
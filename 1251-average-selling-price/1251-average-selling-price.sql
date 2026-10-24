SELECT P.product_id , IFNULL(ROUND(SUM(price * units)/SUM(units),2),0.00) as average_price
FROM Prices P LEFT JOIN UnitsSold U
on P.product_id = U.product_id and U.purchase_date BETWEEN start_date AND end_date group by P.product_id;
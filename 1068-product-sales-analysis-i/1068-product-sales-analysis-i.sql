-- select p.product_name,s.year,s.price from Sales s  join Product p on s.product_id= p.product_id;
select p.product_name,
s.year,
s.price
FROM product p
Inner JOIN sales s
ON p.product_id = s.product_id
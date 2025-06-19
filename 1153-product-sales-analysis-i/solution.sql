/* Write your PL/SQL query statement below */
select p.product_name,S.year,S.price from Sales S left join Product p on S.product_id=p.product_id;

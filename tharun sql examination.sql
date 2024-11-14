
SELECT * FROM sql_store.customers;

select customer_id,first_name,points, 'gold'  as value 
from customers 
where points > 3000;




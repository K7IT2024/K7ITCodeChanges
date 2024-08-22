-- inner join using within the database / between two tables of same database
/*use sql_store;
select order_id,oi.product_id,name,oi.unit_price
from order_items oi 
inner join products p on oi.product_id =p.product_id 

-- inner join using across the database / between two tables of different database
use sql_store;
select order_id,oi.product_id,name,p.unit_price
from order_items oi 
inner join sql_inventory.products p on oi.product_id =p.product_id  

use sql_store;
select order_id,oi.product_id,name,p.unit_price
from order_items oi inner join sql_inventory.products p  
where oi.product_id =p.product_id    */

-- self join
use sql_hr;
select e.employee_id,e.first_name, em.first_name AS Manager
from employees e join employees em 
where em.employee_id =e.reports_to




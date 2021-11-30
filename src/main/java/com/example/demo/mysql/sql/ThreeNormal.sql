
## 查询是否有订单数据重复
select * from order group by order_number having count(order_number)>1




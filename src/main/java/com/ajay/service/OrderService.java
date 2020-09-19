package com.ajay.service;

import java.util.List;

import com.ajay.entity.Order;

public interface OrderService {
	
    public boolean saveOrUpdate(Order order);
    
    public List<Order> list();
    
    public boolean delete(Order order);
 
    public List<Order> getByName(String colName, String colValue);
 
    public List<Order> getById(String colName, long colValue);
    
    public Order getObject(long id);

	public long deleteOrder(long orderId);

}

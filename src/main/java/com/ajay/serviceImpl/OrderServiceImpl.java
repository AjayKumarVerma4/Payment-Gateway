package com.ajay.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajay.dao.OrderDao;
import com.ajay.entity.Order;
import com.ajay.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderDao orderDao;
	
	@Override
	public boolean saveOrUpdate(Order order) {
		// TODO Auto-generated method stub
		return orderDao.saveOrUpdate(order);
	}

	@Override
	public List<Order> list() {
		// TODO Auto-generated method stub
		return orderDao.list();
	}

	@Override
	public boolean delete(Order order) {
		// TODO Auto-generated method stub
		return orderDao.delete(order);
	}

	@Override
	public List<Order> getByName(String colName, String colValue) {
		// TODO Auto-generated method stub
		return orderDao.getByName(colName,colValue);
	}

	@Override
	public List<Order> getById(String colName, long colValue) {
		// TODO Auto-generated method stub
		return orderDao.getById(colName,colValue);
	}

	@Override
	public Order getObject(long id) {
		// TODO Auto-generated method stub
		return orderDao.getObject(id);
	}

	@Override
	public long deleteOrder(long orderId) {
		// TODO Auto-generated method stub
		return orderDao.deleteOrder(orderId);
	}

}

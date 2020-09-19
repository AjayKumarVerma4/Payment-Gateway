package com.ajay.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ajay.dao.OrderDao;
import com.ajay.entity.Order;

@Repository
@Transactional
public class OrderDaoImpl implements OrderDao{
	
	@Autowired
	SessionFactory session;

	@Override
	public boolean saveOrUpdate(Order order) {
		// TODO Auto-generated method stub
		session.getCurrentSession().saveOrUpdate(order);
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Order> list() {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("from Order").list();
	}

	@Override
	public boolean delete(Order order) {
		// TODO Auto-generated method stub
		try {
			session.getCurrentSession().delete(order);
		} catch (Exception ex) {
			return false;
		}
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Order> getByName(String colName, String colValue) {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("from Order where " + colName + "='" + colValue + "'").list();
	}
	

	@SuppressWarnings("unchecked")
	@Override
	public List<Order> getById(String colName, long colValue) {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("from Order where " + colName + "='" + colValue + "'").list();
	}

	@Override
	public Order getObject(long id) {
		// TODO Auto-generated method stub
		Order order = session.getCurrentSession().get(Order.class, id);
		return order;
	}

	@Override
	public long deleteOrder(long orderId) {
		// TODO Auto-generated method stub
		return 0;
	}


}

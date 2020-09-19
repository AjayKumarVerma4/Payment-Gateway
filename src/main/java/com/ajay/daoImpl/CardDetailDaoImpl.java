package com.ajay.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ajay.dao.CardDetailDao;
import com.ajay.entity.CardDetail;

@Repository
@Transactional
public class CardDetailDaoImpl implements CardDetailDao {

	@Autowired
	SessionFactory session;
	
	@Override
	public boolean saveOrUpdate(CardDetail cardDetail) {
		// TODO Auto-generated method stub
		session.getCurrentSession().saveOrUpdate(cardDetail);
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CardDetail> list() {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("from CardDetail").list();
	}

	@Override
	public boolean delete(CardDetail cardDetail) {
		// TODO Auto-generated method stub
		try {
			session.getCurrentSession().delete(cardDetail);
		} catch (Exception ex) {
			return false;
		}
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CardDetail> getByName(String colName, String colValue) {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("from CardDetail where " + colName + "='" + colValue + "'").list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CardDetail> getById(String colName, long colValue) {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("from CardDetail where " + colName + "='" + colValue + "'").list();
	}

	@Override
	public CardDetail getObject(long id) {
		// TODO Auto-generated method stub
		CardDetail cardDetail = session.getCurrentSession().get(CardDetail.class, id);
		return cardDetail;
	}

	@Override
	public long deleteCardDetail(long cardDetailId) {
		// TODO Auto-generated method stub
		return 0;
	}
   
}

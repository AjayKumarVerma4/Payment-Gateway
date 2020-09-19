package com.ajay.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajay.dao.CardDetailDao;
import com.ajay.entity.CardDetail;
import com.ajay.service.CardDetailService;

@Service
public class CardDetailServiceImpl implements CardDetailService {

	@Autowired
	CardDetailDao cardDetailDao;
	
	@Override
	public boolean saveOrUpdate(CardDetail cardDetail) {
		// TODO Auto-generated method stub
		return cardDetailDao.saveOrUpdate(cardDetail);
	}

	@Override
	public List<CardDetail> list() {
		// TODO Auto-generated method stub
		return cardDetailDao.list();
	}

	@Override
	public boolean delete(CardDetail cardDetail) {
		// TODO Auto-generated method stub
		return cardDetailDao.delete(cardDetail);
	}

	@Override
	public List<CardDetail> getByName(String colName, String colValue) {
		// TODO Auto-generated method stub
		return cardDetailDao.getByName(colName, colValue);
	}

	@Override
	public List<CardDetail> getById(String colName, long colValue) {
		// TODO Auto-generated method stub
		return cardDetailDao.getById(colName,colValue);
	}

	@Override
	public CardDetail getObject(long id) {
		// TODO Auto-generated method stub
		return cardDetailDao.getObject(id);
	}

	@Override
	public long deleteCardDetail(long cardDetailId) {
		// TODO Auto-generated method stub
		return cardDetailDao.deleteCardDetail(cardDetailId);
	}

}

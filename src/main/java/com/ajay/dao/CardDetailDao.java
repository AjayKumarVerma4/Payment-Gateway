package com.ajay.dao;

import java.util.List;

import com.ajay.entity.CardDetail;

public interface CardDetailDao {
	
    public boolean saveOrUpdate(CardDetail cardDetail);
    
    public List<CardDetail> list();
    
    public boolean delete(CardDetail cardDetail);
 
    public List<CardDetail> getByName(String colName, String colValue);
 
    public List<CardDetail> getById(String colName, long colValue);
    
    public CardDetail getObject(long id);

	public long deleteCardDetail(long cardDetailId);

}

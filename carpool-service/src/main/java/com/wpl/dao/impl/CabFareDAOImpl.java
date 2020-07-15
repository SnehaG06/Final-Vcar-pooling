package com.wpl.dao.impl;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.wpl.DBConnection;
import com.wpl.HibernateConfig;
import com.wpl.dao.CabFareDAO;
import com.wpl.model.CabFare;

@Service
@EnableTransactionManagement
public class CabFareDAOImpl implements CabFareDAO{
	

	@Autowired
	private DBConnection dbase;
	
	@Autowired
	private HibernateConfig template;
	
	@Autowired
	 private CabFareDAO cabFareDao;
	    public List<CabFare> findAll(){
	        return cabFareDao.findAll();
	    }
	
	@Override
	public CabFare save(CabFare cabFare) {
		template.getHibernateTemplate().save(cabFare);
		return cabFare;
	}
	
	@Override
	public CabFare update(CabFare cabFare) {
		template.getHibernateTemplate().update(cabFare);
		return cabFare;
		
	}

	
	
	public CabFare findByuserId(int userId) {
		//String SQL = "select * from carpool.USER where userId = ?";
		List params = new ArrayList();
		params.add(userId);
		List fare = template.getHibernateTemplate().findByNamedParam("from User u where u.userId=:id","id",userId);
		if(fare.size()>0)
			return (CabFare) fare.get(0);
		else
			return null;
	}

	
	

}

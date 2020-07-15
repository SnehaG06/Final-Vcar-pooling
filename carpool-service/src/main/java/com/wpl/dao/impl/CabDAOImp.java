package com.wpl.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wpl.dao.CabDAO;
import com.wpl.model.Cab;

import java.util.List;

@Service
public class CabDAOImp implements CabDAO {

    @Autowired
    private CabDAO cabDao;

    @Override
    public List<Cab> findAll() {
        return cabDao.findAll();
    }

	@Override
	public List<Cab> findByCompnyId(String CompnyId) {
		return cabDao.findByCompnyId(CompnyId);
	}
	
	 @Override
	 public Cab update(Cab cab) {
	    return cabDao.save(cab);
	 }
	 
		@Override
		public Cab findBycid(int cid) {
			return cabDao.findBycid(cid);
		}

		@Override
		public Cab save(Cab cab) {
			// TODO Auto-generated method stub
			 return cabDao.save(cab);
		}
		
	 

}

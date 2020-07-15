package com.wpl.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wpl.dao.TripsDAO;
import com.wpl.model.Trips;

import java.util.List;


@Service
public class TripsDAOImpl implements TripsDAO {

    @Autowired
    private TripsDAO tripDao;

    @Override
    public List<Trips> findAll() {
        return tripDao.findAll();
    }

	@Override
	public Trips findByuserid(int id) {
		return tripDao.findByuserid(id);
	}
	
	@Override
	public List<Trips> findByCid(int cid) {
		return tripDao.findByCid(cid);
	}
	@Override
	  public Trips delete(int id) {
	        Trips trips = findByuserid(id);
	        if(trips != null){
	            tripDao.delete(trips);
	        }
	        return trips;
	    }
	  
	  @Override
	    public Trips create(Trips trips) {
	        return tripDao.save(trips);
	    }
	  
		 @Override
		 public Trips update(Trips trips) {
		    return tripDao.save(trips);
		 }

		@Override
		public Trips save(Trips trips) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Trips delete(Trips trips) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Trips findByuserid(String userid) {
			// TODO Auto-generated method stub
			return null;
		}

}
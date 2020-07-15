package com.wpl.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.wpl.dao.CabDAO;

import com.wpl.model.Cab;
@RestController
@RequestMapping("/cab")
public class CabService implements CabDAO{
	
	 @Autowired
	 private CabDAO cabDao;
	    public List<Cab> findAll(){
	        return cabDao.findAll();
	    }
	    
	    @Test
	    @RequestMapping(value = "/bycid", method = RequestMethod.POST)
		public List<Cab> findByCompny_id(@RequestBody Cab CompnyId) 
		{
			return cabDao.findByCompnyId(CompnyId.getComanyId());
		}
	    
	    @RequestMapping(path = {"/{cid}"})
	    public Cab update(@PathVariable("cid") int cid, @RequestBody Cab cab){
	        cab.setCid(cid);
	        return cabDao.update(cab);
	    }
	    
	    @RequestMapping(value = "/viewusercab", method = RequestMethod.POST)
	   	public Cab findBycid(@RequestBody Cab cid) 
	   	{
	   		return cabDao.findBycid(cid.getCid());
	   	}

		@Override
		public List<Cab> findByCompnyId(String CompnyId) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Cab save(Cab cab) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Cab findBycid(int cid) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Cab update(Cab cab) {
			// TODO Auto-generated method stub
			return null;
		}
	 

}
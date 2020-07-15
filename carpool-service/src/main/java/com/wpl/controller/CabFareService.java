package com.wpl.controller;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;


import com.wpl.dao.CabFareDAO;

import com.wpl.model.CabFare;
@RestController
@RequestMapping("/cabFare")
public class CabFareService {
                    	CabFare cf = new CabFare();

	 @Autowired
	 private CabFareDAO cabFareDao;
	    public List<CabFare> findAll(){
	        return cabFareDao.findAll();
	    }
	    
	    @SuppressWarnings("unchecked")
		@RequestMapping(value = "/byuserId", method = RequestMethod.POST)
		public List<CabFare> findByuserId(@RequestBody CabFare userId) 
		{
			return (List<CabFare>) cabFareDao.findByuserId(userId.getUserId());
		}
	    
	    @RequestMapping(value="/calcFare",method=RequestMethod.POST)
	    public double calcFare(@RequestBody CabFare distance) {
	    	double f=cf.getFare();
	    	if(cf.getDistance()<5) {
	    		f=60.00;
	    	}
	    	else if(cf.getDistance()>=15) {
	    		f=60.00+(cf.getDistance()-5)*10;
	    	}
	    	else if(cf.getDistance()>=25) {
	    		f=60.00+(10*10)+(cf.getDistance()-15)*8;
	    	}
	    	else
	    	{
	    		f=60.00+(10*10)+(10*8)+(cf.getDistance()-25)*6;
	    	}
	    	
	    	return f;
	    	
	    }
    

}

package com.wpl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wpl.dao.TripsDAO;
import com.wpl.model.Trips;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/trips"})
public class TripsService {
	
    @Autowired
    private TripsDAO tripDao;

    @PutMapping(path = { "create" })
    public Trips create(@RequestBody Trips trips){
        return tripDao.create(trips);
    }
    
    @RequestMapping(value = "/viewusertrip", method = RequestMethod.POST)
	public Trips findByuserid(@RequestBody Trips userid) 
	{
		return tripDao.findByuserid(userid.getuserId());
	}
    
    @DeleteMapping(path ={"/{id}"})
    public Trips delete(@PathVariable("id") int id) {
        return tripDao.delete(id);
    }
    
    @GetMapping
    public List<Trips> findAll(){
        return tripDao.findAll();
    }
    
    @RequestMapping(value = "/viewctrip", method = RequestMethod.POST)
	public List<Trips> findByCid(@RequestBody Trips cid) 
	{
		return tripDao.findByCid(cid.getcid());
	}
    
    @RequestMapping(path ={"/{tripid}"})
    public Trips update(@PathVariable("tripid") int tripid, @RequestBody Trips trips){
        trips.setid(tripid);
        return tripDao.update(trips);
    }
    
}
package com.wpl.dao;

import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Component;

import com.wpl.model.Cab;

import java.util.List;
@Component
public interface CabDAO extends Repository<Cab,Integer> {
List<Cab> findAll();
    
    List<Cab> findByCompnyId(String CompnyId);
    
    Cab save(Cab cab);
    
    Cab findBycid(int cid);

	Cab update(Cab cab);
}

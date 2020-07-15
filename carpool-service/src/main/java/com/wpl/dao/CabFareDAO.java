package com.wpl.dao;
import org.springframework.stereotype.Component;
import org.springframework.data.repository.Repository;

import com.wpl.model.CabFare;

import java.util.List;
@Component
public interface CabFareDAO extends Repository<CabFare,Integer> {
    
	List<CabFare> findAll();
    
    CabFare save(CabFare fare);
    
    CabFare findByuserId(int userId);

	CabFare update(CabFare fare);
}

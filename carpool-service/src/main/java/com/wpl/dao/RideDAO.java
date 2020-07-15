package com.wpl.dao;

import org.springframework.stereotype.Component;
import org.springframework.data.repository.Repository;

import com.wpl.model.Ride;
import com.wpl.model.User;

@Component
public interface RideDAO extends Repository<Ride,Integer>{
	
	void save(Ride ride);
	void update(Ride ride);
	void delete(Ride ride);
	Ride findByRideId(String rideId);
	void saveRider(Ride ride, User user);
	int countRides();
	void updateRideVacancy(Ride ride);
}
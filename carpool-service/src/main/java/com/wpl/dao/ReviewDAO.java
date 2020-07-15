package com.wpl.dao;

import org.springframework.stereotype.Component;


import org.springframework.data.repository.Repository;
import com.wpl.model.Review;

@Component
public interface ReviewDAO extends Repository<Review,Integer> {
	
	void save(Review review);
	void update(Review review);
	void delete(Review review);
	Review findByReviewId(String reviewId);
	Review findByExistingUserAndRide(String userId,String rideId);
}

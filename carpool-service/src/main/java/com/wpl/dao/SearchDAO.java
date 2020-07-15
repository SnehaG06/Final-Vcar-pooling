package com.wpl.dao;


import org.springframework.data.repository.Repository;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface SearchDAO extends Repository {
  public List search_Ride(String rdate);
  public List show_Ride(String userId);
}
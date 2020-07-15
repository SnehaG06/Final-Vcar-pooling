package com.wpl.dao;


import org.springframework.data.repository.Repository;

import org.springframework.stereotype.Component;

import com.wpl.model.Admin;

@Component
public interface AdminDAO extends Repository<Admin,Integer>{
	 Admin findByMemailAndMpassword(String Memail, String Mpassword);
}
package com.wpl.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wpl.dao.AdminDAO;
import com.wpl.model.Admin;


@Service
public class AdminDAOImpl implements AdminDAO {

    @Autowired
    private AdminDAO adminDao;

   	@Override
    public Admin findByMemailAndMpassword(String Memail, String Mpassword) {
		return adminDao.findByMemailAndMpassword( Memail, Mpassword);
	}
}
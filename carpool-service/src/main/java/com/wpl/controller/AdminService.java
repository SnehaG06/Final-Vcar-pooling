package com.wpl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wpl.dao.AdminDAO;
import com.wpl.model.Admin;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/admin"})

public class AdminService {
	
    @Autowired
    private AdminDAO adminDao;
        
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public Admin findByMemailAndMpassword(@RequestBody Admin loginAdmin) 
	{
		return adminDao.findByMemailAndMpassword(loginAdmin.getmemail(),loginAdmin.getmpassword());
	}
     
}

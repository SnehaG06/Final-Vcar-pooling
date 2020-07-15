package com.wpl.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.wpl.model.Admin;


@Component
public class AdminMapper implements RowMapper<Admin> {
	@Override
	public Admin mapRow(ResultSet rs, int arg1) throws SQLException 
	{
		Admin admin = new Admin();
		admin.setCid(rs.getInt("cid"));
		admin.setcompany_name(rs.getString("company_name"));
		admin.setmanager_name(rs.getString("manager_name"));
		admin.setmemail(rs.getString("memail"));
		admin.setmpassword(rs.getString("mpassword"));
		
		return admin;
	}

}
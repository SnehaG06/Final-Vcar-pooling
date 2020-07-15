package com.wpl.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.wpl.model.Trips;


@Component
public class TripsMapper implements RowMapper<Trips> {
	@Override
	public Trips mapRow(ResultSet rs, int arg1) throws SQLException 
	{
		Trips trip = new Trips();
		trip.setcid(rs.getInt("cid"));
		trip.setid(rs.getInt("id"));
		trip.setcab_id(rs.getString("cab_id"));
		trip.setuserId(rs.getString("userId"));
		trip.setis_approved(rs.getString("is_approved"));
		
		return trip;
	}

}
package com.wpl.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.wpl.model.Cab;


@Component
public class CabMapper implements RowMapper<Cab> {
	@Override
	public Cab mapRow(ResultSet rs, int arg1) throws SQLException 
	{
		Cab cab = new Cab();
		cab.setCid(rs.getInt("cid"));
		cab.setCompanyName(rs.getString("company_name"));
		cab.setDriverName(rs.getString("driver_name"));
		cab.setRideStartLocation(rs.getString("rideStartLocation"));
		cab.setRideEndLocation(rs.getString("rideEndLocation"));
		cab.setVacantSpace(rs.getString("vacant_space"));
		cab.setDriverAuth(rs.getString("driver_auth"));
		cab.setDriverMob(rs.getString("driver_mob"));
		cab.setCompanyId(rs.getString("companyId"));
		cab.setPickup(rs.getString("pickup"));
		cab.setDropoff(rs.getString("dropoff"));
		return cab;
	}

}

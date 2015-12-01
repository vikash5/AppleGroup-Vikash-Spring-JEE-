package com.bluemaple.application.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bluemaple.application.Model.TicketModel;

public class Loginadd implements RowMapper{

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("rowmapper");
		TicketModel ticket = new TicketModel();
		ticket.setUsername(rs.getString("username"));
		ticket.setPassword(rs.getString("password"));
		ticket.setRole_id(rs.getInt("Role_id"));
		// System.out.println(rs.getInt("Role_id"));
		return ticket;

	}

}


package com.bluemaple.application.TicketReservationDao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bluemaple.application.TicketReservationModel.TicketReservationModel;

public class TicketReservationCheck implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("rowmapper");
		TicketReservationModel ticket = new TicketReservationModel();
		ticket.setUsername(rs.getString("username"));
		ticket.setPassword(rs.getString("password"));
		ticket.setRole_id(rs.getInt("Role_id"));
		// System.out.println(rs.getInt("Role_id"));
		return ticket;

	}

}

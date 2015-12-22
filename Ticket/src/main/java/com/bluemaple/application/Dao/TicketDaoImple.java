package com.bluemaple.application.Dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bluemaple.application.Model.TicketModel;
@Repository
public class TicketDaoImple implements TicketDao{
	
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public TicketModel insert(TicketModel ticket) {
		// TODO Auto-generated method stub
			
		// TODO Auto-generated method stub
		String insert = "insert into persondetails (userid, username,password,firstname,lastname,emailaddress,address,createdby,updatedby,createddate,updateddate,Role_id) value(?,?,?,?,?,?,?,?,?,?,?,?)";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(
				insert,
				new Object[] { ticket.getUserid(), ticket.getUsername(),
						ticket.getPassword(), ticket.getFirstname(),
						ticket.getLastname(), ticket.getEmailaddress(),
						ticket.getAddress(), ticket.getUsername(),
						ticket.getUsername(), ticket.getDate(),
						ticket.getDate(), ticket.getRole_id() });
		System.out.println("Register successfull...!");

		return ticket;

	}


}

package com.bluemaple.application.Dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bluemaple.application.Model.TicketModel;

@Repository
public class LoginDaoImple implements LoginDao {

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
	public TicketModel logincheck(String name1) {
		// TODO Auto-generated method stub
	
				System.out.println(name1);
				String query = "select * from persondetails where username=?";
				System.out.println(name1);
				TicketModel ticket = (TicketModel) getJdbcTemplate()
						.queryForObject(query, new Object[] { name1 },
								new Loginadd());
				String name = ticket.getUsername();
				System.out.println(name);
				return ticket;

			}

	private JdbcTemplate getJdbcTemplate() {
		// TODO Auto-generated method stub
		return jdbcTemplate = new JdbcTemplate(dataSource);
	}

		}


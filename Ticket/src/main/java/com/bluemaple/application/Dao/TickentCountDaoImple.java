package com.bluemaple.application.Dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bluemaple.application.Model.MovieTiming;
import com.bluemaple.application.Model.TicketCountModel;
@Repository
public class TickentCountDaoImple implements TickentCountDao {

	
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
	public TicketCountModel tickettypeinsert(TicketCountModel countmodel) {
		// TODO Auto-generated method stub
		String inserttickettype = "insert into ticketamount(id,tickettype,ticketcount,createddate,updateddate) values(?,?,?,?,?)";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		System.out.println("14");
		jdbcTemplate.update(inserttickettype, new Object[] {countmodel.getId(),
				countmodel.getTickettype(),countmodel.getTicketcount(), countmodel.getDate(),
				countmodel.getDate() });
		System.out.println("15");
		
		System.out.println(countmodel);

		System.out.println("movieTiming insert successfull...!");

		return countmodel;


	}

	@Override
	public List<TicketCountModel> viewofticket() {
		// TODO Auto-generated method stub
		String type = "select * from ticketamount";
		System.out.println("57");
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<TicketCountModel> countmodel = getJdbcTemplate().query(type,
				new BeanPropertyRowMapper(TicketCountModel.class));

			System.out.println("58");
		return countmodel;

	}

	private JdbcTemplate getJdbcTemplate() {
		// TODO Auto-generated method stub
		return jdbcTemplate=new JdbcTemplate(dataSource);
	}

	@Override
	public Object updateticketrate(TicketCountModel countmodel) {
		// TODO Auto-generated method stub
		String update = "update ticketamount type set id=?,ticketcount=?,createddate=?,updateddate=?  where tickettype=?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		System.out.println("vikash");
		jdbcTemplate.update(
				update,
				new Object[] { 
						countmodel.getId(),countmodel.getTicketcount(),countmodel.getDate(),countmodel.getDate(),countmodel.getTickettype()});
System.out.println("kumar");
		return countmodel;
	

	}

}

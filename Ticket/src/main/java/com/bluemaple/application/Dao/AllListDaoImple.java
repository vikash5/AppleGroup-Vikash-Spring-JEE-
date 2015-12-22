package com.bluemaple.application.Dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bluemaple.application.Model.MovieModel;
import com.bluemaple.application.Model.MovieTiming;
import com.bluemaple.application.Model.ReservationModel;
import com.bluemaple.application.Model.TicketCountModel;

@Repository
public class AllListDaoImple implements AllListDao {

	

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
	public List<MovieModel> listofuser() {
		// TODO Auto-generated method stub
		String list = "select * from movies";
		//System.out.println("vvvvviiiiiiikkkkkkkk");
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<MovieModel> movie = getJdbcTemplate().query(list,
				new BeanPropertyRowMapper(MovieModel.class));
System.out.println(movie);
		return movie;

	}

	private JdbcTemplate getJdbcTemplate() {
		// TODO Auto-generated method stub
		return jdbcTemplate=new JdbcTemplate(dataSource);
	}


	@Override
	public List<MovieTiming> timing() {
		// TODO Auto-generated method stub
		String movietimingquery = "select * from timing";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<MovieTiming> movietime = getJdbcTemplate().query(movietimingquery,
				new BeanPropertyRowMapper(MovieTiming.class));
		System.out.println(movietime);
		return movietime;

	}

	private JdbcTemplate getJdbcTemplate1() {
		// TODO Auto-generated method stub
		return jdbcTemplate = new JdbcTemplate(dataSource);
	}


	@Override
	public List<TicketCountModel> viewofticket() {
		// TODO Auto-generated method stub
		String type = "select * from ticketamount";
		//System.out.println("57");
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<TicketCountModel> countmodel = getJdbcTemplate().query(type,
				new BeanPropertyRowMapper(TicketCountModel.class));

			System.out.println(countmodel);
		
		return countmodel;

	}

	private JdbcTemplate getJdbcTemplate2() {
		// TODO Auto-generated method stub
		return jdbcTemplate=new JdbcTemplate(dataSource);
	}



	@Override
	public List<ReservationModel> listofstatus() {
		// TODO Auto-generated method stub
		String booking = "select * from reservation status";
		//System.out.println("vvvvviiiiiiikkkkkkkk");
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<ReservationModel> bookedtiming = getJdbcTemplate().query(booking,
				new BeanPropertyRowMapper(ReservationModel.class));

		System.out.println(bookedtiming);	
		return bookedtiming;

	}


	private JdbcTemplate getJdbcTemplate3() {
		// TODO Auto-generated method stub
		return jdbcTemplate=new JdbcTemplate(dataSource);
	}


}

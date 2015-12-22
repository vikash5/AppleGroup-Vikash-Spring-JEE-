package com.bluemaple.application.Dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bluemaple.application.Model.MovieTiming;
import com.bluemaple.application.Model.ReservationModel;
import com.bluemaple.application.Model.TicketCountModel;

@Repository
public class RegistrationStatusDaoImple implements RegistrationStatusDao {

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
	public ReservationModel BookedTicket(ReservationModel reservation) {
		// TODO Auto-generated method stub
		String booked = "insert into reservation status(id,status,createddate,updateddate)values(?,?,?,?)";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(booked,
				new Object[] { reservation.getId(), reservation.getStatus(),
						reservation.getDate(), reservation.getDate() });

		System.out.println("Reservation Booked....!");
		return reservation;
	}

	@Override
	public List<ReservationModel> Listofstatus() {
		// TODO Auto-generated method stub
		String booking = "select * from reservation status";
		System.out.println("vvvvviiiiiiikkkkkkkk");
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<ReservationModel> bookedtiming = getJdbcTemplate().query(booking,
				new BeanPropertyRowMapper(ReservationModel.class));

			
		return bookedtiming;

	}


	private JdbcTemplate getJdbcTemplate() {
		// TODO Auto-generated method stub
		return jdbcTemplate=new JdbcTemplate(dataSource);
	}

	@Override
	public Object update(ReservationModel reservation) {
		// TODO Auto-generated method stub
		String update = "update reservation status set status=?,  where id=?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		System.out.println("vikash");
		jdbcTemplate.update(
				update,
				new Object[] { 
						reservation.getStatus(),reservation.getDate(),reservation.getDate(),reservation.getId()});
System.out.println("kumar");
		return reservation;
	

	}

}

package com.bluemaple.application.TicketReservationDao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.bluemaple.application.TicketReservationModel.TicketReservartionTiming;
import com.bluemaple.application.TicketReservationModel.TicketReservationModel;
import com.bluemaple.application.TicketReservationModel.TicketReservationMoviemodel;

@Repository
public class TicketReservationDaoImplementation implements TicketReservationDao {

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
	public TicketReservationModel insert(TicketReservationModel ticket) {
		// TODO Auto-generated method stub
		System.out.println("dao method");
		String name = ticket.getUsername();
		System.out.println(name);

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

	@Override
	public TicketReservationModel logincheck(String name1) {
		// TODO Auto-generated method stub

		// JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		System.out.println(name1);
		String query = "select * from persondetails where username=?";
		System.out.println(name1);
		TicketReservationModel ticket = (TicketReservationModel) getJdbcTemplate()
				.queryForObject(query, new Object[] { name1 },
						new TicketReservationCheck());
		String name = ticket.getUsername();
		System.out.println(name);
		return ticket;

	}

	private JdbcTemplate getJdbcTemplate() {
		// TODO Auto-generated method stub
		return jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public TicketReservationMoviemodel movieinsert(
			TicketReservationMoviemodel movie) {
		// TODO Auto-generated method stub

		/*
		 * String movieinsert =
		 * "insert into movies (listofmovies,release) values (?,?)";
		 */

		System.out.println("list of value " + movie.getListofmovies()
				+ "value are " + movie.getReleasedate());

		/* JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource); */
		System.out.println("vvvvvvvvvv");

		/*
		 * jdbcTemplate.update(movieinsert, new Object[] {
		 * movie.getListofmovies(), movie.getRelease() });
		 */

		String insert = "insert into movies(id,listofmovies,releasedate,noOfshow,createddate,updateddate) values(?,?,?,?,?,?)";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(
				insert,
				new Object[] { movie.getId(), movie.getListofmovies(),
						movie.getReleasedate(), movie.getNoOfshow(),
						movie.getDate(), movie.getDate() });

		System.out.println(movie);

		System.out.println("movie insert successfull...!");

		return movie;
	}

	@Override
	public List<TicketReservationMoviemodel> listuser() {
		// TODO Auto-generated method stub
		String list = "select * from movies";
		System.out.println("vvvvviiiiiiikkkkkkkk");
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<TicketReservationMoviemodel> movie = getJdbcTemplate().query(list,
				new BeanPropertyRowMapper(TicketReservationMoviemodel.class));

		return movie;
	}

	@Override
	public Object update(TicketReservationMoviemodel movie) {
		// TODO Auto-generated method stub

		String update = "update movies set releasedate=?, noOfshow=? where listofmovies=?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		System.out.println("vikash");
		jdbcTemplate.update(
				update,
				new Object[] { 
						movie.getReleasedate(), movie.getNoOfshow(),movie.getListofmovies()});
System.out.println("kumar");
		return movie;
	}

	@Override
	public TicketReservartionTiming movietiming(TicketReservartionTiming mtime) {
		// TODO Auto-generated method stub
		
		String insertmovietiming = "insert into timings(id,timings,createddate,updateddate) values(?,?,?,?)";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(
				insertmovietiming,
				new Object[] {mtime.getId(),mtime.getTimings(),mtime.getDate(),mtime.getDate() });
System.out.println("pandi");
		System.out.println(mtime);

		System.out.println("movieTiming insert successfull...!");

		return mtime;

		
	}

	@Override
	public List<TicketReservartionTiming> timing() {
		// TODO Auto-generated method stub
		String timing = "select * from timings";
		System.out.println("vvvvviiiiiiikkkkkkkk");
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<TicketReservartionTiming> mtime = getJdbcTemplate().query(timing,
				new BeanPropertyRowMapper(TicketReservartionTiming.class));

			
		return mtime;
	}

}

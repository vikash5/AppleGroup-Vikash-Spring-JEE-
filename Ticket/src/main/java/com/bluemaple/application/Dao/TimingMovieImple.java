package com.bluemaple.application.Dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bluemaple.application.Model.MovieTiming;

@Repository
public class TimingMovieImple implements TimingMovie {

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
	public MovieTiming insert(MovieTiming movietime) {
		// TODO Auto-generated method stub
		System.out.println("13");
		String insertmovietiming = "insert into timing(id,timings,createddate,updateddate) values(?,?,?,?)";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		System.out.println("14");
		jdbcTemplate.update(insertmovietiming, new Object[] {
				movietime.getId(), movietime.getTimings(), movietime.getDate(),
				movietime.getDate() });
		System.out.println("15");

		System.out.println(movietime);

		System.out.println("movieTiming insert successfull...!");

		return movietime;

	}

	@Override
	public List<MovieTiming> listofuser() {
		// TODO Auto-generated method stub
		String movietimingquery = "select * from timing";

		//JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<MovieTiming> movietime = getJdbcTemplate().query(movietimingquery,
				new BeanPropertyRowMapper(MovieTiming.class));

		return movietime;

	}

	private JdbcTemplate getJdbcTemplate() {
		// TODO Auto-generated method stub
		return jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Object update(MovieTiming movietime) {
		// TODO Auto-generated method stub
		String update = "update timing set timings=?,createddate=?,updateddate=?  where id=?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(update, new Object[] { movietime.getTimings(),
				movietime.getDate(), movietime.getDate(), movietime.getId() });

		return movietime;

	}

}

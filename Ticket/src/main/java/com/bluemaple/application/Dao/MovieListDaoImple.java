package com.bluemaple.application.Dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bluemaple.application.Model.MovieModel;
import com.bluemaple.application.Model.TicketModel;
@Repository
public class MovieListDaoImple implements MovieListDao {
	
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
	public MovieModel movieinsert(MovieModel movie) {
		// TODO Auto-generated method stub
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
	public MovieModel movieid(String name) {
		// TODO Auto-generated method stub
		System.out.println("movieeee4");
		System.out.println(name);
		String query = "select * from movies where listofmovies=?";
		System.out.println(name);
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		@SuppressWarnings("unchecked")
		MovieModel movie = (MovieModel) getJdbcTemplate()
				.queryForObject(query, new Object[] { name },
						 new Movieidrowmapper());
		//int id=movie.getId();
		System.out.println("movieeeee5");
		return movie;

	}


	@Override
	public List<MovieModel> listuser() {
		// TODO Auto-generated method stub
		String list = "select * from movies";
		System.out.println("vvvvviiiiiiikkkkkkkk");
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<MovieModel> movie = getJdbcTemplate().query(list,
				new BeanPropertyRowMapper(MovieModel.class));

		return movie;

	}

	private JdbcTemplate getJdbcTemplate() {
		// TODO Auto-generated method stub
		return jdbcTemplate=new JdbcTemplate(dataSource);
	}

	@Override
	public Object update(MovieModel movie) {
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

	}

package com.bluemaple.application.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bluemaple.application.Model.MovieModel;


public class Movieidrowmapper implements RowMapper {
	
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("rowmapper");
		MovieModel movie = new MovieModel();
		
		movie.setId(rs.getInt("id"));
		
			
		return movie;

	}


}

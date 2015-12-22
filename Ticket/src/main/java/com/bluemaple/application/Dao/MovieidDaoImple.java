package com.bluemaple.application.Dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MovieidDaoImple implements MovieidDao {
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
	public void movieid(int id1, int movieid) {
		// TODO Auto-generated method stub
		System.out.println("movieeee6");
		String insert = "insert into movies_list_has_timings(movies_id,timings_id) values(?,?)";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(
				insert,
				new Object[] { 
						id1,movieid
				});
		
				
	}
	

}

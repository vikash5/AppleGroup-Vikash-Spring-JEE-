
package com.bluemaple.application.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluemaple.application.Dao.MovieListDao;
import com.bluemaple.application.Model.MovieModel;
@Service
public class InsertListMovieServiceimple implements InsertListMovieService{
  @Autowired
	MovieListDao movielistdao;
	
	@Override
	public MovieModel movieinsert(MovieModel movie) {
		// TODO Auto-generated method stub
		return movielistdao.movieinsert(movie);
	}

	@Override
	public List<MovieModel> listuser() {
		// TODO Auto-generated method stub
		return movielistdao.listuser();
	}

	@Override
	public Object update(MovieModel movie) {
		// TODO Auto-generated method stub
		return movielistdao.update(movie);
	}

}

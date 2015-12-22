package com.bluemaple.application.Service;

import java.util.List;

import com.bluemaple.application.Model.MovieModel;
import com.bluemaple.application.Model.MovieTiming;

public interface InsertListMovieService {

	//public MovieModel movieinsert(MovieModel movie);

	public List<MovieModel> listuser();

	public Object update(MovieModel movie);

	public void movieinsert(MovieModel movie, String[] time);

	//public void movieinsert(MovieModel movie, String[] time);

	//public void movieinsert(MovieModel movie, String[] time);

	//public void movieinsert(MovieModel movie, String[] time);

	

}

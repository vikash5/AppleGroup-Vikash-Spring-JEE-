package com.bluemaple.application.Service;

import java.util.List;

import com.bluemaple.application.Model.MovieModel;

public interface InsertListMovieService {

	public MovieModel movieinsert(MovieModel movie);

	public List<MovieModel> listuser();

	public Object update(MovieModel movie);

}

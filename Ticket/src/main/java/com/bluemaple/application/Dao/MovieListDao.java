package com.bluemaple.application.Dao;

import java.util.List;

import com.bluemaple.application.Model.MovieModel;

public interface MovieListDao {

  public MovieModel movieinsert(MovieModel movie);

	public List<MovieModel> listuser();

	public Object update(MovieModel movie);

	public MovieModel movieid(String name);

}

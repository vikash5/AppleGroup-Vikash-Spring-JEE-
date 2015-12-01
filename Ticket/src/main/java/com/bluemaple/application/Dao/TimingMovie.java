package com.bluemaple.application.Dao;

import java.util.List;

import com.bluemaple.application.Model.MovieTiming;

public interface TimingMovie {

	public MovieTiming insert(MovieTiming movietime);

	public List<MovieTiming> listofuser();

	public Object update(MovieTiming movietime);

	
}

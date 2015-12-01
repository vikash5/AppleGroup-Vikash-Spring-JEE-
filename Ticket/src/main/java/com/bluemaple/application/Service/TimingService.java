package com.bluemaple.application.Service;

import java.util.List;

import com.bluemaple.application.Model.MovieTiming;

public interface TimingService {

	

	public List<MovieTiming> timing();

	public Object update(MovieTiming movie);

	public MovieTiming movieinsert(MovieTiming movietime);

	
}

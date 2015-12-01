package com.bluemaple.application.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluemaple.application.Dao.TimingMovie;
import com.bluemaple.application.Model.MovieTiming;
@Service
public class TimingServiceImple implements TimingService {

	@Autowired
	TimingMovie timingMovie;

	/*@Override
	public void movietiming(MovieTiming movietime) {
		// TODO Auto-generated method stub
		System.out.println("12");
		return timingMovie.insert(movietime);
		
	}*/

	@Override
	public List<MovieTiming> timing() {
		// TODO Auto-generated method stub
		return timingMovie.listofuser();
	}

	@Override
	public Object update(MovieTiming movietime) {
		// TODO Auto-generated method stub
		return timingMovie.update(movietime);
	}

	@Override
	public MovieTiming movieinsert(MovieTiming movietime) {
		// TODO Auto-generated method stub
		return timingMovie.insert(movietime);
	}
	
}

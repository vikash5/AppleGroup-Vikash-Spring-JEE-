
package com.bluemaple.application.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluemaple.application.Dao.MovieListDao;
import com.bluemaple.application.Dao.MovieidDao;
import com.bluemaple.application.Model.MovieModel;
@Service
public class InsertListMovieServiceimple implements InsertListMovieService{
 // private static final String  = null;
@Autowired
	MovieListDao movielistdao;
@Autowired
MovieidDao movieiddao;
	
	@Override
	public void movieinsert(MovieModel movie, String[] time) {
		// TODO Auto-generated method stub
		
		String name=movie.getListofmovies();
		System.out.println("movieeeee1");
		 movielistdao.movieinsert(movie);
		 MovieModel movie1= movielistdao.movieid(name);
		 int movieid=movie1.getId();
		 for(int i=0;i<time.length;i++)
		 {
			 int id1=Integer.parseInt(time[i]);
		System.out.println("movieeeee2");
		 movieiddao.movieid(id1,movieid);
		 }
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

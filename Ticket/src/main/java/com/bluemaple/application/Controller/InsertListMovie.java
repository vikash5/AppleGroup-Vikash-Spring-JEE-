package com.bluemaple.application.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bluemaple.application.Model.MovieModel;
import com.bluemaple.application.Model.MovieTiming;
import com.bluemaple.application.Service.InsertListMovieService;

@Controller
public class InsertListMovie
{
@Autowired
InsertListMovieService insertlistmovieservice;
	
@RequestMapping(value = "/insertmovie", method = RequestMethod.POST)
public ModelAndView timing() {
	ModelAndView view = new ModelAndView();
	System.out.println("qwertyuuuuuuuuuui");
	view.setViewName("insertmovie");
	return view;
}
@RequestMapping(value = "/insertmovie1", method = RequestMethod.POST)
public ModelAndView movieinsert(HttpServletRequest request,HttpServletResponse response) {
	// ModelAndView view=new ModelAndView();
	System.out.println("11");
	int id=Integer.parseInt(request.getParameter("id"));
	String listofmovies=request.getParameter("listofmovies");
	String releasedate=request.getParameter("releasedate");
	String noOfshow=request.getParameter("noOfshow");
	MovieModel movie=new MovieModel();
	movie.setId(id);
	movie.setListofmovies(listofmovies);
	movie.setReleasedate(releasedate);
	movie.setNoOfshow(noOfshow);
	String time[]=request.getParameterValues("count");
	System.out.println("movieeeeeeeeee");
	insertlistmovieservice.movieinsert(movie,time);
	String msg = "movieee insert sucessfully";
	return new ModelAndView("admin", "msg", msg);
}
@RequestMapping(value = "/moviedetails",method = RequestMethod.POST)
public ModelAndView timing(ModelAndView movie) throws IOException {
	System.out.println("controller method");
	List<MovieModel> list = insertlistmovieservice.listuser();
	System.out.println(list);
	movie.addObject("movie", list);
	movie.setViewName("admin");

	return movie;
}
@RequestMapping(value = "/edit")
public ModelAndView timing1() {
	ModelAndView view = new ModelAndView();
	System.out.println("qwertyuuuuuuuuuui");
	view.setViewName("update");
	return view;
}

@RequestMapping(value = "/admin", method = RequestMethod.POST)
public ModelAndView update(@ModelAttribute MovieModel movie) {
	// System.out.println("controller method");
	insertlistmovieservice.update(movie);
	String msg = "movie update success...!";
	return new ModelAndView("admin", "msg", msg);

}

	
	
	
}

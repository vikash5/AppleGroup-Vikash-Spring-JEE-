package com.bluemaple.application.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bluemaple.application.Model.MovieModel;
import com.bluemaple.application.Service.InsertListMovieService;
@Controller
public class InsertListMovie {
	@Autowired
	InsertListMovieService insertlistmovieservice;
	
	@RequestMapping(value = "/insertmovie", method = RequestMethod.POST)
	public ModelAndView admin() {
		ModelAndView view = new ModelAndView();
		view.setViewName("insertmovie");
		return view;
	}

	@RequestMapping(value = "/insertmovie1", method = RequestMethod.POST)
	public ModelAndView movieinsert(
			@ModelAttribute MovieModel movie) {
		// ModelAndView view=new ModelAndView();
		insertlistmovieservice.movieinsert(movie);
		String msg = "movie insert sucessfully";
		return new ModelAndView("admin", "msg", msg);
	}

	@RequestMapping(value = "/moviedetails")
	public ModelAndView listuser(ModelAndView movie) throws IOException {
		System.out.println("controller method");
		List<MovieModel> list = insertlistmovieservice
				.listuser();
		System.out.println(list);
		movie.addObject("movie", list);
		movie.setViewName("moviedetails");

		return movie;
	}

	@RequestMapping(value = "/edit")
	public ModelAndView edit() {
		ModelAndView view = new ModelAndView();
		view.setViewName("update");
		return view;
	}

	@RequestMapping(value = "/admin", method = RequestMethod.POST)
	public ModelAndView update(@ModelAttribute MovieModel movie) {
		// System.out.println("controller method");
		insertlistmovieservice.update(movie);
		String msg = "movie update page";
		return new ModelAndView("admin", "msg", msg);

	}

}

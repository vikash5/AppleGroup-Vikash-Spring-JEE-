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
import com.bluemaple.application.Model.MovieTiming;
import com.bluemaple.application.Service.TimingService;
@Controller
public class InsertTiming {
	@Autowired
	TimingService timingservice;
	
	@RequestMapping(value = "/movie", method = RequestMethod.POST)
	public ModelAndView timing() {
		ModelAndView view = new ModelAndView();
		System.out.println("qwertyuuuuuuuuuui");
		view.setViewName("movietiming");
		return view;
	}
	@RequestMapping(value = "/motiming", method = RequestMethod.POST)
	public ModelAndView movieinsert(
			@ModelAttribute MovieTiming movietime) {
		// ModelAndView view=new ModelAndView();
		System.out.println("11");
		timingservice.movieinsert(movietime);
		String msg = "movieTime insert sucessfully";
		return new ModelAndView("admin", "msg", msg);
	}
	@RequestMapping(value = "/timing",method = RequestMethod.POST)
	public ModelAndView timing(ModelAndView movietime) throws IOException {
		System.out.println("controller method");
		List<MovieTiming> list = timingservice.timing();
		System.out.println(list);
		movietime.addObject("mtime", list);
		movietime.setViewName("admin");

		return movietime;
	}
	@RequestMapping(value = "/edittime")
	public ModelAndView timing1() {
		ModelAndView view = new ModelAndView();
		System.out.println("qwertyuuuuuuuuuui");
		view.setViewName("updatetime");
		return view;
	}
	
	@RequestMapping(value = "/returnadmin", method = RequestMethod.POST)
	public ModelAndView update(@ModelAttribute MovieTiming movie) {
		// System.out.println("controller method");
		timingservice.update(movie);
		String msg = "movietime update success...!";
		return new ModelAndView("admin", "msg", msg);

	}



}

package com.bluemaple.application.TicketReservationController;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bluemaple.application.TicketReservationModel.TicketReservartionTiming;
import com.bluemaple.application.TicketReservationModel.TicketReservationModel;
import com.bluemaple.application.TicketReservationModel.TicketReservationMoviemodel;
import com.bluemaple.application.TicketReservationService.TicketReservationService;

@Controller
public class TicketReservationController {

	@Autowired
	private TicketReservationService ticketreservationservice;

	@RequestMapping(value = "/reg", method = RequestMethod.POST)
	public ModelAndView insert(@ModelAttribute TicketReservationModel ticket) {
		// ModelAndView view=new ModelAndView();
		ticketreservationservice.insert(ticket);
		String msg = "Register sucessfully";
		return new ModelAndView("home", "msg", msg);
	}


	@RequestMapping(value = "/Register", method = RequestMethod.POST)
	public ModelAndView insert11() {
		ModelAndView view = new ModelAndView();
		view.setViewName("moviedetails");
		return view;
	}

	
	@RequestMapping(value = "/Register", method = RequestMethod.POST)
	public ModelAndView insert1() {
		ModelAndView view = new ModelAndView();
		view.setViewName("Registration");
		return view;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView insert1(@ModelAttribute TicketReservationModel ticket) {
		// public ModelAndView insert1(@RequestParam("username")String name){
		// TicketReservationModel ticket=new TicketReservationModel();
		// String name=ticket.setUsername("username");
		// String pass=ticket.setPassword("password");
		System.out.println("name");
		TicketReservationModel value = ticketreservationservice
				.logincheck(ticket);

		if (value.getRole_id() == 1) {
			String msg = "WELCOME TO ADMIN PAGE";
			return new ModelAndView("admin", "msg", msg);

		} else if (value.getRole_id() == 2) {
			// int id=ticket.getRole_id();
			String msg = "WELCOME TO USER PAGE";
			return new ModelAndView("user", "msg", msg);
		} else {
			String msg = "sorry login failed";
			return new ModelAndView("home", "msg", msg);
		}
	}

	@RequestMapping(value = "/insertmovie", method = RequestMethod.POST)
	public ModelAndView admin() {
		ModelAndView view = new ModelAndView();
		view.setViewName("insertmovie");
		return view;
	}

	@RequestMapping(value = "/insertmovie1", method = RequestMethod.POST)
	public ModelAndView movieinsert(
			@ModelAttribute TicketReservationMoviemodel movie) {
		// ModelAndView view=new ModelAndView();
		ticketreservationservice.movieinsert(movie);
		String msg = "movie insert sucessfully";
		return new ModelAndView("admin", "msg", msg);
	}

	@RequestMapping(value = "/moviedetails")
	public ModelAndView listuser(ModelAndView movie) throws IOException {
		System.out.println("controller method");
		List<TicketReservationMoviemodel> list = ticketreservationservice
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
	public ModelAndView update(@ModelAttribute TicketReservationMoviemodel movie) {
		// System.out.println("controller method");
		ticketreservationservice.update(movie);
		String msg = "movie update page";
		return new ModelAndView("admin", "msg", msg);

	}

	@RequestMapping(value = "/movietiming", method = RequestMethod.POST)
	public ModelAndView timing() {
		ModelAndView view = new ModelAndView();
		System.out.println("qwertyuuuuuuuuuui");
		view.setViewName("movietiming");
		return view;
	}
	@RequestMapping(value = "/motiming", method = RequestMethod.POST)
	public ModelAndView movieinsert(
			@ModelAttribute TicketReservartionTiming mtime) {
		// ModelAndView view=new ModelAndView();
		ticketreservationservice.movietiming(mtime);
		String msg = "movie insert sucessfully";
		return new ModelAndView("admin", "msg", msg);
	}
	@RequestMapping(value = "/movi")
	public ModelAndView timing(ModelAndView mtime) throws IOException {
		System.out.println("controller method");
		List<TicketReservartionTiming> list = ticketreservationservice.timing();
		System.out.println(list);
		mtime.addObject("movie", list);
		mtime.setViewName("moviedetails");

		return mtime;
	}
	
}

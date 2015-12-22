package com.bluemaple.application.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bluemaple.application.Dao.TicketDao;
import com.bluemaple.application.Model.TicketModel;
import com.bluemaple.application.Service.TicketService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class Ticketcontroller {
	@Autowired
	TicketService ticketservice;
	
	@RequestMapping(value = "/Register", method = RequestMethod.POST)
	public ModelAndView register() {
		ModelAndView view = new ModelAndView();
		view.setViewName("Registration");
		return view;
	}
	
	@RequestMapping(value = "/reg", method = RequestMethod.POST)
	public ModelAndView insert(@ModelAttribute TicketModel ticket) {
		// ModelAndView view=new ModelAndView();
		ticketservice.insert(ticket);
		String msg = "Register sucessfully";
		return new ModelAndView("home", "msg", msg);
	}
	
		}

	


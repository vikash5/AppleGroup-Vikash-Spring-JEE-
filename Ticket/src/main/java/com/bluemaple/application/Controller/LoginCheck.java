package com.bluemaple.application.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bluemaple.application.Model.TicketModel;
import com.bluemaple.application.Service.LoginService;
import com.bluemaple.application.Service.TicketService;
@Controller
public class LoginCheck {
	
	@Autowired
	LoginService loginservice;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView insert1(@ModelAttribute TicketModel ticket) {
		// public ModelAndView insert1(@RequestParam("username")String name){
		// TicketReservationModel ticket=new TicketReservationModel();
		// String name=ticket.setUsername("username");
		// String pass=ticket.setPassword("password");
		System.out.println("name");
		TicketModel value = loginservice
				.logincheck(ticket);

		if (value.getRole_id() == 1) {
			//String msg = "WELCOME TO ADMIN PAGE";
			return new ModelAndView("redirect:/all");

		} else if (value.getRole_id() == 2) {
			// int id=ticket.getRole_id();
			String msg = "WELCOME TO USER PAGE";
			return new ModelAndView("user", "msg", msg);
		} else {
			String msg = "sorry login failed";
			return new ModelAndView("home", "msg", msg);
		}
	}


}

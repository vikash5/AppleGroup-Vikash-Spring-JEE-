package com.bluemaple.application.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bluemaple.application.Model.ReservationModel;
import com.bluemaple.application.Model.TicketCountModel;
import com.bluemaple.application.Service.RegistrationStatusService;

@Controller
public class ReservationController {
	@Autowired
	RegistrationStatusService registrationstatusservice;

	@RequestMapping(value = "/booked", method = RequestMethod.POST)
	public ModelAndView bookedpage() {
		ModelAndView view = new ModelAndView();
		view.setViewName("booked");
		return view;

	}

	@RequestMapping(value = "/ticketbook", method = RequestMethod.POST)
	public ModelAndView movieinsert(@ModelAttribute ReservationModel reservation) {
		// ModelAndView view=new ModelAndView();
		System.out.println("11");
		registrationstatusservice.BookedTicket(reservation);
		String msg = "movieTicketStatus insert sucessfully";
		return new ModelAndView("Admin dashboard", "msg", msg);
	}

	@RequestMapping(value = "/registrationstatus", method = RequestMethod.POST)
	public ModelAndView timing(ModelAndView reservation) throws IOException {
		System.out.println("controller method");
		List<ReservationModel> list = registrationstatusservice.Listofstatus();
		System.out.println(list);
		reservation.addObject("bookingedit", list);
		reservation.setViewName("Admin dashboard");

		return reservation;
	}

	@RequestMapping(value = "/Ticketupdate", method = RequestMethod.POST)
	public ModelAndView update(@ModelAttribute ReservationModel reservation) {
		// System.out.println("controller method");
		registrationstatusservice.update(reservation);
		String msg = "movieTicketStatus update page";
		return new ModelAndView("Admin dashboard", "msg", msg);

	}

}

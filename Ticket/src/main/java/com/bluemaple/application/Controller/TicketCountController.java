package com.bluemaple.application.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bluemaple.application.Model.MovieTiming;
import com.bluemaple.application.Model.TicketCountModel;
import com.bluemaple.application.Service.TickentCountService;

@Controller
public class TicketCountController {
	@Autowired
	TickentCountService tickentcountservice;

	@RequestMapping(value = "/tickettypecount", method = RequestMethod.POST)
	public ModelAndView rateshow() {
		ModelAndView view = new ModelAndView();
		System.out.println("qwertyuuuuuuuuuui");
		view.setViewName("movieticket");
		return view;
	}

	@RequestMapping(value = "/ratecount", method = RequestMethod.POST)
	public ModelAndView ticketrateinsert(@ModelAttribute TicketCountModel countmodel) {
		// ModelAndView view=new ModelAndView();
		System.out.println("11");
		tickentcountservice.tickettypeinsert(countmodel);
		String msg = "movieTicketRate insert sucessfully";
		return new ModelAndView("admin", "msg", msg);
	}

	@RequestMapping(value = "/Ticketrateofclass", method = RequestMethod.POST)
	public ModelAndView rateshow1(ModelAndView countmodel) throws IOException {
		System.out.println("controller method");
		System.out.println("55");
		List<TicketCountModel> list = tickentcountservice.viewofticket();
		System.out.println(list);
		countmodel.addObject("ticketclassrate", list);
		countmodel.setViewName("admin");

		return countmodel;
	}
	@RequestMapping(value = "/editticket", method = RequestMethod.POST)
	public ModelAndView timing1() {
		ModelAndView view = new ModelAndView();
		System.out.println("qwertyuuuuuuuuuui");
		view.setViewName("updateticketrate");
		return view;
	}


	@RequestMapping(value = "/updatecount", method = RequestMethod.POST)
	public ModelAndView updaterate(@ModelAttribute TicketCountModel countmodel) {
		// System.out.println("controller method");
		tickentcountservice.updateticketrate(countmodel);
		String msg = "movieTicketRate update page";
		return new ModelAndView("admin", "msg", msg);

	}

}

package com.bluemaple.application.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bluemaple.application.Model.MovieModel;
import com.bluemaple.application.Model.MovieTiming;
import com.bluemaple.application.Model.ReservationModel;
import com.bluemaple.application.Model.TicketCountModel;
import com.bluemaple.application.Service.AllListService;

@Controller
public class AllListController {

	@Autowired
	AllListService alllistservice;

	@RequestMapping(value = "/all")
	public ModelAndView listuser() throws IOException {
		//System.out.println("controller method");
		List<MovieModel> moviemodel = alllistservice.listuser();

		List<MovieTiming> movietiming = alllistservice.timing();
		List<TicketCountModel> ticketcountmodel = alllistservice.viewofticket();
		List<ReservationModel> reservationmodel = alllistservice.Listofstatus();

		Map<String, Object> strobj = new HashMap<String, Object>();
		List<Map> datamap = new ArrayList<Map>();
		Map mapobject = new HashMap();
		mapobject.put("moviemodel", moviemodel);
		mapobject.put("movietiming", movietiming);
		mapobject.put("ticketcountmodel", ticketcountmodel);
		mapobject.put("reservationmodel", reservationmodel);
		System.out.println(strobj);
		datamap.add(mapobject);
		strobj.put("datamap", datamap);
		System.out.println(strobj);
		return new ModelAndView("Admin dashboard", "admin", strobj);

	}
}

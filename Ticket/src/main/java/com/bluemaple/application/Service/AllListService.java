package com.bluemaple.application.Service;

import java.util.List;

import com.bluemaple.application.Model.MovieModel;
import com.bluemaple.application.Model.MovieTiming;
import com.bluemaple.application.Model.ReservationModel;
import com.bluemaple.application.Model.TicketCountModel;

public interface AllListService {

	public List<MovieModel> listuser();

	public List<MovieTiming> timing();

	public List<TicketCountModel> viewofticket();
   
	public List<ReservationModel> Listofstatus();

}

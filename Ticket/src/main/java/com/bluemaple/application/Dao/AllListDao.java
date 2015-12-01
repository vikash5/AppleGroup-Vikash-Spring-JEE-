package com.bluemaple.application.Dao;

import java.util.List;

import com.bluemaple.application.Model.MovieModel;
import com.bluemaple.application.Model.MovieTiming;
import com.bluemaple.application.Model.ReservationModel;
import com.bluemaple.application.Model.TicketCountModel;

public interface AllListDao {

	public List<MovieModel> listofuser();

	public List<MovieTiming> timing();

	public List<TicketCountModel> viewofticket();

	public List<ReservationModel> listofstatus();

}

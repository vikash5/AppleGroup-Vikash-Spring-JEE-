package com.bluemaple.application.TicketReservationDao;

import java.util.List;

import com.bluemaple.application.TicketReservationModel.TicketReservartionTiming;
import com.bluemaple.application.TicketReservationModel.TicketReservationModel;
import com.bluemaple.application.TicketReservationModel.TicketReservationMoviemodel;

public interface TicketReservationDao {

	public TicketReservationModel insert(TicketReservationModel ticket);

	public TicketReservationModel logincheck(String name1);

	public TicketReservationMoviemodel movieinsert(
			TicketReservationMoviemodel movie);

	public List<TicketReservationMoviemodel> listuser();

	public Object update(TicketReservationMoviemodel movie);

	public TicketReservartionTiming movietiming(TicketReservartionTiming mtime);

	
	public List<TicketReservartionTiming> timing();

	

}

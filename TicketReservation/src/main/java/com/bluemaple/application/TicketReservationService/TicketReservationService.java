package com.bluemaple.application.TicketReservationService;

import java.util.List;

import com.bluemaple.application.TicketReservationModel.TicketReservartionTiming;
import com.bluemaple.application.TicketReservationModel.TicketReservationModel;
import com.bluemaple.application.TicketReservationModel.TicketReservationMoviemodel;

public interface TicketReservationService {

	public TicketReservationModel insert(TicketReservationModel ticket);

	public TicketReservationModel logincheck(TicketReservationModel ticket);

	public TicketReservationMoviemodel movieinsert(
			TicketReservationMoviemodel movie);

	public List<TicketReservationMoviemodel> listuser();

	

	public Object update(TicketReservationMoviemodel movie);

	public TicketReservartionTiming movietiming(TicketReservartionTiming mtime);

	public List<TicketReservartionTiming> timing();

}

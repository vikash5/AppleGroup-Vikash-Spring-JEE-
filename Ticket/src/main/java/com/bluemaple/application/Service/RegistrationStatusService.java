package com.bluemaple.application.Service;

import java.util.List;

import com.bluemaple.application.Model.ReservationModel;
import com.bluemaple.application.Model.TicketCountModel;

public interface RegistrationStatusService {

	public ReservationModel BookedTicket(ReservationModel reservation);

	public List<ReservationModel> Listofstatus();

	public Object update(ReservationModel reservation);

	

	
	

}

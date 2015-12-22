package com.bluemaple.application.Dao;

import java.util.List;

import com.bluemaple.application.Model.ReservationModel;
import com.bluemaple.application.Model.TicketCountModel;

public interface RegistrationStatusDao {

	public ReservationModel BookedTicket(ReservationModel reservation);

	public List<ReservationModel> Listofstatus();

	public Object update(ReservationModel reservation);

	

}

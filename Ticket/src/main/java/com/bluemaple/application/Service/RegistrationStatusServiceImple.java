package com.bluemaple.application.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluemaple.application.Dao.RegistrationStatusDao;
import com.bluemaple.application.Model.ReservationModel;
import com.bluemaple.application.Model.TicketCountModel;
@Service
public class RegistrationStatusServiceImple  implements RegistrationStatusService{

	@Autowired
	RegistrationStatusDao registrationstatusdao;

	@Override
	public ReservationModel BookedTicket(ReservationModel reservation) {
		// TODO Auto-generated method stub
		return registrationstatusdao.BookedTicket(reservation);
	}

	@Override
	public List<ReservationModel> Listofstatus() {
		// TODO Auto-generated method stub
		return registrationstatusdao.Listofstatus();
	}

	@Override
	public Object update(ReservationModel reservation) {
		// TODO Auto-generated method stub
		return registrationstatusdao.update(reservation);
	}
	}

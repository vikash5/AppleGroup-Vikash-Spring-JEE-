package com.bluemaple.application.Service;

import java.util.List;

import com.bluemaple.application.Model.TicketCountModel;

public interface TickentCountService {

	public TicketCountModel tickettypeinsert(TicketCountModel countmodel);

	public List<TicketCountModel> viewofticket();

	public Object updateticketrate(TicketCountModel countmodel);
	
	

}

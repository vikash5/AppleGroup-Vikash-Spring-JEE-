package com.bluemaple.application.Dao;

import java.util.List;

import com.bluemaple.application.Model.TicketCountModel;

public interface TickentCountDao {

	public TicketCountModel tickettypeinsert(TicketCountModel countmodel);

	public List<TicketCountModel> viewofticket();

	public Object updateticketrate(TicketCountModel countmodel);

}

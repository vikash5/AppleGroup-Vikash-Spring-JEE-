package com.bluemaple.application.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluemaple.application.Dao.TicketDao;
import com.bluemaple.application.Model.TicketModel;
@Service
public class TicketServiceImpl implements TicketService {
	
	@Autowired
	TicketDao ticketdao;

	@Override
	public TicketModel insert(TicketModel ticket) {
		return ticketdao.insert(ticket);
		
	}

	

	
}

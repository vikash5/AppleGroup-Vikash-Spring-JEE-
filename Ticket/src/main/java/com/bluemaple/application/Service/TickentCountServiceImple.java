package com.bluemaple.application.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluemaple.application.Dao.TickentCountDao;
import com.bluemaple.application.Model.TicketCountModel;
@Service
public class TickentCountServiceImple implements TickentCountService {

	
	@Autowired
	TickentCountDao tickentcountdao;
	@Override
	public TicketCountModel tickettypeinsert(TicketCountModel countmodel) {
		// TODO Auto-generated method stub
		return tickentcountdao.tickettypeinsert(countmodel);
	}

	@Override
	public List<TicketCountModel> viewofticket() {
		// TODO Auto-generated method stub
		System.out.println("56");
		return tickentcountdao.viewofticket();
	}

	@Override
	public Object updateticketrate(TicketCountModel countmodel) {
		// TODO Auto-generated method stub
		return tickentcountdao.updateticketrate(countmodel);
	}

}

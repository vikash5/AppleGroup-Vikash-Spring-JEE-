package com.bluemaple.application.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluemaple.application.Dao.AllListDao;
import com.bluemaple.application.Model.MovieModel;
import com.bluemaple.application.Model.MovieTiming;
import com.bluemaple.application.Model.ReservationModel;
import com.bluemaple.application.Model.TicketCountModel;

@Service
public class AllListServiceImple implements AllListService {

	@Autowired
	AllListDao alllistdao;

	@Override
	public List<MovieModel> listuser() {
		// TODO Auto-generated method stub
		System.out.println(alllistdao.listofuser());
		return alllistdao.listofuser();
	}

	@Override
	public List<MovieTiming> timing() {
		// TODO Auto-generated method stub
		System.out.println(alllistdao.timing());
		return alllistdao.timing();
	}

	@Override
	public List<TicketCountModel> viewofticket() {
		// TODO Auto-generated method stub
		System.out.println(alllistdao.viewofticket());
		return alllistdao.viewofticket();
	}

	@Override
	public List<ReservationModel> Listofstatus() {
		// TODO Auto-generated method stub
		System.out.println(alllistdao.listofstatus());
		return alllistdao.listofstatus();
	}
}

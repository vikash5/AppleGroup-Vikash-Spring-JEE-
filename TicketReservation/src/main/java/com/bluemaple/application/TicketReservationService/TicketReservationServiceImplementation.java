package com.bluemaple.application.TicketReservationService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.bluemaple.application.TicketReservationDao.TicketReservationDao;
import com.bluemaple.application.TicketReservationModel.TicketReservartionTiming;
import com.bluemaple.application.TicketReservationModel.TicketReservationModel;
import com.bluemaple.application.TicketReservationModel.TicketReservationMoviemodel;

@Service
public class TicketReservationServiceImplementation implements
		TicketReservationService {
	@Autowired
	TicketReservationDao ticketreservationdao;

	@Override
	public TicketReservationModel insert(TicketReservationModel ticket) {
		// TODO Auto-generated method stub
		System.out.println("dfghjdfgh");
		return ticketreservationdao.insert(ticket);
	}

	@Override
	public TicketReservationModel logincheck(TicketReservationModel ticket) {
		// TODO Auto-generated method stub

		String name1 = ticket.getUsername();
		String pass1 = ticket.getPassword();
		//int role1 = ticket.getRole_id();
		System.out.println(name1);
		System.out.println("zdxfcgvhbj");

		TicketReservationModel check = ticketreservationdao.logincheck(name1);
		String name = check.getUsername();
		String pass = check.getPassword();
		int role = check.getRole_id();
		System.out.println("zxfcgvh");
		if ((name1.equals(name)) && (pass1.equals(pass)) && (role == 1)) {
			// System.out.println("admin pageeeee");
			// String msg="admin page";
			check.setRole_id(1);
			System.out.println(name);
			System.out.println(pass);
			//System.out.println(role);

		} else if ((name1.equals(name)) && (pass1.equals(pass))
				&& (role == 2)) {
			System.out.println("user pageeeeee");
			// String msg="admin page";
			check.setRole_id(2);
			System.out.println(name);
			System.out.println(pass);
			//System.out.println(role);

		}
		else{
			check.setRole_id(3);
		}
		return check;

	}

	@Override
	public TicketReservationMoviemodel movieinsert(TicketReservationMoviemodel movie) {
		// TODO Auto-generated method stub
		return ticketreservationdao.movieinsert(movie);

	}

	@Override
	public List<TicketReservationMoviemodel> listuser() {
		// TODO Auto-generated method stub
		return ticketreservationdao.listuser();
	}

	@Override
	public Object update(TicketReservationMoviemodel movie) {
		// TODO Auto-generated method stub
		return ticketreservationdao.update(movie);
		
	}

	@Override
	public TicketReservartionTiming movietiming(TicketReservartionTiming mtime) {
		// TODO Auto-generated method stub
		return ticketreservationdao.movietiming(mtime);
		
	}

	@Override
	public List<TicketReservartionTiming> timing() {
		// TODO Auto-generated method stub
		return ticketreservationdao.timing();
	}

	

	
}

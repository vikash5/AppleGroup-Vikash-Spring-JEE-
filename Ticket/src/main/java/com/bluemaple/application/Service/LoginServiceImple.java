package com.bluemaple.application.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluemaple.application.Dao.LoginDao;
import com.bluemaple.application.Model.TicketModel;
@Service
public class LoginServiceImple implements LoginService {
	@Autowired
	LoginDao logindao;

	@Override
	public TicketModel logincheck(TicketModel ticket) {
		// TODO Auto-generated method stub
		String name1 = ticket.getUsername();
		String pass1 = ticket.getPassword();
		//int role1 = ticket.getRole_id();
		System.out.println(name1);
		System.out.println("zdxfcgvhbj");

		TicketModel check = logindao.logincheck(name1);
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


	

}

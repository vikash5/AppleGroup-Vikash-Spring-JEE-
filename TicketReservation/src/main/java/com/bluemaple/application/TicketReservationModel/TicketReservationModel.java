package com.bluemaple.application.TicketReservationModel;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TicketReservationModel {
	private int id;
	private int userid;
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String emailaddress;
	private String address;
	private String createdby;
	private String updatedby;
	private String createddate;
	private String updateddate;
	private int Role_id = 2;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public int getRole_id() {
		return Role_id;
	}

	public void setRole_id(int role_id) {
		Role_id = role_id;
	}

	Date date = Calendar.getInstance().getTime();
	SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd,hh.ms.ss");
	private String todate = format.format(date);

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public String setUsername(String username) {
		return this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public String setPassword(String password) {
		return this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmailaddress() {
		return emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public String getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}

	public String getCreateddate() {
		return createddate;
	}

	public void setCreateddate(String createddate) {
		this.createddate = createddate;
	}

	public String getUpdateddate() {
		return updateddate;
	}

	public void setUpdateddate(String updateddate) {
		this.updateddate = updateddate;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "TicketReservationModel [id=" + id + ", userid=" + userid
				+ ", username=" + username + ", password=" + password
				+ ", firstname=" + firstname + ", lastname=" + lastname
				+ ", emailaddress=" + emailaddress + ", address=" + address
				+ ", createdby=" + createdby + ", updatedby=" + updatedby
				+ ", createddate=" + createddate + ", updateddate="
				+ updateddate + ", Role_id=" + Role_id + ", date=" + date
				+ "]";
	}

	
	

	
}

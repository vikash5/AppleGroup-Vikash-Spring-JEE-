package com.bluemaple.application.TicketReservationModel;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TicketReservationMoviemodel {

	private int id;
	private String listofmovies;
    private String releasedate;
    private String noOfshow;
    private String createddate;
    private String updateddate;
    
    
    Date date = Calendar.getInstance().getTime();
	SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd,hh.ms.ss");
	private String todate = format.format(date);
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getListofmovies() {
		return listofmovies;
	}
	public void setListofmovies(String listofmovies) {
		this.listofmovies = listofmovies;
	}
	public String getReleasedate() {
		return releasedate;
	}
	public void setReleasedate(String releasedate) {
		this.releasedate = releasedate;
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
	public String getNoOfshow() {
		return noOfshow;
	}
	public void setNoOfshow(String noOfshow) {
		this.noOfshow = noOfshow;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "TicketReservationMoviemodel [id=" + id + ", listofmovies="
				+ listofmovies + ", releasedate=" + releasedate
				+ ", createddate=" + createddate + ", updateddate="
				+ updateddate + ", noOfshow=" + noOfshow + ", date=" + date
				+ "]";
	}
	
	

}

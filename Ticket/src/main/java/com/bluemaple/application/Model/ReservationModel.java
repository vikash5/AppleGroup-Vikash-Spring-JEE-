package com.bluemaple.application.Model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ReservationModel {
	private int id;
	private String status;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
		return "ReservationModel [id=" + id + ", status=" + status
				+ ", createddate=" + createddate + ", updateddate="
				+ updateddate + ", date=" + date + "]";
	}
	



}

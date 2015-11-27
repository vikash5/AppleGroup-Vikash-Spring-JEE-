package com.bluemaple.application.TicketReservationModel;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TicketReservartionTiming {
	private int id;
	private String timings;
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

	public String getTimings() {
		return timings;
	}

	public void setTimings(String timings) {
		this.timings = timings;
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
		return "TicketReservartionTiming [id=" + id + ", timings=" + timings
				+ ", createddate=" + createddate + ", updateddate="
				+ updateddate + ", date=" + date + "]";
	}

}

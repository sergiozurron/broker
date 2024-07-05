package business;

import java.util.Date;

public class Lease {
	
	private String user;
	private long agency;
	private Date date;
	private int days;
	private double payment;

	public Lease(String user, long agency, Date date, int days, double payment) {
		super();
		this.user = user;
		this.agency = agency;
		this.date = date;
		this.days = days;
		this.payment = payment;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public long getAgency() {
		return agency;
	}

	public void setAgency(long agency) {
		this.agency = agency;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

}

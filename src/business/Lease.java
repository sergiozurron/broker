package business;

import java.util.Date;

public class Lease {
	
	private String user;
	private long agency;
	private Date date;
	private double rentalPayment;

	public Lease(String user, long agency, Date date, double rentalPayment) {
		super();
		this.user = user;
		this.agency = agency;
		this.date = date;
		this.rentalPayment = rentalPayment;
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

	public double getRentalPayment() {
		return rentalPayment;
	}

	public void setRentalPayment(double rentalPayment) {
		this.rentalPayment = rentalPayment;
	}

}

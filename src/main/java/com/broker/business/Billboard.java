package main.java.com.broker.business;

public class Billboard {
	
	public int id;
	public String coordinates;
	public long agencyId;

	public Billboard(int id, String coordinates, long agencyId) {
		super();
		this.id = id;
		this.coordinates = coordinates;
		this.agencyId = agencyId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}

	public long getAgencyId() {
		return agencyId;
	}

	public void setAgencyId(long agencyId) {
		this.agencyId = agencyId;
	}

}

package CarPoolingApp;

public class Ride {
	private String sourceCity;
	private String destinationCity;
	private int fare;
	private int id;
	
	public Ride(String sourceCity,String destinationCity,int fare,int id) {
		this.sourceCity=sourceCity;
		this.destinationCity =destinationCity;
		this.fare=fare;
		this.id=id;
		
		
	}

	public String getSourceCity() {
		return sourceCity;
	}

	public void setSourceCity(String sourceCity) {
		this.sourceCity = sourceCity;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Ride [sourceCity=" + sourceCity + ", destinationCity=" + destinationCity + ", fare=" + fare + ", id="
				+ id + "]";
	}
}

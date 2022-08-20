package CarPoolingApp;
import java.util.*;
public class User {
	
static ArrayList<Ride> rideList = new ArrayList<>();
	
	int id;
	void createRide(String sourceCity, String destinationCity, int fare) {
		 id=id+1;
		Ride ride = new Ride(sourceCity, destinationCity, fare, id);
		 rideList.add(ride);
	System.out.println("Ride Created Successfully");	
		 
	}
	
	
	void displayRide() {
		for(Ride ride : rideList) {
			System.out.println(ride);
		}
	}
	
	ArrayList<String> getAllDestination(String source){
		ArrayList<String>destList= new ArrayList<>();
		for(Ride ride : rideList) {
			if(ride.getSourceCity().equals(source)) {
				destList.add(ride.getDestinationCity());
			}
		}
		return destList;

	}
	
	ArrayList<String> getAllSources(String destination){
		ArrayList<String>sourceList= new   ArrayList<>();
		for(Ride ride : rideList) {
			if(ride.getSourceCity().equals(destination)) {
				sourceList.add(ride.getSourceCity());
			}
		}
		return sourceList;

	}
	void deleteRide(int id) {
		for(int i=0;i<rideList.size();i++) {
			if(rideList.get(i).getId()==id) {
				rideList.remove(rideList.get(i));
		}
	}
	}

	void updateRide(int id, String sourceCity, String destinationCity, int fare) {
		
		for(Ride ride : rideList) {
			if(id==ride.getId()) {
				ride.setSourceCity(sourceCity);
				ride.setDestinationCity(destinationCity);
				ride.setFare(fare);
			}
		}
		
		System.out.println("ride successfully updated");
	 
}
}
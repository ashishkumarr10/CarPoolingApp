package CarPoolingApp;


import java.util.ArrayList;



public class Admin extends User { 
	
	
	
	ArrayList<String> getAllPlaces(){
		ArrayList<String> cityList = new ArrayList<>();
		for (Ride ride : rideList) {
			if(!cityList.contains(ride.getSourceCity())) {
			cityList.add(ride.getSourceCity());
			}
			if(!cityList.contains(ride.getDestinationCity())) {
			cityList.add(ride.getDestinationCity());
		}
		}
		return cityList;
		
 	}
	
	
	
	int totalFare() {
		int total =0;
		for(Ride ride : rideList) {
			total =total + ride.getFare();
		}
		return total;
	}
	
	
	}
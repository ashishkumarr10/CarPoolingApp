package CarPoolingApp;

public class Main {
public static void main(String arg[]) {
		

		User Ashish = new User();
		Ashish.createRide("Delhi","Jammu", 300);
		Ashish.createRide("Agra", "Jaipur", 200);
		Ashish.createRide("Delhi","Jammu", 300);

		Ashish.displayRide();
//		Ashish.deleteRide(2);
//		System.out.println("After Deletion:-");
//		Ashish.displayRide();
		
		Ashish.updateRide(2, "Kanpur", "Chandigarh", 1500);
		System.out.println("After updation");
		Ashish.displayRide();
	}
}

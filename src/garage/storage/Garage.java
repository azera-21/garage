package garage.storage;

import java.util.ArrayList;
import java.util.List;

import garage.vehicles.Car;
import garage.vehicles.MotorBike;
import garage.vehicles.Truck;
import garage.vehicles.Vehicle;



public class Garage {

	//Using a List<> implementation, store all your Vehicles in a Garage class.
	
	private List<Vehicle> storage;
	int totalBill;
	
	public Garage() {
		this.storage = new ArrayList<Vehicle>();
		
	}
	

	//Create a method that will iterate through the arrayList and calculate a bill
	//Depends on the object type
	// if statement -- instanceOf -- e.g. if car, charge x amount, else if (
	
	public int calcTotalBill() {
		int carCounter = 0;
		int mbCounter = 0;
		int truckCounter = 0;
		
		for (int i = 0; i < storage.size(); i++) { //could also used enhanced for loop i.e. for(Vehicle vech : storage);
			if (storage.get(i) instanceof Car) { 
				totalBill += 50;
				carCounter ++;
			} else if (storage.get(i) instanceof MotorBike) {
				totalBill += 100;
				mbCounter++;
			} else if (storage.get(i) instanceof Truck) {
				totalBill += 200;
				truckCounter++;
			} else {
				totalBill = 10;
				System.out.println("Vehicle not on database + service charge added");
			}
		}
		System.out.println("Your total bill is: " + totalBill);
		System.out.println("Cars: " + carCounter + " Motorbikes: " + mbCounter + " Trucks: " + truckCounter);
		
		return totalBill;
	}
	
	
	
	/* Garage should have methods that add a Vehicle, 
	 * remove a Vehicle by its ID or its type, fix a 
	 * Vehicle (which calculates the bill) and to empty
	 * the Garage.
	 */
	
	//Method that adds a vehicle
	public void addVehicle(Vehicle vech) {
		storage.add(vech);
	}
	
	
	//Method that removes a vehicle by its id
	public void removeVehicle(Vehicle vech) {
		storage.remove(vech);
	}
	
	
	//Method that clears all vehicles from garage
	public void clearGarage() {
		storage.clear();	
	}




}

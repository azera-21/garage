package garage.runner;

import garage.storage.Garage;
import garage.vehicles.Car;
import garage.vehicles.MotorBike;
import garage.vehicles.Truck;

public class Main {

	public static void main(String[] args) {
		
		Garage garry = new Garage();
		
		Car car = new Car();
		MotorBike mb = new MotorBike();
		Truck truck = new Truck();
		
		garry.addVehicle(car);
		garry.addVehicle(mb);
		garry.addVehicle(truck);
		garry.removeVehicle(truck);
		garry.clearGarage();
		
		int ourBill = garry.calcTotalBill();
		
		System.out.println(ourBill);
		
	}
	
	
}

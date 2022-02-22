package garage.vehicles;

public abstract class Vehicle {
	
	//Vehicle attributes
	
	int noOfWheels;
	String color;
	String brand;
	int personCapacity;
	
	//What do all vehicles do?
	public void accelerate() {
		System.out.println("Speeding up");
	}
	
	public abstract void drive();
	
}

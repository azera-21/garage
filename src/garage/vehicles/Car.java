package garage.vehicles;

public class Car extends Vehicle {
	
	//Own attributes
	boolean isFourWheelDrive;
	boolean hasGotBoot;
	
	@Override
	public void drive() {
		System.out.println("I'm in me Mum's car");
		
	}	
}
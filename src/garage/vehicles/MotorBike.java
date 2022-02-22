package garage.vehicles;

public class MotorBike extends Vehicle {

	//Own attributes
	String handleBarColour;
	boolean requiresHelmet;
	
	@Override
	public void drive() {
		System.out.println("Riding on one wheel as the wind flows through my hair");		
		
	}
}

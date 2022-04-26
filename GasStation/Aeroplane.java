package GasStation;

import java.util.Random;

public class Aeroplane {

	private final  int fuelTask_Limit = 4000;
	
	private final int RANDOM_LIMIT = 1500;
	
	private int currentFuel;
	
	private String planeName;
	
	private String logName = "Aeroplane: ";
	
	private int randomValue() {
		
		Random rand = new Random();
		return rand.nextInt(RANDOM_LIMIT);
	}
	
	
	public Aeroplane() {
		currentFuel = randomValue();
	}
	
	public Aeroplane(String planeName) {
		
		this.planeName = planeName ;
		logName = planeName+" "+logName;
		currentFuel = randomValue();
	}
	
	public int checkBalance() {
		return currentFuel;
	}
	
	public int needFuelLitter() {
		
		return fuelTask_Limit - currentFuel;
	}
	
	public int fillFuel(int fuel) {
		
		if(fuel > needFuelLitter()) {
			int overLimit =needFuelLitter()- fuel;
			System.out.println(logName+"Fill fuel over limit "+overLimit);
		}else {
			currentFuel = currentFuel+fuel;
			System.out.println(logName+"Fill fuel to "+currentFuel);
		}
		
		return currentFuel;
	}

	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}
}

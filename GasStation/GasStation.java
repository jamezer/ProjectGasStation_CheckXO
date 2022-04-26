package GasStation;

import java.util.Random;

public class GasStation {

	private final  int fuelTask_Limit = 5000;
	
	private final int RANDOM_LIMIT = 2000;
	
	private final int RANDOM_FILL_LIMIT = 500;
	
	private int currentFuel;
	
	private String stationName;
	
	private String logName = "GasStation: ";
	
	private int randomValue(int randomLimit) {
		
		Random rand = new Random();
		return rand.nextInt(randomLimit);
	}
	
	public GasStation() {
		currentFuel = randomValue(RANDOM_LIMIT) ;
	}
	
	public GasStation(String stationName) {
		this.stationName = stationName;
		logName = stationName+" "+logName;
		currentFuel = randomValue(RANDOM_LIMIT) ;
	}
	
	public int checkBalance() {
		return currentFuel;
	}
	
	public int  fillGas() {
		int fillFuel = randomValue(RANDOM_FILL_LIMIT) ;
		System.out.println(logName+"start fill fuel = "+fillFuel+" on  current tank "+currentFuel);
		
		int forcastFuel = currentFuel + fillFuel ;
		if( forcastFuel  > fuelTask_Limit) {
			int overTask = forcastFuel - fuelTask_Limit ;
			fillFuel -= overTask;
			System.out.println(logName+"adject fill fuel to "+fillFuel);
		}else {
			currentFuel += fillFuel;
		}			
		
		System.out.println(logName+"after fill fuel in Tank = "+currentFuel);
		
		return fillFuel;
	}
}

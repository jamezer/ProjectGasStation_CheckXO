package GasStation;

import java.util.ArrayList;

public class FillGasController {

	private Aeroplane plane;
	
	private GasStation gasStation;
	
	private String logName = "FillGasController: ";
	
	private ArrayList<String> reportList = new ArrayList<String>();
	
	public FillGasController(Aeroplane plane , GasStation gasStation) {
		this.plane = plane;
		
		this.gasStation = gasStation;
	}
	
	public void fillGasToAeroplane() {
		
		System.out.println(logName+" Plane balance "+plane.checkBalance());
		int requestFuel  = plane.needFuelLitter();
		
		int gasBalance  = gasStation.checkBalance();
		System.out.println(logName+" Plane need fuel = "+requestFuel);
		System.out.println(logName+" Gas Station has fuel = "+gasBalance);
		
		if(gasBalance > requestFuel) {
			
			System.out.println(logName+" start fill  fuel to Aeroplane");
			plane.fillFuel(requestFuel);
			int planFuelBalance = plane.checkBalance();
			System.out.println(logName+" Aeroplane fuel balance = "+planFuelBalance);
		}else {
			
			int counter = 1;
			while(gasBalance < requestFuel) {
				
				int  needFuel =  gasBalance - requestFuel;
				System.out.println(logName+" Gas Station has fuel less than aeroplane request "+needFuel+" lit.");
				System.out.println(logName+" Gas Station start  fill fuel ");
				int addFuel =gasStation.fillGas();
				gasBalance = gasStation.checkBalance();
				reportList.add(counter+". Gas Station fill fuel "+addFuel+" lits");
				counter +=1 ;
			}
			
			plane.fillFuel(requestFuel);
			int planFuelBalance = plane.checkBalance();
			System.out.println(logName+" Aeroplane fuel balance = "+planFuelBalance);
		}
	}
	
	public String getReport() {
	
		StringBuffer sb = new StringBuffer();
		System.out.println("---------------Report----------------");
		for(String s : reportList) {
			sb.append(s+"\n");
		}
		
		return sb.toString();
	}
	
	public void showReport() {
		for(String s : reportList) {
			System.out.println(logName+s);
		}
	}
}

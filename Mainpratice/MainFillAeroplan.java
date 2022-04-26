package Mainpratice;

import GasStation.Aeroplane;
import GasStation.FillGasController;
import GasStation.GasStation;

public class MainFillAeroplan {

	public static void main(String[] args) {
		
		Aeroplane plane = new Aeroplane("YAMAHA Airline");
		
		GasStation station = new GasStation("Gas Station");
		FillGasController fillTank = new FillGasController( plane , station);
		fillTank.fillGasToAeroplane();

		fillTank.showReport();
	}

}

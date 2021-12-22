package com.example.stuff;

public interface Car {
	
//		double costOfGas = 12;
		
		public static final double COST_OF_GAS = 12; 

		
		double accelerate();
		
		boolean brake();
		
//		public abstract boolean brake(); This is implitly written every time!
		
		boolean cruiseControl(double CruisingSpeed);
		

}

//Name: Shubham Banthia
//Student ID: W1137918
//Course number: COEN 275
//Assignment 2
//Date of Submission: 01/30/2015

import edu.scu.oop.assign2.*;

public class SmartOvenApplication {

	public static void main(String[] args) {
		
		Alpha2Oven oven1 = new Alpha2Oven();	//works properly
		oven1.setTemperature(100);
		oven1.setTime(100);
		oven1.placeFood();
		oven1.start();
		oven1.setCookingMode(Alpha2Oven.cookingMode.Cookies);
		oven1.showOvenStatus();
		System.out.println();
		
		Alpha2Oven oven2 = new Alpha2Oven();	//temperature, time not set; oven is off
		oven2.setCookingMode(Alpha2Oven.cookingMode.Broil);
		oven2.start();
		oven2.showOvenStatus();
		System.out.println();

		Alpha1Oven oven3 = new Alpha1Oven();	//food is not placed, yet the oven is on, since Alpha1Oven does not check whether food is placed or no
		oven3.setTemperature(50);
		oven3.setTime(50);
		oven3.start();
		oven3.showOvenStatus();
		System.out.println();

		Alpha2Oven oven4 = new Alpha2Oven();	//oven is not started; status will be off
		oven4.setTemperatureInC(50);
		oven4.setTime(10);
		oven4.placeFood();
		oven4.showOvenStatus();
	}
}
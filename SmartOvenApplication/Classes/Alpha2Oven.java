//Name: Shubham Banthia
//Student ID: W1137918
//Course number: COEN 275
//Assignment 2
//Date of Submission: 01/30/2015

package edu.scu.oop.assign2;

/**
 * This is a class for the Smart Oven, which extends the earlier Oven class
 */
public class Alpha2Oven extends Alpha1Oven{
	public enum cookingMode {Bake, Broil, Cookies};		//cooking mode of 'Cookies' is added
	cookingMode currentMode;
	int degree;
	
	/**
	 * Takes in the temperature from user in celcius
	 * @param degree Takes in the temperature in celcius from the user, at which the oven is to be set
	 */
	public void setTemperatureInC(double degree){		//user inputs temperature in celcius
		thermostat.setTemperatureInC(degree);
		cookingTemp = thermostat.getTemperatureInF();			//the temperature is stored in fahrenheit in the oven
	}
	/**
	 * Method to set the cooking mode
	 * @param mode Cooking mode is set
	 */
	public void setCookingMode(cookingMode mode){
		currentMode = mode;						//cooking mode is set
	} 
	/**
	 * Method to start the oven, if the item is placed, temperature and time is set
	 */
	public void start(){				
		if (itemsPlaced == true){		//oven is started only if item is placed
			super.start();
		}
		else{
			System.out.println("The item is not placed");		//error message displayed if the item is not displayed
			this.stat = status.OFF;
		}
	}
	/**
	 * Method to display the status of the oven, which also calls the superclass method
	 * of the same name
	 */
	public void showOvenStatus(){			//displays the oven status, with new data members, along with the ones in class Alpha1Oven
		super.showOvenStatus();
		OvenThermostat celc = new OvenThermostat();
		celc.setTemperatureInF(cookingTemp);
		System.out.println("Temperature in Celcius is " + celc.getTemperatureInC());
		System.out.println("The current mode is " + currentMode);
		System.out.println("Items placed = " + itemsPlaced);
	}
}

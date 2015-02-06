//Name: Shubham Banthia
//Student ID: W1137918
//Course number: COEN 275
//Assignment 2
//Date of Submission: 01/30/2015

package edu.scu.oop.assign2;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Create the class Alpha1Oven

 */
public class Alpha1Oven extends OvenThermostat{
	
	protected enum status {ON, OFF};		//status of the oven
	status stat;
	protected double cookingTemp = currentTemperature;
	protected long cookingTimeInMinutes;		//cooking time in minutes
	protected long startTime;			//cooking start time
	protected boolean itemsPlaced;			//checks whether the item is placed
	protected OvenThermostat thermostat;		//create an instance of class OvenThermostat
	protected long stopTime;		//stop time in minutes
	/**
	* Initialize the values when an object is created
	*/
	public Alpha1Oven(){				//default constructor
		this.stat = status.OFF;
		itemsPlaced = false;
		cookingTemp = 0;
		cookingTimeInMinutes = 0;
		startTime = 0;
		itemsPlaced = false;
		thermostat = new OvenThermostat();
		stopTime = 0;
	}
	/**
	 * Turns off the oven
	 */
	public void turnOff(){
		this.stat = status.OFF;		//turns the status of the oven is off
	}
	/**
	 * Starts the oven if a temperature and a time is set
	 */
	public void start(){
		if(cookingTemp != 0 && cookingTimeInMinutes != 0){		//checks if temperature AND time is set
			this.stat = status.ON;
		}
		else {
			if(cookingTemp == 0){
			System.out.println("Cooking temperature not set");		//display error message for temperature not set
		}
			if(cookingTimeInMinutes == 0){
			System.out.println("Cooking time not set");			//display error message for cooking time not set
		}
			this.stat = status.OFF;			//oven remains off is time or temperature is not set
	}
	}
	/**
	 * This method sets the temperature which is input by the user
	 * @param degrees Takes in what temperature to set in fahrenheit
	 */
	public void setTemperature(double degrees){		//cooking temperature is set
		thermostat.setTemperatureInF(degrees);
		cookingTemp = thermostat.getTemperatureInF();
	}
	/**
	 * This method sets the time for the which the food is to be cooked
	 * @param cookingTime Time to be set by the user
	 */
	public void setTime(long cookingTime){
		startTime = System.currentTimeMillis();			//start time is stored in system time
		cookingTimeInMinutes = cookingTime;
		stopTime = startTime + (cookingTimeInMinutes * 60000);			//stop time is start time plus cooking time entered by user
	}
	/**
	 * This method is set to ON when food is placed in the oven
	 */
	public void placeFood(){			//sets when the food is placed in oven
		itemsPlaced = true;
	}
	/**
	 * The data members of the oven are reset to their initial values
	 */
	public void clear(){			//all the data members take initial values
		this.stat = status.OFF;
		itemsPlaced = false;
		cookingTemp = 0;
		currentTemperature = cookingTemp = 0;
		cookingTimeInMinutes = 0;
		startTime = 0;
		itemsPlaced = false;
		stopTime = 0;
	}
	/**
	 * The status of the oven is displayed
	 */
	public void showOvenStatus(){			//different data members are displayed
		System.out.println(getClass());			//print class name
		
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");		//set the format of time
		Date resultStart = new Date(this.startTime);			//create an instance of start time
	    System.out.println(sdf.format(resultStart));			
	    Date resultStop = new Date(stopTime);					//create an instance of stop time
	    System.out.println(sdf.format(resultStop));
	    
	    System.out.println("Status of Oven is " + this.stat);
		System.out.println("Temperature in fahrenheit is " + cookingTemp);		
	}
}

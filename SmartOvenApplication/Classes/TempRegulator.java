//Name: Shubham Banthia
//Student ID: W1137918
//Course number: COEN 275
//Assignment 2
//Date of Submission: 01/30/2015

package edu.scu.oop.assign2;

/**
 * An interface to set and get the temperature in both, celcius and fahrenheit
 */
public interface TempRegulator {
	/**
	 * Sets the temperature in Fahrenheit
	 * @param temp Takes the temperature in Fahrenheit
	 */
	void setTemperatureInF(double temp);
	/**
	 * Sets the temperature in Celcius
	 * @param temp Takes the temperature in Celcius
	 */
	void setTemperatureInC(double temp);
	/**
	 * @return return The temperature is returned in degree celcius
	 */
	double getTemperatureInF();
	/**
	 * @return return The temperature is returned in degree fahrenheit
	 */
	double getTemperatureInC();
	/**
	 * Enumeration to set the cooking modes of'Bake' and 'Broil'
	 */
	public enum cookingMode {Bake, Broil}; //cooking mode of Bake and Broil
}

//Name: Shubham Banthia
//Student ID: W1137918
//Course number: COEN 275
//Assignment 2
//Date of Submission: 01/30/2015

package edu.scu.oop.assign2;

public class OvenThermostat implements TempRegulator {
	
	double currentTemperature = 0;	//initialize the value of current temperature
	
	public void setTemperatureInF(double temp) {
		currentTemperature = temp;		//set the value of current temperature in fahrenheit
	}

	public void setTemperatureInC(double temp) {
		currentTemperature = (temp * 9/5) + 32;		//set the value of current temperature in fahrenheit (user inputs in celcius)
	}

	public double getTemperatureInF() {
		return currentTemperature;		//temperature is returned in fahrenheit
	}

	public double getTemperatureInC() {
		return (currentTemperature - 32) * 5/9;		//temperature is returned in celcius
	}
}
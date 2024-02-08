package com.example.demo;

public class Client {

	public static void main(String[] args) {
/*
 *  loosely coupled: they are independent of each other. If one class changes, that has no
                  affect on other and other class will not change. We need to use Interface.
 */
		// the instance of the Interface with the object from a class
		Vehicle vehicle = new Bike ();
		
		// the instance of the constructor with the object of the above Interface as a parameter
		Traveller traveller = new Traveller (vehicle);
		
		// call the method 
		traveller.startJourney();
	}

}

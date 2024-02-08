package com.example.demo;

public class Traveller {
	
	/*
	 *  tightly coupled: when two or more classes are tightly coupled, that means dependend on
                  each other. If one class changes, other class also will change.
	 */
	
/*	Bike bike = null;
	
	public Traveller () {
		this.bike = new Bike();
	}

	public void startJourney () {
		this.bike.move();
	} */
//-------------------------------------------------------------------------------------------
	
	/*
	 *  loosely coupled: they are independent of each other. If one class changes, that has no
                  affect on other and other class will not change. We need to use Interface.
	 */
	private Vehicle vehicle;
	
	
	public Traveller (Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public void startJourney () {
		this.vehicle.move();
	}
}

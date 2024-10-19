package com.rishi.oops.abstraction;

public class PlaneApp {

	public static void main(String[] args) {
	Airport airport =new Airport();
	airport.acceptPlane (new CargoPlane());
	airport.acceptPlane  (new PassangerPlane());
    airport.acceptPlane (new FighterPlane());
	}

}

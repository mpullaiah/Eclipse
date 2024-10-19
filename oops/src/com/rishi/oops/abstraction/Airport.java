package com.rishi.oops.abstraction;

public class Airport {

void acceptPlane(Plane ref)
{
	ref.takeoff();
	ref.fly();
	ref.land();
	
}
}

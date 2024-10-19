package com.rishi.inheritanc.programing;

public class BirdApp {
public static void main(String[] args) {
	MountainEagle me = new MountainEagle();
	me.eat();
	me.sleep();
	me.fly();
	SerpentEagle se = new SerpentEagle();
	se.eat();
	se.sleep();
	VegSparrow vs = new VegSparrow();
    vs.eat();
    vs.sleep();
    vs.fly();
    NonVegSparrow nvs =new NonVegSparrow();
    nvs.eat();
    nvs.sleep();
    nvs.fly();
  
}
}

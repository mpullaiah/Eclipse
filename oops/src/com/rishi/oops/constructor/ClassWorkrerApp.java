package com.rishi.oops.constructor;

public class ClassWorkrerApp {
public static void main(String[] args) {
	ClassWorker cw= new ClassWorker(200000,5);
	System.out.println(cw.name+" " + cw.age+" "+cw.salary+" "+cw.rating);
}

}

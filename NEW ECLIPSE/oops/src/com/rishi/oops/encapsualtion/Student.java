package com.rishi.oops.encapsualtion;

public class Student { 
private int rollnumber;
	 private String name;
	private boolean isAttended;
	
	
	public Student(int rollnumber) {
		this.rollnumber = rollnumber;
		
	}
	public void setStudentAttendance(boolean flag) {
		if(!isAttended)
			isAttended = flag;
		System.out.println("teacher assigned attendance to  studnets");
	}
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean getStudentAttendance() {
		System.out.println("Teacher accessed student attendance");
		return isAttended;
	}
}

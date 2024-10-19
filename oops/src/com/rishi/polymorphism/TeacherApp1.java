package com.rishi.polymorphism;

public class TeacherApp1 {
	public static void main(String[] args) {
		College c =new College();
		c.acceptTeacher(new PhysicsTeacher());
		c.acceptTeacher(new ChemistryTeacher());
		c.acceptTeacher(new BiologyTeacher());
	}

}

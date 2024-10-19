package com.rishi.polymorphism;

public class TeacherApp {

	public static void main(String[] args) {
		Teacher ref;
		PhysicsTeacher physicsteacher = new PhysicsTeacher();
		ref =physicsteacher;
		ref.markAttendance();
		ref.teach();
		ref.doexperiment();
		
		ChemistryTeacher chemistryteacher =new ChemistryTeacher();
		ref =chemistryteacher;
		ref.markAttendance();
		ref.teach();
		ref.doexperiment();
		
         BiologyTeacher biologyteacher = new BiologyTeacher();
         ref =biologyteacher;
         ref.markAttendance();
         ref.teach();
         ref.doexperiment();

	}

}

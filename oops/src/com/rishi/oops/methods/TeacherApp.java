package com.rishi.oops.methods;

public class TeacherApp {

	public static void main(String[] args) {
		PhysicsTeacher pt =new PhysicsTeacher();
		pt.markAttendance();
		pt.teach();
		pt.doExperiment();
		ChemistryTeacher ct = new ChemistryTeacher();
		ct.markAttendance();
		ct.teach();
		ct.doExperiment();
		BiologyTeacher bt=new BiologyTeacher();
		bt.markAttendance();
		bt.teach();
		bt.doExperiment();
		

	}

}

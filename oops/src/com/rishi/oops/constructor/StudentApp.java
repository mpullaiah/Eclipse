package com.rishi.oops.constructor;

public class StudentApp {

	public static void main(String[] args) {
 Student student1= new Student("Rishi",22,"Male",89);
 Student copyStudent =new Student(student1);
 student1.name="Rishi";
 student1.age=23;
 student1.gender="Male";
 student1.marks=80;
 System.out.println("Name:"+student1.name+"Age:"+student1.age+"Gender:"+student1.gender+ "Marks:"+student1.marks);
 System.out.println("Name:"+copyStudent.name+"Age:"+copyStudent.age+"Gender:"+copyStudent.gender+ "Marks:"+copyStudent.marks);

	}

}

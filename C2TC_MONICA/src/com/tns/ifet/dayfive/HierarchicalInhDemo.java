package com.tns.ifet.dayfive;

public class HierarchicalInhDemo {
	public static void main(String[] args) {
		Person1 p1 = new Person1();
		System.out.println("----------------- Person Details ---------------------");
		System.out.println(p1);

		Person1 p;
		p = new Person1();
		if (p instanceof Person1)
			System.out.println("Person Details "+p);
		
		p = new Employee1();
		if (p instanceof Employee1)
		System.out.println("Employee Details "+p);
	

		p = new Student1();
		if (p instanceof Student1)
			System.out.println("Student Details "+p);

	}

}

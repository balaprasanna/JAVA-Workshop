package com.workshop1.simpleJavaClasses;

public class ClubApplication {
	
	// main method
	public static void main(String args[]) {
		
		Person person1 = new Person("Bala", "prasanna", "Veerapandi");
		Person person2 = new Person("Bala", "Veerapandi");
		person1.Show();
		person2.Show();
		
		Facility  a = new Facility("mac laptop", "New Laptop in iss");
		Facility b = new Facility("Dell laptop");
		
		a.show();
		b.show();
	}
}
 
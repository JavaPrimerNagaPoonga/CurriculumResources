package com.example;

import com.example.classes.Animal;


public class MainDriver {
	
	/*
	 * What is OOP?
	 * 		Object Oriented Programming. 
	 * 
	 * 		OOP is made up of 4 pillars, 
	 * 			Inheritance, encapsulation, abstraction and polymorphism.
	 * 
	 * 		For a language to be considered OOP, 
	 * 			it needs to have support for the 4 pillars.
	 * 
	 * 	Why have OOP?
	 * 		Code REUSE
	 * 		
	 */
	
	public static void main(String[] apples) {
//		System.out.println("Welcome to OOP!");
		
		
//		Datatype variable = new Constructor
		Animal animal = new Animal();
		
//		Declaration
		Animal bob;
		
		//Assignment 
		bob = animal;
		
		//Reassignment
		bob = new Animal(); 
		
		System.out.println(animal.ishungry);
		System.out.println(animal.istired);
		
		animal.eat();
		animal.sleep();
		
		System.out.println(animal.ishungry);
		System.out.println(animal.istired);
		
//		Animal animal2 = new Animal();
//		
//		System.out.println("What about another aniumal " + animal2.ishungry);
//		System.out.println("What about another aniumal " + animal2.istired);
		
		
		animal = new Animal(); //reassignment to a new object!
		animal = new Animal(); //they start of hungry and tired
		animal = new Animal();
		animal = new Animal();
		animal = new Animal();
		animal = new Animal();
		animal = new Animal();
		
		System.out.println("What about the reassigned aniumal " + animal.ishungry);
		System.out.println("What about the reassigned aniumal " + animal.istired);
//		
//		animal2.eat();
//		animal2.makeSound();
//		animal2.sleep();
		

	}

}

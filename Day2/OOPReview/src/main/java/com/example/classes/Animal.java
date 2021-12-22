package com.example.classes;


/*
 * Class vs Object: 
 * 	Class is essentialy a blueprint for the instanstation of an object. 
 * 	Typically if you want to access the methods and attriobutes 'within' a class
 * 		you'll need ot instantiate it into an object 
 * 
 *	Object is an instance of a class 
 *
 *	Object is a 'physical' entity, a class is a 'logical' entity. Memory is
 *		only allocated to the object. 
 */
public abstract class Animal {
	
	public boolean ishungry;
	public boolean istired;
	
	public Animal(boolean ishungry, boolean istired) { //Constructors have the same name as the class
		//constructor is a 'special' kind of method, to create itself, an object
		//constructors don't define a return type
		
//		super(); //All constructors call will chain up to the Object classs!
		this.ishungry = ishungry;
		this.istired = istired;
	}
	
	public Animal() {
		
	}
	
	public void eat() {
		System.out.println("I am eating!");
		this.ishungry = false;
	}
	
	public void makeSound() {
		System.out.println("I am making a sound!");
	}
	
	public void sleep() {
		System.out.println("I am sleeping!");
		this.makeSound();
		
		this.istired = false;
	}
	
	public void move(boolean uphill, int distance) {
		//If I change the logic inside of the curly braces
		//If I change the return type, or the access modifier 
		//Changing the name of the parameters, also have no effect
		// that has no effect on overloading it!
		System.out.println("That was tiring!");
	}
	
	//changing the number of arguments
	public void move(boolean uphill, int distance, double weight) {
		
	}
	
	//changing the datatype
	public void move(boolean uphill, double distance, double weight) {
		
	}
	
	//changng the order
	public void move(double distance, double weight, boolean uphill) {
		
	}
	
	public abstract void walk();

}

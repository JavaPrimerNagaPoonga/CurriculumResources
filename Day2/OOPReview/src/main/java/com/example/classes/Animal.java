package com.example.classes;


/*
 * Class vs Object: 
 * 	Class is essentialy a blueprint for the instanstation of an object. 
 * 	Typically if you want to access the methods and attriobutes 'within' a class
 * 		you'll need ot instantiate it into an object 
 * 
 *	Object is an instance of a class 
 *
 *	Object is a 'physuical' entity, a class is a 'logical' entity. Memory is
 *		only allocated to the object. 
 */
public class Animal {
	
	public boolean ishungry;
	public boolean istired;
	
	public Animal() { //Constructors have the same name as the class
		//constructor is a 'special' kind of method, to create itself, an object
		//constructors don't define a return type
		
		this.ishungry = true;
		this.istired = true;
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

}

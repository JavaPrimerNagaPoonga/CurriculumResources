package com.example.classes;

public class Shrimp extends Crab{
	
	/* The JVMs attempt at giving our Shrimp class a constructor. 
	 * 
	 * public Shrimp(){
	 * 		super(); //is referring to the crab
	 * }
	 */

	public Shrimp() {
		super("pink");
	}
	
	public void swim() {
		this.makeSound(); //Shrimp's make sound
		//with methods, we inherit all the methods, they belong to us!
		
		super.makeSound(); //Crab's make sound 
		//we can still refer to our parent class' method!
		
		System.out.println("I am swimming!");
	}
	
	@Override
	public void makeSound() {
		System.out.println("I'm making shrimpy noise!");
	}
}

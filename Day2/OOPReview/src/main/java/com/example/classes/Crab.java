package com.example.classes;

public class Crab extends Animal{
	
	//When we uses an extends keyword, we are inheriting methods from 
	// our parent class. 
	
	public String shellColor;
	
	public Crab(String color) {
		super(true,true); //this is invoking my parent's constructor! The Animal class
		this.shellColor = color;
	}
	

	public void pinch() {
		System.out.println("I'm using my claws to pinch!");
	}

	//We don't NEED to use the @Override annotation. 
	//The @Override annotation is a way of explictly saying that we are overriding. 
	//This force the JVM to check that the method exists in the parent class
	@Override
	public void eat() {
		super.eat(); //we don't want to waste our parent's code!
		System.out.println("This fish was very yummy!");
	}
	
	public void makeSound() {
		System.out.println("I am making underwater crab noises!");
	}


	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Walking sidewyas!");
	}
}

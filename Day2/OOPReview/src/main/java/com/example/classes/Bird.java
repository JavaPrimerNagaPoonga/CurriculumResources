package com.example.classes;

public class Bird {
	
	public boolean isTired;
	public boolean isHungry;
	public String name;
	
	public void sleep() {
		System.out.println("I am sleeping");
		
		this.makeSound();
		
		this.isTired = false;
	}
	
	public void makeSound() {
		System.out.println("I am making a sound!");
	}
	
	public void eat() {
		System.out.println("I am eating");
		this.isHungry = false;
	}
	
	public void fly() {
		System.out.println("I, the glorious " + this.name + " can fly for a bit!");
	}

}

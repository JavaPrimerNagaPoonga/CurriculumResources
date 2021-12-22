package com.example.stuff;

public class SuperHuman extends Human{

	@Override
	public void run() {
		super.run();
		System.out.println("I'm running super fast!");
	}
	
	public void fly() {
		System.out.println("Look at me jump out of a skyscreaper to fly!");
	}
}

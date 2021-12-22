package com.example;

import com.example.classes.Animal;
import com.example.classes.Crab;
import com.example.classes.Shrimp;
import com.example.stuff.Car;
import com.example.stuff.CarlosImpl;
import com.example.stuff.Human;
import com.example.stuff.MetaHuman;
import com.example.stuff.SuperHuman;
import com.example.stuff.Truck;


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
	 * Inheritance: 
	 * 		Is one of the most imporatn aspects of OOP. In Java we have 
	 * 		class based inheritance, where you can niherit methods and 
	 * 		variables form parent classes; this promotes code reuse.
	 * 		(WE DO NOT INHERIT CONSTRUCTORS) 
	 * 
	 * 		For homogenous inheritance we use the keyword "extends"
	 * 			class -> class 
	 * 			abstract class -> class
	 * 			abstract class -> abstract class 
	 * 			interface -> interface 
	 * 
	 * 		For hetronogeuhs inheritance we use the keyword: "implements"
	 * 			interface -> class
	 * 			(interfaces cannot implement a class)
	 * 
	 * 		With Java, we cannot extends multiple classes, but we have
	 * 		support for multilevel inheritance.
	 * 	
	 * 		A -> B -> C
	 * 		C will have access to all the method and variables in B and A
	 * 		B will have access to all the methods and variables in A
	 * 		A will NOT have access to B or C
	 * 	
	 * 
	 * Polymorphism: 
	 * 		To take many forms. It gives flexibility to change the nature
	 * 		of some methods and classes in the right context!
	 * 
	 * 		Overriding and Overloading!
	 * 
	 * 		Overloading:
	 * 			We can overload Constructors or methods.
	 * 			Changing the parameters of a constructor or a method!
	 * 			Overloaded methods have the same name!
	 * 
	 * 			What are the different ways I can overload?
	 * 				Change the number 
	 * 				Change the datatype
	 * 				Change the order	
	 * 
	 * 			Overloading is only applicable to methods in the same class. 
	 * 
	 * 		Overriding: 
	 * 			OVerriding can be only done on methods, that we inherit!	
	 * 
	 * 	Abstraction: 
	 * 		Abstract means I don't know how it works. 
	 * 		It's a waste of resources to spend time knowing lower level implementation. 
	 * 		
	 * 		The concept of hiding implementation to show functionality. 
	 * 
	 * 		In Java we use Abstract classes and interfaces to achieve abstration.
	 * 			(partial and complete abstraction)
	 * 
	 * 		Interface: 
	 * 			Cannot have any concrete methods (without using the default keyword)
	 * 
	 * 			MEthods are by default abstract and public!
	 * 
	 * 			variables are implicitly public, static and final
	 * 
	 * 			An interface cannot contain a constructor 
	 * 
	 * 			A class can implement multiple interfaces
	 * 
	 * 		Abstract Classes: 
	 * 			A class can be made abstract by using the abstract key word. 
	 * 
	 * 			A abstract class can contain 0 or more abstracxt methods!
	 * 				(abstract methods are methods without any body)
	 * 
	 * 			Abstract classes do have constructors, but cannot be directly 
	 * 				instantiated (a concrete child class has to be used)
	 * 
	 * 			A child class of an abstract class must implement all the methods 
	 * 				or be abstract themselves.
	 * 
	 * 			A class can ONLY extend ONE abstract class at a time. 
	 */
	
	public static void main(String[] apples) {
//		System.out.println("Welcome to OOP!");
		
		
//		Datatype variable = new Constructor
//		Animal animal = new Animal(true,true);
		
//		Declaration
		Animal bob;
		
		//Assignment 
//		bob = animal;
		
		//Reassignment
//		bob = new Animal(false,false); 
		
//		System.out.println(animal.ishungry);
//		System.out.println(animal.istired);
		
//		animal.eat();
//		animal.sleep();
		
//		System.out.println(animal.ishungry);
//		System.out.println(animal.istired);
		
//		Animal animal2 = new Animal();
//		
//		System.out.println("What about another aniumal " + animal2.ishungry);
//		System.out.println("What about another aniumal " + animal2.istired);
		
		
//		animal = new Animal(true,true); //reassignment to a new object!
//		animal = new Animal(true,false); //they start of hungry and tired
//		animal = new Animal();
//		animal = new Animal();
//		animal = new Animal();
//		animal = new Animal();
//		animal = new Animal();
		
//		System.out.println("What about the reassigned aniumal " + animal.ishungry);
//		System.out.println("What about the reassigned aniumal " + animal.istired);
//		
//		animal2.eat();
//		animal2.makeSound();
//		animal2.sleep();
		
		
//		Crab mcCrabby = new Crab("Red");
//		
//		System.out.println(mcCrabby.ishungry);
//		System.out.println(mcCrabby.istired);
//		System.out.println(mcCrabby.shellColor);
//		
//		mcCrabby.eat();
//		mcCrabby.sleep();
//		mcCrabby.makeSound();
//		mcCrabby.pinch();
		
//		Shrimp shrimpy = new Shrimp();
		
//		shrimpy.swim();
		
//		Animal a = new Animal(true,true);
		Crab c = new Crab("Blue");
		Shrimp shrimpy = new Shrimp();
		
		Animal a2 = new Shrimp();
		Shrimp s2 = new Shrimp();
		
//		a2.makeSound();
//		a2.pinch();
//		a2.swim();
		
//		s2.makeSound();
//		s2.pinch();
//		s2.swim();
		
		Object o1 = new SuperHuman();
//		o1.run();
//		o1.fly();
		
		Human h1 = new Human();
		h1.run();
		
		Human h2 = new MetaHuman();
		h2.run();
//		h2.fly();
		
		
	
		
		
//		SuperHuman s1 = new SuperHuman();
//		s1.run();
//		s1.fly();
		
//		SuperHuman super2;
//		
//		super2 = (SuperHuman) h2; //We are casting the human into a superhuman!
//		
//		super2 = (SuperHuman) h1; //this will not work, because humans cannot be a superhuman
		
		
//		a.eat();
//		c.eat();
		
//		a.makeSound();
//		c.makeSound();
//		shrimpy.makeSound();
		
//		a.swim(); //parent does not have access to child methods!
		
		
		Car car = new CarlosImpl();//null value 
		Truck truck = new CarlosImpl();
		
		
		car.accelerate();
		car.brake();
		car.cruiseControl(10);
//		car.pickupStuff();
		
		
		truck.accelerate();
		truck.brake();
//		truck.cruiseControl();
		truck.pickupStuff();
		
		

	}

}

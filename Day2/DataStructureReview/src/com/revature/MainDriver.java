package com.revature;

import com.revature.structures.StringStorage;

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Data Structures!");
		
		/**
		 * 
		 * What is a Data Structure?
		 * 	A way of organising information. 
		 * 
		 * 	How you arrange your data to access them. 
		 * 
		 * 	How the data can set themselves, or requirements to be used. 
		 * 
		 * 	A Data structures is a way to store, manipulate and view data. 
		 */
		
		/*
		 * What is the most basic data structure we get in Java?
		 * 	Arrays
		 * 
		 * Properities of Arrays: 
		 * 	Arrays allow duplicate values.
		 * 	Arrays only store a single datatype at a time. 
		 * 	Size is fixed, when we create an array we have to define the number elements allowed inside. 
		 * 	
		 * 	Manipulate and view elements by their index
		 * 
		 */
		
		int[] intArray = {1,2,5,6,7,1};
		String[] stringArray = new String[10];
		
		System.out.println(intArray.length);

		Object o = new Object();
		
		System.out.println(o);
		System.out.print(intArray);
		
		
		

		//apple     primitve/object variable
		//apple();    method 
		//Apple     class 
		
		//apple.drop     apple is an object variable, with a drop attribute.
		//apple.drop()   apple is an object variable, with a drop method 
		//Apple.drop()   drop is a static method, that belongs to the class Apple 
		
		
		
		/*
		 *	I want to create a data structure to store Strings. 
		 *
		 * 	We want an add method
		 * 	We want a delete method. 
		 * 	We want to update a method. 
		 */
		
		
		
		StringStorage store = new StringStorageImpl();
		
		
		
		
		
		
		
		
		
		
	}

}

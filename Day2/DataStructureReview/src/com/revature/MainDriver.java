package com.revature;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import com.revature.structures.StringStorage;
import com.revature.structures.StringStorageImpl;

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello Data Structures!");
		
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
		
//		System.out.println(intArray.length);

		Object o = new Object();
		
//		System.out.println(o);
//		System.out.print(intArray);
		
		
		

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
		
		
		//StringStorage is mutable.
		
		StringStorage store = new StringStorageImpl();
		
		store.add("Hello");
		store.add("another hello");
		
	
		store.getAll();
		
		
		
		/*
		 * Collection Framework/library: 
		 * 	(Array is NOT part of collection)
		 * 	(Map is NOT part of collection api)
		 * 
		 * 	Why?
		 * 		Array object within Java is limited to work with. Mainly the array is 
		 * 		immutable and has a limited set of useful methods. 
		 * 		(Cannot change the size of the array once initalized)
		 * 
		 * 		Create my own custom version of an data structure. 
		 * 		However it'll be likely poorly optimized and it'll be difficult to share
		 * 			between other developers. 
		 * 
		 * 		This is where the Collection framework comes in: 
		 * 
		 * 		Called a framework (more akin to library). Proves interfaces and 
		 * 			classes that allow developers to more easily manage groups 
		 * 			of objects. A 'collection' object is designed to store a group 
		 * 			of objects and provide a lot of useful methods!
		 * 				
		 * 
		 * 
		 * 
		 * 	List 	
		 * 		An ordered collection. (We have indexed)
		 * 		May contain duplicate elements. 
		 * 		Access via index (positional access) : interact with elements based on their
		 * 			numerical position in the data structure. 
		 * 			(get, set, add, addAll and remove)
		 * 
		 		
		 * 
		 * 		child classes: 
		 * 			Arraylist 
		 * 			LinkedList
		 * 
		 * 
		 * 	Set
		 * 		Does not allow duplicates
		 * 		Does not guarantee insertion order 
		 * 		(Only inherits methods from the Collection interface + restrctions to duplicate valuees)
		 * 
		 * 		child class: 
		 * 			Hashset
		 * 			LinkedHashSet
		 * 			TreeSet
		 * 	Queue
		 * 		Is a data structure focused around the order of insertion. 
		 * 		First in First out (FIFO) or Last in Last out (LILO) 
		 * 		We have to access elements in the order they were inserted!
		 * 
		 * 		e.g. Spotify, Restaurant, Animation
		 * 
		 * 		child class: 
		 * 			PriotyQueue
		 * 			LinkedList
		 * 			
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		Set<String> mySet = new HashSet<>();
		
		mySet.add("Hello");
		
//		if(mySet.add("Hello")) {
//			System.out.println("Hello has been added");
//		}else {
//			System.out.println("Hello has already been taken!");
//		}
		mySet.add("Hello1");
		mySet.add("Hello2");
		mySet.add("Hello3");
		mySet.add("Hello4");
		
//		System.out.println(mySet);
		
//		System.out.println(mySet.length); //gives you the number of elements for an ARRAY
//		System.out.println(mySet[0]); // NOT AN ARRAY 
//		System.out.println(mySet.get(0))); //we cannot accesss an element in  a set via its position.
//		
//		//Traditional for loop can't be used to iterate through a set!
//		for(int i = 0; i< mySet.size();i++) {
//			System.out.println(mySet.size(i)); //NOT AN ARRAY 
//		}
		
		
		
		
		//enhanced for loop!
//		for(String s: mySet) {
//			System.out.println(s);
//		}
//		
		
		String[] stringArrays = {"a", "b", "c", "f"};
		boolean[] boolArray = {true,true,false,false,true};
		
		
		//Traditional For loop 
		int arraySize = stringArrays.length;
		for(int i = 0; i < arraySize; i++) {
			System.out.println(stringArrays[i]);
		}
		
		for(int i = 0; i < boolArray.length; i++) {
			System.out.println(boolArray[i]);
		}
		
		
		//enhanced for loop 
		for(String s: stringArrays) {
			System.out.println(s);
		}
		
		for(boolean b: boolArray) {
			System.out.println(b);
		}
		
		
		
		List<String> linkedListString = new LinkedList<>();
		
		Queue<String> queueString = new LinkedList<>();
		
		linkedListString.add("String!");
		queueString.add("String!");
		
		linkedListString.get(0);
		queueString.poll();
		
		
	}

}

package com.revature.structures;

public interface StringStorage {
	
	//An interface is a contract that I establish on my child classes!
	// The idea is abstraction. Access to functionality, without knowing how it works. 
	
	//CRUD 
	
	boolean add(String s); //returns true if successfully added, false if not added. 
	
	boolean delete(String s); //returns a true if successfully deleted
	boolean deleteAll();
	
	String get(int index); 
	String[] getAll();
	
	boolean update(String newValue,String oldValue);
	
	int size();
	
	double randomMethod();

}

package com.revature.structures;

public interface StringStorage {
	
	//CRUD 
	
	boolean add(String s); //returns jtrue if successfully added, false if not added. 
	
	boolean delete(String s); //returns a true if successfully deleted
	boolean deleteAll();
	
	String get(int index); 
	String[] getAll();
	
	boolean update(String newValue,String oldValue);
	
	int size();

}

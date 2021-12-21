package com.revature.structures;

public class StringStorageImpl implements StringStorage{

	
	//We want to use the most basic data
	private String[] myStrings = new String[0];
	
	public boolean add(String s) {
		
		//We know arrays are fixed in size!
		
		//We're adding a new element, so our array has to be one element bigger!
		//We define a new length
		
		int newLength = myStrings.length + 1;
		String[] newArray = new String[newLength];
		
		//We add in our previous elements to the new array!
		for(int i = 0; i< myStrings.length; i++) {
			newArray[i] = this.myStrings[i];
		}
		
		
		int finalIndex = newLength - 1;
		newArray[finalIndex] = s;
		
		this.myStrings = newArray;
		return true;
	}

	
	public boolean delete(String s) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean deleteAll() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public String get(int index) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String[] getAll() {
		if(myStrings.length == 0) {
			//if length is zero, we have nothing in the array
			System.out.println("We have nothing in there!");
		}else {
			for(int i = 0; i < this.myStrings.length; i++) {
				System.out.println(myStrings[i]);
			}
			
		}
		
		return this.myStrings;
	}


	@Override
	public boolean update(String newValue, String oldValue) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public int size() { 
		// It should tell you the number of elements that there are!
		return this.myStrings.length;
	}


	@Override
	public double randomMethod() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

	


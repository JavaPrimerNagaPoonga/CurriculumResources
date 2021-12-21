
//for loop that will take in an array
//add the numbers as we go. 

public class CalculatorSolution{

//static means that it belongs to the Class, not an object!
//now we don't need to instantiate a class to use this method!
	
	static int processCalc(int[] nums){
		
		
		int total = 0; //declaring a variable called total, to store an int value
		
		for(int i = 0; i < nums.length; i++){
			total = total + nums[i];
		}

		System.out.println("I'm done! Here's the total: " + total);
		
		return total;

	}
}


import mathstuff.specialstuff.Calculator;

//this is a comment
//We define a class , make sure to name it the same as the file
class HelloWorld {
	
	//main method
	public static void main(String[] args){

		//In Java , typically we need to instantiate an object to use the class' methods.

		//for(starting condition; terminating condition; incrementing condition)
		//for(int i = 0; i < args.length; i++){
		//	System.out.print(args[i] + " ");
		//};

		String stringA = args[0];
		String stringB = args[1];

		System.out.println(stringA + stringB);


		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		System.out.println(a + b);

		







//Calculator calculator = new Calculator();

		//int total = calculator.calculatorAdd(a,b);

		//System.out.println("The total of sum is: " + total);
		
		//printing out to the console/terminal
		//System.out.println("Hello World, now we are compiling and executing! ");
		//System.out.println(27);









		String s = "This is a string"; //this is declaring a string
		String[] s2 = {s}; //this is declaring an array of Strings. 
		int[] i1 = new int[2]; //this is declaring an array of int primitives. 

		//System.out.println("This is a string: " + s); //is args a String? 
		//System.out.println("This is the first element of s2, a string: " + s2[0]);
		//System.out.println("This is an array of strings: " + s2);
		//System.out.println("This is an array of numbers: " + i1);

		//With objects, (without the .toString() being overridden), we print out the memory location of the object. 

		
		
	}

	// With Java we have the JDK , JRE and the JVM.

	// The JDK contains useful development tools 
	// It will need the JRE to actually run the code. 
	// It will need a compiler to compile into bytecode (for the JVM to interpret)
	// other useful things, like a debugger. 

}


package JavaPgms;

public class OOPpolymorphism {
	
	// Java Program for Method overloading By using Different Types of Arguments Compile-time Polymorphism
	
	// Class 1
	// Helper class
	class Helper {

		static int Multiply(int a, int b) // Method with 2 integer parameters
		{
			return a * b;  // Returns product of integer numbers
		}

		// Method 2 With same name but with 2 double parameters
		static double Multiply(double a, double b)
		{
			return a * b; // Returns product of double numbers
		}
	}

	// Class 2
	// Main class
	// Main driver method
		
	public static void main(String[] args)
		{
			// Calling method by passing input as in arguments
			System.out.println("Multiply int output: "+Helper.Multiply(3, 5));
			System.out.println("Multiply double output: "+Helper.Multiply(2.5,4.5));
		}
}

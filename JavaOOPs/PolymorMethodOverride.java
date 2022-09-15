package JavaPgms;


public class PolymorMethodOverride {
	
	//Runtime Polymorphism Java Program for Method Overriding

			// Class 1
			// Helper class
			static class Parent {
				
				void Print()	// Method of parent class
				{
					System.out.println("parent class");		// Print statement
				}
			}

			// Class 2
			// Helper class
			static class subclass1 extends Parent {

				void Print() { System.out.println("From subclass1"); }	// Method
			}

			// Class 3
			// Helper class
			static class subclass2 extends Parent {

				void Print()	// Method
				{
					System.out.println("From subclass2"); 	// Print statement
				}
			}
			
			// Class 4
			// Main class
			// Main driver method
			
				public static void main(String[] args)
				{
					Parent a;		// Creating object of class 1

					a = new subclass1();	// Now we will be calling print methods inside main() method
					a.Print();

					a = new subclass2();
					a.Print();
				}


}

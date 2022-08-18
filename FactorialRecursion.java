package Oviya;

public class FactorialRecursion {
	 
		 static int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));    
		 }    
		 public static void main(String args[]){  
		  int i,fact=1;  
		  int number=6;   // try different number 
		  fact = factorial(number);   
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 }    
}

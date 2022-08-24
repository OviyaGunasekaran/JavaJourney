import java.util.*;

public class QuotientRemainder {
	 public static void main(String[] args)
	    {
		 	System.out.print("Enter Dividend: ");
	        Scanner sc1 = new Scanner(System.in);
	        int num = sc1.nextInt();
	        
	        System.out.print("Enter Divisor: ");
	        Scanner sc2 = new Scanner(System.in);
	        int divisor = sc2.nextInt();
	 
	        int quotient = num / divisor;
	        int remainder = num % divisor;
	 
	        System.out.println("The Quotient is = " + quotient);
	        System.out.println("The Remainder is = " + remainder);
	    }

}

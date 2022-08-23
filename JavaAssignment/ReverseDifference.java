import java.util.*;

public class ReverseDifference {
	
	public static void main(String[] args) {

	    int num =12345, temp, reversed = 0;
	    temp=num;
	    
	    System.out.println("Original Number: " + num);

	  	while(temp != 0) {
	    
	      int digit = temp % 10;
	      reversed = reversed * 10 + digit;
	      temp /= 10; 			// temp = temp/10; 
	    }
	  	
	  	System.out.println("Reversed Number: " + reversed);
	  	
	  	System.out.println(Math.subtractExact(num, reversed)); // System.out.println(num-reversed);  	
	  		  	  	
	  }
}

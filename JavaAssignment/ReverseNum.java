import java.util.*;

public class ReverseNum {
	public static void main(String[] args) {

		System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp, reversed = 0;
        temp=num;
        
        while(temp != 0) {
    	    
  	      int digit = temp % 10;
  	      reversed = reversed * 10 + digit;
  	      temp /= 10; 			// temp = temp/10; 
  	    }
  	  	
  	  	System.out.println("Reversed Number: " + reversed);

	}
}

import java.util.*;

public class SwapNumbers {
	
	 static void swapTemp(int a, int b)
	    {
	   	    int temp = a;
	        a = b;
	        b = temp;
	        System.out.println("After SWAP -> Value of a is " + a
	                           + " and Value of b is " + b);
	    }
	 
	 	public static void main(String[] args)
	    {
	 		System.out.print("Enter a's value: ");
			Scanner sc1 = new Scanner(System.in);  
			int a = sc1.nextInt();
			
			System.out.print("Enter b's value: ");
			Scanner sc2 = new Scanner(System.in);  
			int b = sc2.nextInt();
			
	        System.out.println("Before SWAP -> Value of a is " + a
                 + " and Value of b is " + b);
	        swapTemp(a, b);
	    }

}

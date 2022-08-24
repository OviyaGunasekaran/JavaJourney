import java.util.*;

public class NumberPrintXformat {
	public static void main(String args[])  
	{  
		System.out.print("Enter number: ");
		Scanner sc = new Scanner(System.in);  
		String num = sc.next();
			
		for (int i = 0; i < num.length() ; i++)
	    {
	        for (int j = 0; j < num.length(); j++)
	        {
	            if(i==j)
	            	System.out.print(num.charAt(i));
	            
	            else if((i+j) == (num.length()-1))
	            	System.out.print(num.charAt(i));
	            
	            else
	            	System.out.print(" ");
	        }
	        
	        System.out.println("\n");   
	    }
	}
}

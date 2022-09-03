import java.util.*;
public class Set2_3pattern {
	
	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the Size (odd number): ");
	    int size = sc.nextInt();
	    
	    for (int i= 0; i <= size/2 ; i++)
        {
	    	for (int j=0; j<=2*i; j++) 
            { 	
	    		System.out.print("*");
            } 
            System.out.println(""); 
        }
       
	    int temp = size-1; // for even values of j for lower part
	 
	    for (int i= size/2 ; i>0; i--)
        {
            for(int j=0; j <= temp-2 ;j++)
            {
                System.out.print("*");
            }
           temp=temp-2;
           System.out.println("");
        }
    }
}

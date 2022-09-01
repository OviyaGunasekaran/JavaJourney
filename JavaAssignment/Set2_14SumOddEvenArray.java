import java.util.*;

public class Set2_14SumOddEvenArray {

	public static void main(String[] args) 
	{
		 int arr[] = { 1, 2, 3, 4, 5, 6 };
	        int Even_Sum = 0, Odd_Sum = 0;
	        
	        System.out.print("Contents of Array: ");
	        System.out.println(Arrays.toString(arr));
	        
	        for (int i = 0; i < arr.length; i++) 
	        {
	        	if (arr[i] % 2 == 0)
	            	Even_Sum = Even_Sum + arr[i];
	            
	            else
	            	Odd_Sum = Odd_Sum + arr[i];
	        }
	 
	        System.out.println("Sum of even numbers: " +Even_Sum);
	        System.out.println("Sum of odd numbers: " +Odd_Sum);

	}

}

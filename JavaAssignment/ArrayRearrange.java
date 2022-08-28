import java.util.*;

public class ArrayRearrange {
	
    static void rearrange(int[] arr, int n)
    {
        
        int temp[] = arr.clone();      // Auxiliary array to hold modified array
 
        int small = 0, large = n - 1;  // Indexes of smallest and largest elements
 
        boolean flag = true; 		   // To indicate whether we need to copy remaining largest or remaining smallest at next position
 
        for (int i = 0; i < n; i++) 
        {    						   // Store result in temp[]
            if (flag)
                arr[i] = temp[large--];
            else
                arr[i] = temp[small++];
 
            flag = !flag;
        }
    }
	
	public static void main(String[] args)
	{
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		
		System.out.print("Contents of Array: ");

		//for (int i = 0; i < arr.length; i++)
		//	System.out.print(arr[i] + " ");
		
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);   // Array Sorting method
		 
        System.out.println("\nMin element is " + arr[0]);
        System.out.println("Max element is " + arr[arr.length - 1]);
		
        rearrange(arr, arr.length);
        
        System.out.print("\nArray Rearrange 1st max and 2nd min: ");
        System.out.println(Arrays.toString(arr));
		
	}
}

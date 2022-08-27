public class ArrayLargeSmallele {
	
public static void main(String[] args) 
		{
		
		int[] arr = { 200, 10, 50, 6000, 350, 700 };
		int temp=0;
		
		System.out.print("Array Elements: ");
		
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.print("\nSorted Array in Ascending Order: ");
		
		for (int j = 0; j < arr.length; j++) 
		{
			for (int k = j+1; k < arr.length ; k++) 
			{
				if ( arr[j] > arr[k] ) 
				{
					temp = arr[j];
					arr[j] = arr[k];
					arr[k] = temp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print( arr[i] + " ");
		}
		
		System.out.print("\nSmallest Element of Array: "+arr[0]);
		System.out.print("\nLargest Element of Array: "+arr[(arr.length)-1]);
		
		}
}

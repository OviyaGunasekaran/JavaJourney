public class ArraySum {
	
	public static void main(String[] args) {
		
	int[] arr = { 10, 10, 10, 10, 10 };
	int i,sum=0;
	  
	System.out.print("Array Elements: ");
	
	for (i = 0; i < arr.length; i++) 
	{
		System.out.print(arr[i] + " ");
		sum=sum+arr[i];
    }
	System.out.println("Array length is "+arr.length);
	System.out.println("Sum of Array Elements: "+sum);
	}
}

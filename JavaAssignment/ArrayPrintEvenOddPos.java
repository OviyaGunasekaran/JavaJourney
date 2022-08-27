public class ArrayPrintEvenOddPos {

	public static void main(String[] args) {
		
		int[] arr = { 5, 10, 15, 20, 25, 30, 35, 40, 45 };
		
		System.out.print("Array Elements: ");
		
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.print("\nEven positioned Array Elements: ");
		
		for (int j = 0; j < arr.length; j++) 
		{
			if (j%2 == 0)
			{
			System.out.print(arr[j] + " ");
			}
		}
		
		System.out.print("\nOdd positioned Array Elements: ");
		
		for (int j = 0; j < arr.length; j++) 
		{
			if (j%2 == 1)    //if (j%2 != 1)
			{
			System.out.print(arr[j] + " ");
			}
		}
		}
}

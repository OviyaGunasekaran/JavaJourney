import java.io.*;
import java.util.Scanner;

public class ArrayRightRotation {
	
	static void Rotate(int arr[], int rc, int n)
	{
		int temp[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			temp[i] = arr[i];
		}

		for (int i = n-rc; i < n; i++) {
			arr[i-n+rc] = arr[i];
		}

		for (int i = 0; i < n-rc; i++) {
			arr[i+rc] = temp[i];
		}
	}

	
	public static void main (String[] args) 
	{
			int arr[] = { 1, 2, 3, 4, 5, 6 };
			int N = arr.length;
			
			System.out.print("Array elements: ");
			for (int i = 0; i < N; i++) 
			{
				System.out.print(arr[i] + " ");
			}
			
			System.out.print("\nEnter the Right Rotation Count: ");  
			Scanner sc = new Scanner(System.in);  
		    int rotateCount = sc.nextInt();

			Rotate(arr, rotateCount, N);
			
			System.out.print("\nRight rotated array ");
			for (int i = 0; i < N; i++) 
			{
				System.out.print(arr[i]+" ");
			}
			
	}

}

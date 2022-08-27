import java.io.*;
import java.util.Scanner;

public class ArrayLeftRotation {
	
	static void Rotate(int arr[], int rc, int n)
	{
		int temp[] = new int[n];

		int k = 0;   // Keepig track of the current index of temp[]

		for (int i = rc; i < n; i++) {
			temp[k] = arr[i];
			k++;
		}

		for (int i = 0; i < rc; i++) {
			temp[k] = arr[i];
			k++;
		}

		for (int i = 0; i < n; i++) {
			arr[i] = temp[i];
		}
	}

	
	public static void main (String[] args) 
	{
			int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
			int N = arr.length;
			
			System.out.print("Array elements: ");
			for (int i = 0; i < N; i++) 
			{
				System.out.print(arr[i] + " ");
			}
			
			System.out.print("\nEnter the Left Rotation Count: ");  
			Scanner sc = new Scanner(System.in);  
		    int rotateCount = sc.nextInt();

			Rotate(arr, rotateCount, N);
			
			System.out.print("\nLeft rotated array ");
			for (int i = 0; i < N; i++) 
			{
				System.out.print(arr[i]+" ");
			}
			
	}
}

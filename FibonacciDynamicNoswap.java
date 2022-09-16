package JavaPgms;

import java.util.Scanner;

public class FibonacciDynamicNoswap {
	
		public static void main(String[] args) {
		
		int n;
		System.out.println("Enter the limit :");
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		
		int f[]= new int[n+2];
		int i;
		
		f[0]=0;
		f[1]=1;
		
		for (i=2;i<=n;i++)
			f[i]=f[i-1]+f[i-2];
		
		for (i=0;i<=n;i++)
			System.out.print(f[i]+" ");
	}

}

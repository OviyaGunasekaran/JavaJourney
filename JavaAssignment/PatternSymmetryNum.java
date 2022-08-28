import java.util.*;

public class PatternSymmetryNum {
	
	public static void main(String args[])  
	{
		int i,j,k,p;
		int n=9;
		
		for (i=1,k=n;i<=n;i++,k--)
		{
		
			for (j=1;j<=i;j++)
			{
			System.out.print(" ");
			}
		
			for (j=i;j<=n;j++) 
			{
			System.out.print(k + " ");
			}		
		
		System.out.println("");		
		
		}
	}
}


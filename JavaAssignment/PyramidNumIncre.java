import java.util.*;

public class PyramidNumIncre {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter a number: "); 
		int num = sc.nextInt(); 
		
		int i=1,j,k=1;
		
		while(k<=num)
		{
			for (j=i;j<(num-1)/2;j++)
			{
				System.out.print(" ");
			}
			for (j=1;j<=i;j++)
			{
				System.out.print(k++ + " ");
			}
		    System.out.println("\n");
		    i++;
		}
	}
}

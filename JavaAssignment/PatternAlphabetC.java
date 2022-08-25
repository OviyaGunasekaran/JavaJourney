import java.util.*;

public class PatternAlphabetC {
	
	public static void main(String args[])  
	{ 
		System.out.print("Height of C: ");
		Scanner sc = new Scanner(System.in);  
		int height = sc.nextInt();
		
		for (int i = 0; i < height; i++)
	    {
	        System.out.printf("*");
	        for (int j = 0; j < (height - 1); j++)
	        {
	            if (i == 0 || i == height - 1)
	                System.out.printf("*");
	        }
	        System.out.printf("\n");
	    }
	}

}

import java.util.*;

public class Set2_4EquilatTri {
	
	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        int i,j;
        
        for (i=0; i<n; i++)
        { 
        	for (j=n-i; j>1; j--)
        	{ 
               System.out.print(" ");
            } 
            for (j=0; j<=i; j++ )
            { 
                System.out.print("* ");
            } 
  
            System.out.println();
        } 
    } 
}

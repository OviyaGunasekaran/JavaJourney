import java.util.*;
public class PatternNumInvPyramid {
	
	public static void main(String[] args)
    {
		System.out.print("Rows of inverted pyramid: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j,k,p;
        
        for (i = 1,k = n ; i<=n ; i++,k--) 
		{ 
			for (j = 1; j <= i; j++) 
			{ 
				System.out.print(" "); 
			} 
			
			for (j = i; j <= n; j++) 
			{ 
				System.out.print(k+" "); 
			} 
			System.out.println(""); 
		}
    }

}

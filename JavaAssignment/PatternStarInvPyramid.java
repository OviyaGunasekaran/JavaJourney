import java.util.*;

public class PatternStarInvPyramid {
	
	public static void main(String[] args)
    {
		System.out.print("Rows of inverted pyramid: ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();      
       
        for (int i = 0; i <= row ; i++) 
		{ 
			for (int j = 0; j <= i; j++) 
			{ 
				System.out.print(" "); 
			} 
			for (int k = 0; k <= row - i; k++) 
			{ 
				System.out.print(" *"); 
			} 
			System.out.println(); 
		}
}

}

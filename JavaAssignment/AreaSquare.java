import java.util.*;

public class AreaSquare {
	public static void main(String args[])  
	{  
		System.out.print("Enter side of Square: ");
		Scanner sc = new Scanner(System.in);  
		int side = sc.nextInt();
		
		System.out.println("Area of the square= "+ side*side );
	}
}

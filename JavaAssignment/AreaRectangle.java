import java.util.Scanner;

public class AreaRectangle {
	public static void main(String args[])  
	{  
		System.out.print("Length of the Rectangle: ");
		Scanner sc1 = new Scanner(System.in);  
		int length = sc1.nextInt();
		
		System.out.print("Breadth of the Rectangle: ");
		Scanner sc2 = new Scanner(System.in);  
		int breadth = sc2.nextInt();
		
		System.out.println("Area of the square= "+ length*breadth );
	}
}
import java.util.Scanner;

public class AreaCylinder {
	public static void main(String args[])  
	{  
		System.out.print("Radius of the Cylinder: ");
		Scanner sc1 = new Scanner(System.in);  
		float radius = sc1.nextFloat();
		
		System.out.print("Height of the Cylinder: ");
		Scanner sc2 = new Scanner(System.in);  
		float height = sc2.nextFloat();
		
		float area = ((2*22*radius)/7)*(height + radius);
		
		System.out.println("Surface Area of the Cylinder= "+ area );
	}
}

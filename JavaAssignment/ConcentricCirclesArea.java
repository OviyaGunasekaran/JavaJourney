import java.util.*;

public class ConcentricCirclesArea {
	
	public static void main(String[] args)
    {
		System.out.print("Enter the Outer Circle Radius: ");  
		Scanner sc1 = new Scanner(System.in);  
	    float R = sc1.nextFloat();
	    
	    System.out.print("Enter the Inner Circle Radius: ");  
		Scanner sc2 = new Scanner(System.in);  
		float r = sc2.nextFloat();
		 
		double pi = 3.142;
		
		double area_R = pi * R * R;
		System.out.println("Area of Outer Circle: "+area_R);
		
		double area_r = pi * r * r;
		System.out.println("Area of Inner Circle: "+area_r);
		
		System.out.println("Area between Circles: "+ (area_R-area_r) );
		  
		}
}
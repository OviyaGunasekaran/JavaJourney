import java.util.*;

public class MultiSubtTable {
	
	public static void main(String[] args)
    {
	System.out.print("Enter the number ");  
	Scanner sc = new Scanner(System.in);  
    int num = sc.nextInt();
    
    System.out.println("Multiplication Table:"); 
    for (int i = 1; i <= 10; i++) {
    	System.out.println(num + " * " + i + " = "+ num * i);
    }
    
   System.out.println("Subtraction Table:");
   int k=0;
   for (int j = num; j <= num+10 ; j++) {
	   System.out.println(j+ " - " + num + " = " + k);
	   k=k+1;
   } 
 
  }	
}

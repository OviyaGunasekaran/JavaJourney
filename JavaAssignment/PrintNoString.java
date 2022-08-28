public class PrintNoString {
	
	public static void main(String args[])  
	{
	 float a=7.50f;	
	 System.out.println("Printing 7.50 without using string: ");
	 System.out.format("%.2f",a); 
	 
	 String num = "7.50";
	 System.out.println("\nPrinting 7.50 using string: ");
	 System.out.println(num);
	}
	
}

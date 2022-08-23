import java.util.*;

public class PrintAlphaUserIn {
	
	public static void main(String[] args)
	{
		System.out.print("Enter a Uppercase character: ");  
		Scanner sc = new Scanner(System.in);  
		char chr = sc.next().charAt(0);
		int asciiValue = chr; 
		
		for(int i = asciiValue; i <= 90; i++) {
		System.out.print( (char)i); 
		}
		
		}
}

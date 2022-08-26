import java.util.Scanner;

public class CharAlphaOrNot {
	
public static void main(String[] args) {
		
		System.out.print("Enter a character: ");  
		Scanner sc = new Scanner(System.in);  
		char ch = sc.next().charAt(0);
		
		if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            System.out.println(ch + " is an alphabet.");
        else
            System.out.println(ch + " is not an alphabet.");
		
		}
}

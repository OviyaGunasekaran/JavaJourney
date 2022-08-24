import java.util.*;

public class PatternRtTriAlpha {
	
	public static void main(String args[])  
	{  
	System.out.print("Enter a character: ");  
	Scanner sc = new Scanner(System.in);  
	char chr = sc.next().charAt(0);  
	int asciiValue = chr;  
	System.out.println("ASCII value of " +chr+ " is "+asciiValue); 
	
	int alphabet = asciiValue;
	int size = asciiValue - 64;
	
	for (int i = 0; i < size ; i++)
    {
        for (int j = 0; j < size - i; j++)
        {
            System.out.print((char) (alphabet));
        }
	alphabet= alphabet-1;
        System.out.println();
    }
	}
}

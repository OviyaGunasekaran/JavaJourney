import java.util.*;
import java.lang.*;

public class InputOutput {
	
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string like a2b10 : ");
        char c[] = new char[100];
        int num = 0;
        char ch = ' ';
        String str = sc.nextLine();
        c = str.toCharArray();
    
       for(int i = 0; i< c.length;i++)
        {
            if(Character.isDigit(c[i]))
            {
                ch = c[i-1];
                while(i< c.length && Character.isDigit(c[i]))
                {
                   num = (num *10)  + (c[i]-48);
                   i++;
                }
            }
            for(int x = 0; x< num;x++)
            {
            System.out.print(ch);    
            }
            num = 0;        
         }
    }
}
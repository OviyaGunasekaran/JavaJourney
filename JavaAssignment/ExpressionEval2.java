import java.util.*;

public class ExpressionEval2 {
	
	public static void main(String[] args)
    {
		
	int a=28;
	
	System.out.println("Initial value of a: " +a);
	
	a+= a++ + ++a + -a +a;
	
	System.out.println("Evaluated value of a after a+=a++ + ++a + –a + a– is :  " + a);

    }
}
	

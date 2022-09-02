import java.util.*;

public class ArithmeticOperator {
	
	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		int c=25;
		int d=75;
		
		System.out.println("a + b = " + (a+b) );
		System.out.println("a - b = " + (a-b) );
		System.out.println("a * b = " + (a*b) );
		System.out.println("a / b = " + (a/b) );
		
		System.out.println("d % c = " + (d % c) );
		System.out.println("c % a = " + (c % a) );
		
		
		System.out.println("a++	= " +(a++) );
		System.out.println("post incremented a= "+a);
		System.out.println("++a	= " +(++a) );
		
		System.out.println("b--	= " +(b--) );
		System.out.println("post decremented b= "+b);
		System.out.println("--b	= " +(--b) );
		
		//below lines throws error
		//System.out.println("c-	= " +(c-) );
		//System.out.println("-d	= " +(-d) );
		
	}

}

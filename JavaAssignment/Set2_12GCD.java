
public class Set2_12GCD {

	public static void main(String[] args) 
	{
		int n1 = 81, n2 = 150;
	    
	    // initially set to gcd
	    int gcd = 1;

	    for (int i = 1; i <= n1 && i <= n2; ++i) {

	      // check if i perfectly divides both n1 and n2
	      if (n1 % i == 0 && n2 % i == 0)
	        gcd = i;
	    }

	    System.out.println("GCD of " + n1 +" and " + n2 + " is " + gcd);
	  
	int sum1 = 0;
    int temp1 = n1;
    while ( temp1 != 0)
    {
        sum1 = sum1 + temp1 % 10;
        temp1 = temp1/10;
    }
    System.out.println("Sum of digits of number1 is " + sum1 );
    
    int sum2 = 0;
    int temp2 = n2;
    while ( temp2 != 0)
    {
    	sum2 = sum2 + temp2 % 10;
        temp2 = temp2/10;
    }
    System.out.println("Sum of digits of number2 is " + sum2 );
  }

}

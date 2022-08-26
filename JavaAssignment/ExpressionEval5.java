public class ExpressionEval5 {
	
	public static void main(String[] args)
    {
		
	int x=5;
	
	System.out.println("Initial value of x: " +x);
	
	int x2= ++x - x++;
	System.out.println("Evaluation of x2 = ++x - x++ is " +x2);
	System.out.println("present x: " +x);
	
	x=5;
	System.out.println("Resetting x to 5, x is : " +x);
	
	int x1= ++x - x++ + -x;
	
	System.out.println("Evaluated value of x, x1=++x – x++ + –x is :  " +x1);

    }

}

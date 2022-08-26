public class ExpressionEval3 {
	
	public static void main(String[] args)
    {
		
	int x=10;
	
	System.out.println("Initial value of x: " +x);
	
	x = x++ * 2 + 3 * (-x);
	
	System.out.println("Evaluated value of a after x = x++ * 2 + 3 * –x is :  " +x);

    }

}

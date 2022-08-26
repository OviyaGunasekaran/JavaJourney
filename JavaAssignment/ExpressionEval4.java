public class ExpressionEval4 {
	
	public static void main(String[] args)
    {
		
	int y=10;
	
	System.out.println("Initial value of y: " +y);
	
	int e = ++y; // my check 
	
	System.out.println("Preincrement value ++y: " +e); // my check 
	
	System.out.println("New value of y: " +y); // my check 
	 
	y=--y;
	 
	System.out.println("y retained to 10 after --y : " +y); // my check 
	
	int z = (++y * (y++ + 5));
	
	System.out.println("Evaluated value of z = (++y * (y++ + 5)) is : " +z);

    }

}

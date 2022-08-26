
public class ExpressionEval1 {
	
	public static void main(String[] args)
    {
		
	int a=5, b=2, eval1,eval2,eval3,eval4;
	
	System.out.println("Initial values of a: " + a  + ", b: " + b);
	
	eval1 = ++a-b ;
	System.out.println("Expression ++a-b- : " +eval1);
	
	a=5;
	b=2;
	eval2 = a%b++;
	System.out.println("Expression a%b++ : " +eval2);
	
	a=5;
	b=2;
	eval3 = a*=b+5;
	System.out.println("Expression a*=b+5 : " +eval3);
	
	eval4 =69>>>2;
	System.out.println("Expression x=69>>>2 : " +eval4);
   
    }

}

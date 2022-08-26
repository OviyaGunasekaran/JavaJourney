import java.util.Scanner;

public class PosNegNumFinding {
	
	public static void main(String[] args) 
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        num = sc.nextInt();
        
        if (num < 0)
            System.out.println(num + " is a negative number.");

        else if ( num > 0)
            System.out.println(num + " is a positive number.");

        // if both test expression is evaluated to false
        else
            System.out.println("Number is "+num);
        
    }

}

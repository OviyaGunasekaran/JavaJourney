import java.util.Scanner;

public class FactorialSumofDigits {

	public static void main(String[] args) {

		System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact =1;
        
        for(int i = 1; i <= n; ++i)
        {
            // factorial = factorial * i;
            fact *= i;
        }
        
        System.out.println("Factorial of "+n+" is "+fact );
        
        int sum = 0;
        int temp = fact;
        
        while (temp > 0)
        {
            sum = sum + temp % 10;
            temp = temp/10;
        }
        
        System.out.println("Sum of digits of "+fact+" is "+sum );
        
	}      
        
}

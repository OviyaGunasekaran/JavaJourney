import java.util.Scanner;

public class SumNaturalNum {

	public static void main(String[] args) {
		
		System.out.print("Enter the limit: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int i = 1, sum = 0;

        while(i <= num)
        {
            sum += i;
            i++;
        }

        System.out.println("Sum of "+num+" Natural NUmbers = " + sum);
        
       int temp = sum;
       
       int largest = 0;
       int smallest = 9;
    
       while(temp > 0)
       {
           int r = temp % 10;
    
           // Find the largest digit
           largest = Math.max(r, largest);
    
           // Find the smallest digit
           smallest = Math.min(r, smallest);
    
           temp = temp / 10;
       }
       System.out.println("Largest digit is "+largest + ", Smallest digit is  " + smallest);
        
    }
}

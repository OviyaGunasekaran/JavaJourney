import java.util.*;

public class SumOfSeries {
	public static void main(String[] args)
    {
		System.out.print("Enter the number of terms: ");  
		Scanner sc = new Scanner(System.in);  
	    int num = sc.nextInt();
	    
	    int sum = 0, j = 1;
	    
        for (int i = 1; i <= num; i++)
        {
            sum = sum + j;
            j = (j * 10) + 1;
        }
        System.out.print("Sum of the series: "+sum);  
	}

}

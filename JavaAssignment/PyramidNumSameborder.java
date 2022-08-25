import java.util.*;

public class PyramidNumSameborder {
	
	public static void main(String[] args)
    {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter the number of Rows: ");
       int row = scanner.nextInt();

       for (int i = 1; i <= row; i++)
        {
            for (int j = row; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print(k);
            }
            for (int l = i - 1; l >= 1; l--)
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }

}

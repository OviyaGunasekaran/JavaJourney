import java.util.*;

public class Set2_8PronicPrime {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number as Limit: ");
        int limit = sc.nextInt();
        int flag=0;
        
        System.out.println("\nList of Pronic Numbers from 1 to "+limit+": ");
        int s1=1; 
        
        for(int i=s1; i<=limit; i++)
        {
           flag=0;
            for(int j=0;j<=i;j++)
          {
              if(j*(j+1)==i)
              {
                  flag=1;
                  break;
              }
          }
            
         if(flag==1)
       	 System.out.print(i+" ");
        }
        
        
        System.out.println("\nList of Prime Numbers from 1 to "+limit+": ");
        
        for(int num = 1; num <= limit; num++)
		{
			int count = 0;
	
			for (int i = 2; i <= num/2; i++)
		    {
		    	if(num % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
		    if(count == 0 && num != 1 )
		    {
		    	System.out.print(num + " ");
		    }  
		}
        
        
   }

}

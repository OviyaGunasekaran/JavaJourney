import java.util.*;

public class Set2_7PronicNum {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        int flag=0;
        
        for(int i=0; i<num; i++)
        {
        	if(i*(i+1) == num)
        	{
        		flag = 1;
        		break;
        	}
        }

         if(flag == 1)
        	 System.out.println(num+" is a Pronic Number.");
         else
        	 System.out.println(num+" is not a Pronic Number.");  
         
         System.out.println("\nList of Pronic Numbers from 1 to 100: ");
         
         int s1=1; 
         int s2 =100;
         
         for(int i=s1; i<=s2; i++)
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
         
	}
		
}

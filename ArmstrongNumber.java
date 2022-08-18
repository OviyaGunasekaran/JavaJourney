package Oviya;
import java.util.Scanner;  
import java.lang.Math;

public class ArmstrongNumber { 
 
	static boolean isArmstrong(int n)   //function to check if the number is Armstrong or not
	{   
	int temp, digits=0, last=0, sum=0;   
	temp=n;   
	while(temp>0)    	//loop executes until the condition becomes false 
		{   
		temp = temp/10;   
		digits++;   
		}   
	temp = n;   
	while(temp>0)   
		{   
		last = temp % 10;   
	    sum +=  (Math.pow(last, digits));  //calculates the power of a no upto digit times and add the resultant to the sum variable 
	    temp = temp/10;   
		}  
	if(n==sum)   
		return true;      
	else 
		return false;   
	}

	public static void main(String args[])     //driver code 
	{     
	int num;   
	Scanner sc= new Scanner(System.in);  
	System.out.print("Enter the limit: ");  
	num=sc.nextInt();  	//reads the limit from the user 
	System.out.println("Armstrong Number up to "+ num + " are: "); 
	
	for(int i=0; i<=num; i++)  
	  
		if(isArmstrong(i))     //function calling
	 
	System.out.print(i+ ", ");    //prints the armstrong numbers 
	}   

}

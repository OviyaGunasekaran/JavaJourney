package JavaPgms;

import java.util.Scanner;

public class PrimeSimpleMain {
	static void checkPrime(int n)
	{
		int i,m=0,flag=0;      
		  m=n/2; 		// since divisors greater than (half the number) wont give remainder 0     
		  if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		  }
		  else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     System.out.println(n+" is not prime number");      
		     flag=1;      
		     break;      
		     }      
		     }      
		    if(flag==0) 
		     { System.out.println(n+" is prime number"); }  
		  } 
	}
	

	public static void main(String[] args) {
	
		int n;
		System.out.println("Enter a number :");
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		
		checkPrime(n);

	}

}

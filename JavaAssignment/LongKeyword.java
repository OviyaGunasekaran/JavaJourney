import java.util.*;

public class LongKeyword {
	
	 public static void main(String args[])
	 {
         long l1=10012,l2=11011; 
         System.out.println("long variable1: "+l1+"\nlong variable2: "+l2);  
      
         long result=l1+l2;
         System.out.println("Addition of long Variables: "+result);
         
         long min=-9223372036854775808L,max=9223372036854775807L;   
         System.out.println("long min value: "+min+"\nlong max value: "+max);  
        
         long num1=50L,num2=-20L;  
         System.out.println("num1: "+num1+"\nnum2: "+num2);  
       
         long x = 10l, y = 10L;
         System.out.println("x = " + x+"\ny = " + y);
      
         byte byte_val = 10;

         // this can be done
         short short_val= byte_val;
         int int_val = short_val;
         long long_val = int_val;

         System.out.println("byte value = " + byte_val); 
         System.out.println("short value = " + short_val);
         System.out.println("int value = " + int_val);
         System.out.println("long value = " + long_val);
    }
            
}

import java.util.*;

public class BitWiseOperator {
	
	public static void main(String[] args) {
		
		int num1 = 15, num2 = 50, result;
		
		int dec1 = num1;
		String bin1 = Integer.toBinaryString(dec1);
	    System.out.println("Binary of value of Decimal "+ num1 +" is "+bin1);
	    
		int dec2 = num2;
		String bin2 = Integer.toBinaryString(dec2);
	    System.out.println("Binary of value of Decimal "+ num2 +" is "+bin2);
		
		result = num1 | num2;
	    System.out.println("Bitwise OR : "+ result);
	    
	    result = num1 & num2;
	    System.out.println("Bitwise AND : "+ result);
	    
	    result = num1 ^ num2;
	    System.out.println("Bitwise XOR : "+ result);
	    
	    result = ~ num1;
	    System.out.println("bitwise complement : "+ result);
	    String binComplement = Integer.toBinaryString(result);
	    System.out.println("Binary of value of Decimal "+ result +" is "+binComplement);
	    
	    result = num1 << 2;
	    System.out.println("2 bit Left shift operation " + result);
	    
	    result = num1 >> 2;
	    System.out.println("2 bit Right shift operation " + result);	           
		
	}

}

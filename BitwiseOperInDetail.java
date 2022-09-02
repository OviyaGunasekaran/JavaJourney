
public class BitwiseOperInDetail {
	
	public static void main(String[] args) {
		
		int a=60;  // binary value is 0011 1100
		int b=13;  // binary value is 0000 1101
		int c=0;
		
		String bin_a = Integer.toBinaryString(a);
		String bin_b = Integer.toBinaryString(b);
		
		System.out.println("Binary value of a=60 is: " +bin_a );
		System.out.println("Binary value of b=13 is: " +bin_b );
		
		c = a & b;  // 0000 1100  dec value is 12
		System.out.println("a & b = " + c);
		
		c = a | b;  // 0011 1101  dec value is 61
		System.out.println("a | b = " + c);
		
		c = a ^ b;  // 0011 0001  dec value is 49
		System.out.println("a ^ b = " + c);
		
		c = ~a;  // 1100 0011  dec value is -61
		System.out.println("~a = " + c);
		
		c = a << 2;  // 1111 0000  dec value is 240
		System.out.println("a << 2 = " + c);
		
		c = a >> 2; // 1111  dec value is 15
		System.out.println("a >> 2 = " + c);
		
		c = a >>> 2;  // 0000 1111 dec value is 15, it is compulsorily printing zeroes at front
		System.out.println("a >>> 2 = " + c);
		
	}

}

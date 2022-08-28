public class StaticFunctionality {
	
	// test2 : Use of static blocks
	// static variable
    static int a = 10;
    static int b;
      
    // static block
    static {
        System.out.println("Static block initialized.");
        b = a * 4;
    }

    // static method
    static void test1()
    {
        System.out.println("\ntest1: function called without creating any object of class StaticFunctionality");
    }
    
    // test3 : static keyword with Classes
    private static String str = "\ntest3: static keyword with Classes. Hello Java";
    
    // Static class
    static class MyNestedClass {
        
        // non-static method
        public void disp(){ 
          System.out.println(str); 
        }
    }
    
  
    public static void main(String[] args)
    {
          test1();
          
       // test2 : Use of static blocks
          
          System.out.println("\ntest2: Use of static blocks. From main");
          System.out.println("Value of a : "+a);
          System.out.println("Value of b : "+b);
          
       // test3 : static keyword with Classes
          
          StaticFunctionality.MyNestedClass obj = new StaticFunctionality.MyNestedClass();
          obj.disp();
          
    }
}

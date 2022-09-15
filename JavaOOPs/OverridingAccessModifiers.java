package JavaPgms;

public class OverridingAccessModifiers {
	
	// A Simple Java program to demonstrate Overriding and Access-Modifiers

		static class Parent {
			// private methods are not overridden
			private void m1()
			{
				System.out.println("From parent m1()");
			}

			protected void m2()
			{
				System.out.println("From parent m2()");
			}
		}

		static class Child extends Parent {
			// new m1() method
			// unique to Child class
			private void m1()
			{
				System.out.println("From child m1()");
			}

			// overriding method
			// with more accessibility
			@Override
			public void m2()
			{
				System.out.println("From child m2()");
			}
		}

		// Driver class

			public static void main(String[] args)
			{
				Parent obj1 = new Parent();
				obj1.m2();
				Child obj2 = new Child();   // Parent obj2 = new Child(); this is also correct
				obj2.m2();
			}

}

package JavaPgms;

public class OOPinheritance {

		static class SolarSystem {
			public void printSolar() { 
				System.out.println("I am the Master"); }
		}
		static class Earth extends SolarSystem {
			public void printEarth() { 
				System.out.println("Earth here"); }
		}
		static class Mars extends SolarSystem {
			public void printMars() { 
				System.out.println("Mars here"); }
		}
		
		static public class Moon extends Earth 
		{
		    public static void main(String args[])
		    {
		        SolarSystem s = new SolarSystem();
		        Earth e = new Earth();
		        Mars m = new Mars();
		 // instanceof checks the same type of objects
		        System.out.println(s instanceof SolarSystem);
		        System.out.println(e instanceof Earth);
		        System.out.println(m instanceof SolarSystem);
		        
		        s.printSolar();
		        e.printEarth();
		        m.printMars();
		        
		    }
		}

}

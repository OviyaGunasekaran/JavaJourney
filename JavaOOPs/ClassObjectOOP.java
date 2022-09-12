public class ClassObjectOOP // Class Declaration

{
	String name;	// Instance Variables
	String breed;
	int age;
	String color;

	public ClassObjectOOP(String name, String breed, int age, String color)	// Constructor Declaration of Class
		{
			this.name = name;
			this.breed = breed;
			this.age = age;
			this.color = color;
		}

	public String getName() {	  // method 1
			return name;
		}

	public String getBreed() {		// method 2
			return breed;
		}

	public int getAge()  {		// method 3
			return age;
		}

	public String getColor() {		// method 4
			return color;
		}
	
@Override   // without this also the code works fine
	public String toString() {
	
			return("My name is "+ this.getName()+
				   ".\nMy breed,age and color are " + 
					this.getBreed()+","+ this.getAge()+","+ this.getColor());
		}
	
	
	public static void main(String[] args)  
	{
		ClassObjectOOP pet = new ClassObjectOOP("Maruthi","TigerBreed", 2, "ginger");
			System.out.println(pet.toString());
	}
}


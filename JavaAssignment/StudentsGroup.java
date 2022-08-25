import java.util.Scanner;

public class StudentsGroup {
	
	public static void main(String args[]) {
		
		int rollStart, rollEnd;
		System.out.print("Enter the Number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		rollStart = 101;
		rollEnd = rollStart+(num-1);
		
		System.out.println();
		group("Group1:", rollStart, rollStart, rollEnd );
		System.out.println();
		group("Group2:", rollStart+1, rollStart, rollEnd );
		System.out.println();
		group("Group3:", rollStart+2, rollStart, rollEnd );
		System.out.println();
		group("Group4:", rollStart+3, rollStart, rollEnd );
		System.out.println();
	}
	
	static void group(String name, int first, int rollStart, int rollEnd) {
		System.out.println(name);
		System.out.println(+first);
		while(first>=rollStart && first<=(rollEnd-4)){
		first=first+4;
		System.out.println(+first);	
		}
	}
}

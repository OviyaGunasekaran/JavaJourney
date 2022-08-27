public class ArrayCopy {

		public static void main(String[] args)
		{
			int a[] = { 1, 2, 3, 4, 5 };
			int b[] = new int[a.length];
			int c[] = new int[a.length];
			
			for (int i = 0; i < a.length; i++)
				
				b[i] = a[i];

					// Changing b[] to verify that
					// b[] is different from a[]
					//b[0]++;
			System.out.println("Contents of a[] ");

			for (int i = 0; i < a.length; i++)
				System.out.print(a[i] + " ");

			System.out.println("\nContents of b[] ");

			for (int i = 0; i < b.length; i++)
				System.out.print(b[i] + " ");
			
			//using arraycopy method
			
			System.arraycopy(a, 0, c, 0, c.length);
			
			System.out.println("\nContents of c[] using arraycopy method ");

			for (int i = 0; i < c.length; i++)
				System.out.print(c[i] + " ");
			
			//using clone method
			
			int[] d = c.clone();
			
			System.out.println("\nContents of d[] using clone method ");

			for (int i = 0; i < d.length; i++)
				System.out.print(d[i] + " ");
			
		}
			
}

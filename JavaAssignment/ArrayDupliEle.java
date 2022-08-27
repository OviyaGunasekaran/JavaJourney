public class ArrayDupliEle {

	public static void main(String args[])
		{
			int arr[] = { 7, 14, 21, 28, 21, 35, 49, 56, 49, 49 };
			
			System.out.println("Array elements: ");
			
			for (int i = 0; i < arr.length; i++) 
			{
				if (arr[i] >= arr.length * 2) 
				{
					System.out.print(arr[i] + " ");
				}
			}
			
			System.out.println("\n\nDuplications : ");
			
			int [] fr = new int [arr.length];  
		    int visited = -1;
		    
		    for(int i = 0; i < arr.length; i++)
		    {  
		        int count = 1;  
		        for(int j = i+1; j < arr.length; j++)
		        {  
		            if(arr[i] == arr[j]){  
		                count++;  
		                //To avoid counting same element again  
		                fr[j] = visited;  
		            }  
		        }  
		        if(fr[i] != visited)  
		            fr[i] = count;  
		    }  

			
			for(int i = 0; i < fr.length; i++)
		    {  
		        if(fr[i] != visited) 
		        {
		        	if (fr[i]>1)
		            System.out.println("Duplicate Element " + arr[i] + " occurs " + fr[i]+" times");  
		        }
		    }  

		}
}

public class ArrayElementFreq {
	
	public static void main(String[] args)
	{ 
    int [] arr = new int [] {3, 6, 9, 12, 6, 3, 1, 9, 9};  
    int [] fr = new int [arr.length];  
    int visited = -1;
    
    System.out.print("Array Elements: ");
	
	for (int i = 0; i < arr.length; i++) 
	{
		System.out.print(arr[i] + " ");
	}
    
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

    System.out.println("");  
    for(int i = 0; i < fr.length; i++)
    {  
        if(fr[i] != visited)  
            System.out.println("Array Element " + arr[i] + " occurs " + fr[i]+" times");  
    }  
    
	}

}

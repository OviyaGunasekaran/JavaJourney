import java.util.*;

public class ArrayMergeNoDupli {

	  public static void SortArray(int a[], int b[], int res[], int n, int m)
	  {
	    int i=0, j=0, k=0;
	    while (i < n){
	      res[k] = a[i];
	      i++;
	      k++;
	    }
	     while (j < m) {
	              res[k] = b[j];
	              j++;
	              k++;
	          }
	     Arrays.sort(res);
	      
	   }
	  
	  static int removeDuplicates(int res[], int a){
	    
	    if(a == 0 || a ==1 ){
	      return a;
	    }
	    
	    int j= 0 ;
	    for(int i= 0; i <a-1; i++ )
	        if(res[i] !=res [i+1])
	        res[j++]= res [i];
	    res[j++] = res [a-1];
	    
	    return j;
	    
	    }
	  
	   public static void main(String[] args) {
	     
	     int a[] = {10,20,30,40,50};
	     int b[] = {60,70,80,90,10,20,30};
	     int n = a.length;
	     int m = b.length;   
	     int res[] = new int[ n + m];
	     
	     System.out.println("Array 1: ");
		 for (int i = 0; i < a.length; i++) 
			{
				System.out.print(a[i] + " ");
			}
			
		System.out.println("\nArray 2: ");
		for (int i = 0; i < b.length; i++) 
			{
				System.out.print(b[i] + " ");
			}
		

	     SortArray(a, b, res, n, m);
	     
	     System.out.println("\n\nSorted merged list");
	     
	     for (int i= 0 ; i < n+ m ;i++){
	       System.out.print(res[i]+" ");
	     }
	     
	 
	     
	     int h = res.length;
	     h =removeDuplicates(res, h);
	     
	     System.out.println("\n\nMerged Array without duplicates");
	          for (int i=0; i<h; i++){
	             System.out.print(res[i]+" ");
	      }
	  }
}

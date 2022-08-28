import java.util.*;

public class SubStringRetIndex {
	
	public static void main(String[] args) 
	{
		String strful = "test123string";
	    String strsub = "123";
	    char c = strsub.charAt(0);
	    int output = -1;
	    for(int i =0;i < strful.length();i++)
	    {
	        if(strful.charAt(i) == c)
	            {
	              if( strsub.equals((strful.substring(i, (i+strsub.length()) ) )) )
	                {
	                   output = i;
	                }
	            }
	    }
	        
	    System.out.println("Substring index " + output);
	        
	 }
}

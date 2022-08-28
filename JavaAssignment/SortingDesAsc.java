import java.util.*;
import java.lang.*;
public class SortingDesAsc {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int[] arr = new int[7];
       System.out.println("Enter seven numbers");
       for(int i=0;i<arr.length;i++)
        arr[i] = sc.nextInt();
        int len = arr.length;
        int temp;
        for(int i = 0;i<len;i++)
        {
            if((i%2) ==0)
            {
                for(int x = i;x<len; x=x+2)
                {
                    for(int y = i;y<len;y=y+2)
                    {
                        if(arr[x] > arr[y])
                        {
                            temp = arr[x];
                            arr[x] = arr[y];
                            arr[y] = temp;
                        }
                    }
                }
            }
            else
            {
               for(int x = i;x<len; x=x+2)
                {
                    for(int y = i;y<len;y=y+2)
                    {
                        if(arr[x] < arr[y])
                        {
                            temp = arr[x];
                            arr[x] = arr[y];
                            arr[y] = temp;
                        }
                    }
                } 
            }
        }
        System.out.println("Resulting array: " + Arrays.toString(arr));
}
}

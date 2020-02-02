import java.util.HashSet;

public class NEWHASH1 {

	static boolean isSubset(int a1[],int a2[],int m,int n)
	{
		HashSet<Integer>hset=new HashSet<Integer>();
		
		for(int i=0; i<m; i++)
		{
			if(!hset.contains(a1[i]))
			{
				hset.add(a1[i]);
			}
				
		}
		
		for(int i=0; i<n; i++)
		{
			if(!hset.contains(a2[i]))
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args)  
    {  
        int arr1[] = {10,5,2,23,19}; 
        int arr2[] = {19,5,3}; 
          
        int m = arr1.length; 
        int n = arr2.length; 
              
        if(isSubset(arr1, arr2, m, n)) 
        System.out.println("arr2 is a subset of arr1"); 
        else
        System.out.println("arr2 is not a subset of arr1"); 
    } 
}

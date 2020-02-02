import java.util.Random;

public class Client {

	public static void main(String[]args) {
		
		int max = 10001;
		Random ran = new Random();
		int m = 5 , n=5, sum = 0, c, d, k;
		
		int first_matrix[][] = new int[max][max];
		int second_matrix[][] = new int[max][max];
		int multiplication_matrix[][] = new int[max][max];
		
		for (c = 0; c < m; c++)
	         for (d = 0; d < n; d++)
	            first_matrix[c][d] = ran.nextInt(10000);
		
		for (c = 0; c < m; c++)
	         for (d = 0; d < n; d++)
	            second_matrix[c][d] = ran.nextInt(10000);
		
		for (c = 0; c < m; c++) {
			for (d = 0; d < n; d++) {
				System.out.print(first_matrix[c][d]+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		for (c = 0; c < m; c++) {
			for (d = 0; d < n; d++) {
				System.out.print(second_matrix[c][d]+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		for (c = 0; c < m; c++)
        {
           for (d = 0; d < n; d++)
           {  
              for (k = 0; k < n; k++)
              {
                 sum = sum + first_matrix[c][k]*second_matrix[k][d];
                 factorial(sum);
              }

              multiplication_matrix[c][d] = sum;
              sum = 0;
           }
        }
		
	}
		
	   static void factorial(int n) 
	    { 
	        int res[] = new int[500]; 
	  
	        res[0] = 1; 
	        int res_size = 1; 
	        
	        res_size = multiply(n, res, res_size); 
	  
	        System.out.println("Factorial of given number is "); 
	        for (int i = res_size - 1; i >= 0; i--) 
	            System.out.print(res[i]); 
	    } 
		
		  static int multiply(int x, int res[], int res_size) 
		    { 
		        int carry = 0; 
		 
		        for (int i = 0; i < res_size; i++) 
		        { 
		            int prod = res[i] * x + carry; 
		            res[i] = prod % 10;  
		                                
		            carry = prod/10; 
		        } 

		        while (carry!=0) 
		        { 
		            res[res_size] = carry % 10; 
		            carry = carry / 10; 
		            res_size++; 
		        } 
		        return res_size; 
		    }
		
	
}

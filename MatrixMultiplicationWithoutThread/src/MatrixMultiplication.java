import java.util.Random;
public class MatrixMultiplication {
public static void main(String[]args) {		
	    long startTime = System.nanoTime();	    
		int max = 10001;
		Random ran = new Random();
		int m = 50 , n=50, sum = 0, c, d, k;
		int first_matrix[][] = new int[max][max];
		int second_matrix[][] = new int[max][max];
		long multiplication_matrix[][] = new long[max][max];		
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
		
		for (c = 0; c < m; c++){
           for (d = 0; d < n; d++){  
              for (k = 0; k < n; k++){
                 sum = sum + first_matrix[c][k]*second_matrix[k][d];
              }
              multiplication_matrix[c][d] = sum;
              sum = 0;
           }
        }		
        for (c = 0; c < m; c++){
           for (d = 0; d < n; d++)
              System.out.print(multiplication_matrix[c][d]+"\t");

           System.out.print("\n");
        }
        
      long endTime = System.nanoTime();
      System.out.println();
      System.out.println("Run-Time: "+(endTime - startTime) + " ns"); 		
	}	
}

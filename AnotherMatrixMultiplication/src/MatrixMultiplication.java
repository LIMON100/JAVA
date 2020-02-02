import java.util.Random;

public class MatrixMultiplication{
    
	private static WorkerThread[] threadPool;
	
    public static void main(String[] args){  
    	
    	long startTime = System.nanoTime();
		int max = 10001;
		Random ran = new Random();
    	
    	int first_matrix[][] = new int[max][max];
    	int second_matrix[][] = new int[max][max];
    	int multiplication_matrix[][] = new int[max][max];
    	
    	int m = 5 , n=5, sum = 0, c, d, k;
 
    	for (c = 0; c < m; c++)
	         for (d = 0; d < n; d++)
	            first_matrix[c][d] = ran.nextInt(100000);
		
		for (c = 0; c < m; c++)
	         for (d = 0; d < n; d++)
	            second_matrix[c][d] = ran.nextInt(100000);
		
		
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
    	
        for (int i = 0; i<m; i++){
            for (int j=0; j<n; j++){
            	
            	try {
            		threadPool[i] = new WorkerThread(i,j,first_matrix, second_matrix, multiplication_matrix);
                	threadPool[i].start();		
            	}
            	catch(NullPointerException e) {
            		
            	}
                
                try {
                	try {
						threadPool[i].join();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
                }
                catch(NullPointerException e) {
                	
                }
                
            }
        }
        
        System.out.print("\n");
        System.out.print("\n");
        
        for (c = 0; c < m; c++)
        {
           for (d = 0; d < n; d++)
              System.out.print(multiplication_matrix[c][d]+"\t");

           System.out.print("\n");
        } 
        
        long endTime = System.nanoTime();
        System.out.println();
        System.out.println("Run-Time: "+(endTime - startTime) + " ns"); 
    }
}
import java.util.Random;

public class MatrixMultiThread {

    private static final int rows = 5;
    private static final int columns = 5;
    private static final int max = 10001; 
    
    private static int[][] matrix = new int[max][max];
    private static int[][] transpose =  new int[max][max];
    private static int[][] result = new int[max][max];
    private static myThread[] threadPool;

    public static void main(String[] args){
    	
    	Random ran = new Random();
    	for (int c = 0; c <rows; c++)
	         for (int d = 0; d < columns; d++)
	        	 matrix[c][d] = ran.nextInt(10000);
		
		for (int c = 0; c < rows; c++)
	         for (int d = 0; d < columns; d++)
	        	 transpose[c][d] = ran.nextInt(10000);
		
		
		for (int c = 0; c < rows; c++) {
			for (int d = 0; d < columns; d++) {
				System.out.print(matrix[c][d]+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		for (int c = 0; c < rows; c++) {
			for (int d = 0; d < columns; d++) {
				System.out.print(transpose[c][d]+"\t");
			}
			System.out.println();
		}
    	
        multiply();
    }

    private static void multiply(){

        threadPool = new myThread[rows];

        long start = System.nanoTime();
        
        for(int i=0; i<rows; i++){
            threadPool[i] = new myThread(i);
            threadPool[i].start();
            try{
            threadPool[i].join();
            }
            catch (InterruptedException e){
            	
            }
        }

       System.out.println();
       System.out.println();
       for(int i=0; i<rows; i++){
           for(int j=0; j<rows; j++){
               System.out.print(result[i][j] + " ");
           }
           System.out.println();
       }
       
       System.out.println();
       long end = System.nanoTime();
       double time = (end-start);
       System.out.println("Multiplication took " + time + " ns.");
    }

    private static class myThread extends Thread{
        int index;
        
        myThread(int index){
            this.index = index;
        }
        
        public void run(){
            for(int i=0; i<rows; i++){
                for(int j=0; j<columns; j++){
                    result[index][i] += matrix[index][j] * transpose[j][i];
                }
            }
        }

    }
}


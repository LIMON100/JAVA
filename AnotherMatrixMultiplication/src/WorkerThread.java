
public class WorkerThread extends Thread{
    int row;
    int col;
    int [][] first_matrix;
    int [][] second_matrix;
    int [][] multiplication_matrix;
    int sum ;
    
    public WorkerThread(int row, int col, int[][] first_matrix,
      int[][] second_matrix, int[][] multiplication_matrix) {
        this.row = row;
        this.col = col;
        this.first_matrix = first_matrix;
        this.second_matrix = second_matrix;
        this.multiplication_matrix = multiplication_matrix;
    }
    
    /*public void run() {
    	
    	
    	
    	multiplication_matrix[row][col] = (first_matrix[row][0] * second_matrix[0][col])+ (first_matrix[row][1]*second_matrix[1][col]) ; 
    }*/
    
    public void run() {
    	
        for (int k = 0; k < col; k++)
        {
           ///sum = sum + (first_matrix[row][0] * second_matrix[0][col])+ (first_matrix[row][1]*second_matrix[1][col]) ;
        	sum = sum + first_matrix[row][k]*second_matrix[k][col];
        }

        multiplication_matrix[row][col] = sum;
        sum = 0;    	
    }
}
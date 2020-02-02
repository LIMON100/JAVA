package withThread;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class AnotherBiginteger2 {

	   private static final int tamA1=5, tamA2=5 , tamB1=5 , tamB2=2;   
	
	   private static BigInteger[][] first_matrix = new BigInteger[2][2];
	   private static BigInteger[][] second_matrix = new BigInteger[2][2];
	   private static BigInteger[][] C = new BigInteger[101][101];

	   private static myThread[] threadPool;
	
	public static void main(String[] args)  {
		   Scanner scan = new Scanner(System.in);
		   
		    System.out.println("Values of Matrix A");
		    for (int i = 0; i < tamA1; i++) {
		        for (int j = 0; j < tamA2; j++) {
		        	first_matrix[i][j] = scan.nextBigInteger();
		        }
		    }
	
		
	    System.out.println("Values of Matrix B");
	    for (int i = 0; i < tamB1; i++) {
	        for (int j = 0; j < tamB2; j++) {
	        	second_matrix[i][j] = scan.nextBigInteger();
	        }
	    }
	
	    System.out.println("Matrix-1");
	    for (int i = 0; i < tamA1; i++) {
	        for (int j = 0; j < tamA2; j++) {
	        	System.out.print(first_matrix[i][j]+"\t");
	        }
	        System.out.println();
	    }
	    System.out.println();
	    System.out.println();
	    
	    System.out.println("Matrix-2");
	    for (int i = 0; i < tamA1; i++) {
	        for (int j = 0; j < tamA2; j++) {
	        	System.out.print(second_matrix[i][j]+"\t");
	        }
	        System.out.println();
	    }
	    
	    for(int i=0 ;i<tamA1; i++) {
	    	for(int j=0; j<tamA1; j++) {
	    		C[i][j]=BigInteger.ZERO;
	    	}
	    }
	    
	    ///threadPool = new myThread[tamA1];
	    /*for (int i = 0; i <tamA1 ; i++) {
	    	myThread t1 = new myThread();
	    	t1.start();
	    	
	    }*/
	    
	    
	    /*for(int i=0; i<tamA1; i++) {
            try {
				threadPool[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }*/
	
	    System.out.println();
	    System.out.println(" Result Matrix: ");
	    for (int i = 0; i < first_matrix.length; i++) {
	        for (int j = 0; j < second_matrix.length; j++) {
	            System.out.print(C[i][j]+" ");
	        }
	        System.out.println("");
	    }
	
	}
	
   class myThread extends Thread{

		int index;
	    
	    /*myThread(int index){
	        this.index = index;
	    }*/

		public void run(){
	        for(int i=0; i<tamA1; i++){
	            for(int j=0; j<tamA2; j++){
	                C[index][i] = C[index][i].add(first_matrix[index][j].add(second_matrix[j][i]));
	            }
	        }
	    }
	}
}

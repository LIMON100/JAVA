package Big;
import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class AnotherBigInteger {
	public static void main(String[] args) throws InterruptedException {
		
		   long startTime = System.nanoTime();	 
		   Scanner scan = new Scanner(System.in);
		   Random ran = new Random();
		   int max = 10001;
		   int tamA1=5, tamA2=5 , tamB1=5 , tamB2=5;

		   BigInteger[][] first_matrix = new BigInteger[5][5];
		   BigInteger[][] second_matrix = new BigInteger[5][5];
		   BigInteger[][] C = new BigInteger[101][101];
		   
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
	    for (int i = 0; i <tamA1 ; i++) {
	        for (int j = 0; j < tamB2; j++) { 	
	            for (int k = 0; k < tamB1; k++) {
	                 C[i][j] =C[i][j].add(first_matrix[i][k].multiply(second_matrix[k][j]));	            
	            }          
	        }
	    }
	    System.out.println();
	    System.out.println(" Result Matrix: ");
	    for (int i = 0; i < first_matrix.length; i++) {
	        for (int j = 0; j < second_matrix.length; j++) {
	            System.out.print(C[i][j]+" ");
	        }
	        System.out.println("");
	        
	    }
	    long endTime = System.nanoTime();
        System.out.println();
        System.out.println("Run-Time: "+(endTime - startTime) + " ns");
	
	}
	
}

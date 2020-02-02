import java.awt.List;
import java.util.ArrayList;

public class coinchange2 {

	public int printHowManyNumber(int total,int coins[]) {
		int temp[][] = new int[coins.length+1][total+1];
		int i,j;
		
		for(i=0; i<coins.length; i++) {
			temp[i][0]=1;
		}
		
		for(i=1; i<=coins.length; i++) {
			for(j=1; j<=total; j++) {
				if(coins[i-1] > j) {
					temp[i][j] = temp[i-1][j];
				}
				else {
					temp[i][j] = temp[i-1][j] + temp[i][j-coins[i-1]];
				}
			}
		}
		
		return temp[coins.length][total];
	}
	
	public void printCoinChangeSolution(int total,int coins[]){
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		printActualSolution(result,total,coins,0);
	}
	
	public void printActualSolution(ArrayList<Integer>result, int total, int coins[], int n) {
		if(total==0) {
			for(int r : result) {
				System.out.print(r+" ");
			}
			System.out.println();
		}
		
		for(int i=n; i<coins.length; i++){
			if(total>=coins[i]) {
				result.add(coins[i]);
				printActualSolution(result, total-coins[i], coins, i);
				result.remove(result.size()-1);
			}
		}
	}
	
	public static void main(String[]args) {
		
		coinchange2 cc = new coinchange2();
		int total=5;
		int coins[] = {1,2,3};
		
		System.out.println("The number of different ways: "+cc.printHowManyNumber(total,coins));
		cc.printCoinChangeSolution(total,coins);
	}
}

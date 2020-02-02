package firstcomefirstserve;
import java.util.Scanner;
public class fcfs {
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of process: "); //First Come First Serve
		int n = sc.nextInt();
		int pid[] = new int[n];   
		int ar[] = new int[n];  
		int bt[] = new int[n];
		int ct[] = new int[n];
		int ta[] = new int[n];
		int wt[] = new int[n];
		int temp;
		float avgwt=0,avgta=0;
		for(int i = 0; i < n; i++){
			System.out.println("enter process " + (i+1) + " arrival time: ");
			ar[i] = sc.nextInt();
			System.out.println("enter process " + (i+1) + " brust time: ");
			bt[i] = sc.nextInt();
			pid[i] = i+1;
		}
		for(int  i = 0 ; i < n; i++){
			if( i == 0){	
				ct[i] = ar[i] + bt[i];
			}
			else{
				if( ar[i] > ct[i-1])
					ct[i] = ar[i] + bt[i];
				else
					ct[i] = ct[i-1] + bt[i];
			}
                        ta[i] = ct[i] ;
			wt[i] = ta[i] - bt[i] ;  
			avgwt += wt[i] ;         
			avgta += ta[i] ;             
		}
		System.out.println("\nP       Arrival     Brust   Complete    Turn    Waiting");
		for(int  i = 0 ; i< n;  i++){
			System.out.println(pid[i] + "  \t " + ar[i] + "\t" + bt[i] + "\t" + ct[i] + "\t" + ta[i] + "\t"  + wt[i] ) ;
		}
		sc.close();
		System.out.println("\nAverage Waiting Time: "+ (avgwt/n)); 
                System.out.println("\nAverage Turn Around Time: "+ (avgta/n));
        }   
}

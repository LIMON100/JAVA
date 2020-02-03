import java.util.Arrays;
import java.util.Comparator;

class Job{
	char s;
	int e;
	int profit;
	
	Job(char s,int e,int profit){
		this.s=s;
		this.e=e;
		this.profit=profit;
	}
}

class FinishTimeComparator implements Comparator<Job>{

    @Override
    public int compare(Job arg0, Job arg1) {
        if(arg0.e <= arg1.e){
            return -1;
        }
        else{
            return 1;
        }
    }
    
}

public class JobSeheduling {
	
	public int maximum(Job[] jobs){
        int T[] = new int[jobs.length];
        FinishTimeComparator comparator = new FinishTimeComparator();
        Arrays.sort(jobs, comparator);
        
        T[0] = jobs[0].profit;
        for(int i=1; i < jobs.length; i++){
            T[i] = Math.max(jobs[i].profit, T[i-1]);
            for(int j=i-1; j >=0; j--){
                if(jobs[j].e <= jobs[i].s){
                    T[i] = Math.max(T[i], jobs[i].profit + T[j]);
                    break;
                }
            }
        }
        int maxVal = Integer.MIN_VALUE;
        for (int val : T) {
            if (maxVal < val) {
                maxVal = val;
            }
        }
        return maxVal;
    }
	
	public static void main(String[]args) {
		Job jobs[]=new Job[5];
		
		//jobs[0]=new Job('a',3,6);
		//jobs[1]=new Job('b',5,6);
		//jobs[2]=new Job('c',6,5);
		//jobs[3]=new Job('d',7,4);
		//jobs[4]=new Job('e',8,11);
		//jobs[5]=new Job('f',9,2);
		
		jobs[0]=new Job('a',2,100);
		jobs[1]=new Job('b',1,19);
		jobs[2]=new Job('c',2,27);
		jobs[3]=new Job('d',1,25);
		jobs[4]=new Job('e',3,15);
		
		JobSeheduling j1=new JobSeheduling();
		System.out.println(j1.maximum(jobs));
	}
}

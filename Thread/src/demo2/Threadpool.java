
package demo2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

class processor implements Runnable{
    private int id;
    
    public processor(int id){
        this.id = id;
    }

    public void run() {
        System.out.println("Stating: "+id);
        
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(processor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Completed: "+id);
    
    }
}

public class Threadpool{
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        
        for(int i=1; i<=10; i++){
            executor.submit(new processor(i));
        }
        
        executor.shutdown();
        
        System.out.println("All task completed");
        
        try {
            executor.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException ex) {
            Logger.getLogger(Threadpool.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
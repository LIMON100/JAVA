package demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Worker {
    
    private Object lock1 = new Object();
    private Object lock2 = new Object();
    
    private Random random = new Random();
    
    private List<Integer>list1 = new ArrayList<Integer>();
    private List<Integer>list2 = new ArrayList<Integer>();
    
    public void Stageone(){
        
        synchronized(lock1){
            try {
            Thread.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
        }
        list1.add(random.nextInt(100));
        }
    }
    
    public void Stagetwo(){
        synchronized(lock2){
            try {
            Thread.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
        }
        list2.add(random.nextInt(100));
        }
    }
    
    public void processor(){
        for(int i=1; i<=1000; i++){
            Stageone();
            Stagetwo();
        }
    }
    
    public void nothing(){
        System.out.println("Starting.....");
        
        long start = System.currentTimeMillis();
        
        Thread t1 = new Thread(new Runnable(){
            public void run() {
                 processor();
            }
           
        });
        
         Thread t2 = new Thread(new Runnable(){
            public void run() {
                 processor();
            }
           
        });
        
         t1.start();
         t2.start();
         
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        long end = System.currentTimeMillis();
        
        System.out.println("Time take: "+(end-start));
        System.out.println("List1: "+list1.size()+", List2: "+list2.size());
    }
}
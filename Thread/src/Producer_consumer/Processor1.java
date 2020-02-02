
package Producer_consumer;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Processor1 {
    
    private LinkedList<Integer> list = new LinkedList<Integer>();
    private Object lock = new Object();
    final int limit = 10;
    
    public void producer1() throws InterruptedException {
        
        int value = 0;
        
        while(true){
            synchronized(lock){
                while(list.size() == limit){
                    lock.wait();
                }
                
                list.add(value++);
                lock.notify();
            }
        }  
    }
    
    public void consumer1() throws InterruptedException {
        Random scan = new Random();
        
        while(true){
            synchronized(lock){
                while(list.size() == 0){
                    try {
                        lock.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Processor1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                System.out.print("Size: "+list.size());
                int value = list.removeFirst();
                System.out.println(", value size"+value);
                lock.notify();
            }
            
        try {
            Thread.sleep(scan.nextInt(1000));
        } catch (InterruptedException ex) {
            Logger.getLogger(Processor1.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
}

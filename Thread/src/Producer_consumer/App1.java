
package Producer_consumer;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App1 {
    public static void main(String[] args) {
        Processor1 pros = new Processor1();
        
        Thread t1= new Thread(new Runnable(){
            @Override
            public void run() {
                try {
                    pros.producer1();
                } catch (InterruptedException ex) {
                    Logger.getLogger(App1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
        
        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run() {
                try {
                    pros.consumer1();
                } catch (InterruptedException ex) {
                    Logger.getLogger(App1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
        
        t1.start();
        t2.start();
        
        try {
            t1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(App1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

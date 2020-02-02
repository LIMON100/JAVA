
package enumerationjava;

enum Mobile{
    htc,Nokia,kalia
}

public class NewEnnum {
    
    public static void main(String[] args) {
        
        Mobile m = Mobile.Nokia;
        
        switch(m){
            case Nokia:
                System.out.println("Nokia is the best for kalia");
                break;
                
            case htc:
                System.out.println("1st copy of the enemy");
                break;
        }
    }
    
}

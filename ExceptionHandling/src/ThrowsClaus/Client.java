package ThrowsClaus;

class ex1 extends Exception{
	ex1(String s){
		super(s);
	}
	
}

public class Client {

	static void value(int i) throws ex1{
		if(i<18) {
			throw new ex1("Not valid");
		}
		else {
			System.out.println("Welcome to vot.");
		}
	}
	
	public static void main(String[]args) {
	
		try {
			value(13);
		} catch (ex1 e) {
			e.printStackTrace();
		}
		System.out.println("Testing");
		
	}

}

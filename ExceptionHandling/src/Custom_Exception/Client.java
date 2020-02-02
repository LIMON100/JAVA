package Custom_Exception;

import java.util.Scanner;

public class Client {

	public static void main(String[]args) {
		
		try(Scanner scan = new Scanner(System.in)){
			
			System.out.println("Enter an age");	
			int age = scan.nextInt();
			
			new Client().calculateAge(age);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private void calculateAge(int age) {
		
		if(age < 60) {
			throw new InvalidAgeException(age);
		}
		else {
			System.out.println("Recomender as a senior citizen");
			System.out.println("Give permission him to enter");
		}
		
	}
	
}

import java.util.Scanner;

public class aritmeticException {

	public static void main(String[]args) {
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(System.in);
			
			System.out.println("Enter a divided number: ");
			int divided = scanner.nextInt();
			
			System.out.println("Enter a divisor number: ");
			int divisor = scanner.nextInt();
			
			int result = divided/divisor;
			
			System.out.println("Result is: "+result);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		finally {
			scanner.close();
		}
		
		System.out.println("Bangladesh Jindabad");
	}
}

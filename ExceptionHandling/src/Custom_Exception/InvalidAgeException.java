package Custom_Exception;

public class InvalidAgeException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	private int age;

	public InvalidAgeException() {
		super();
	}
	
	public InvalidAgeException(int age){
		this.age = age;
	}
	
	public InvalidAgeException(String msg , int age){
		super(msg);
		this.age = age;
	}
	
	public InvalidAgeException(String msg , Throwable cause , int age){
		super(msg,cause);
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "InvalidExceptionForAge" + getAge();
	}
	
	@Override
	public String getMessage() {
		return "Nothing i want to say" + getAge();
	}
	
	public int getAge() {
		return age;
	}
	
	
}

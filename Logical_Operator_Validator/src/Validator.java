import java.util.Scanner;

public class Validator {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Is input valid (true/false): ");
		boolean isValid = sc.nextBoolean();
		System.out.println("Does input meet a certain condition (true/false): ");
		boolean condition = sc.nextBoolean();
		isValidInput(isValid,condition);
		
	}
	
	public static void isValidInput(boolean a, boolean b) {
		if(a && b) {
			System.out.println("Input is valid.");
		}else {
			System.out.println("Input is Invalid.");
		}
	}

}

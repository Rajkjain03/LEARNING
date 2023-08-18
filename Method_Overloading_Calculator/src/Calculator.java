import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		double num1 = scan.nextDouble();
		System.out.println("Enter the second number: ");
		double num2 = scan.nextDouble();
		System.out.println("Enter the operator (+, -, *, /): ");
		char c = scan.next().charAt(0);
		
		Cal c1 = new Cal();
		
		c1.calculate(num2,num1,c);
		
	}

}

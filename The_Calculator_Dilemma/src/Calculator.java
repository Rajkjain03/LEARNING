import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter two numbers : ");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println("Enter the number : 1 for Addition, 2 for Subtraction, 3 for Multiplication, 4 for division ");
		
		int n = scan.nextInt();
		
		switch(n) {
		
		case 1 :
			System.out.println("Addition is = " + (num1 + num2));
			break;
			
		case 2 :
			System.out.println("Subtraction is = " + (num1 - num2));
			break;	
		
		case 3 :
			System.out.println("Multiplication is = " + (num1 * num2));
			break;
		
		case 4 :
			System.out.println("Division is = " + (num1 / num2));
			break;
		
		default:
			System.out.println("Enter Number between 1 and 4 only......");	
			
		}
	}
}

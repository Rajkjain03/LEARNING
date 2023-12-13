package MultithreadingProblem;

import java.util.Scanner;

public class CalculatorApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Number: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		Addition ad = new Addition(num1,num2);
		Subtraction sb = new Subtraction(num1,num2);
		Multiply mp = new Multiply(num1,num2);
		Division dv = new Division(num1,num2);
		ad.start();
		sb.start();
		mp.start();
		dv.start();
	}
}

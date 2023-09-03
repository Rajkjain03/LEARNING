import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n = sc.nextInt();
		Power p = new Power();
		int digit = p.numberOfDigit(n);
		int res = p.power(n,digit);
		System.out.println(res);
	}

}

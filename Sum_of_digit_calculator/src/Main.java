import java.util.Scanner;

public class Main {
	
	public static void sumOfDigit(int n) {
		int sum = 0;
		while(n>0) {
			int digit = n%10;
			sum = sum+digit;
			
			n = n/10;
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		sumOfDigit(n);
	}
}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		printFibonacciSeries(n);
	}

	public static void printFibonacciSeries(int n) {
		int a = 0;
		int b = 1;
		int next = 0;
		if (n == 1) {
			System.out.println(a);
		} else if (n == 2) {
			System.out.print(a + " " + b + " ");
		} else {
			System.out.print(a + " " + b + " ");
			while (n - 2 > 0) {
				next = a + b;
				a = b;
				b = next;
				System.out.print(next + " ");
				n--;
			}
		}
	}
}

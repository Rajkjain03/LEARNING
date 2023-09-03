import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		printPrimes(n);

	}

	public static void printPrimes(int n) {
		int count =0;

		for (int i = 2; count<n; i++) {
			boolean r = checkPrime(i);
			if (r == true) {
				System.out.print(i + " ");
				count++;
			}
		}
	}

	public static boolean checkPrime(int n) {
		if (n == 2) {
			return true;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
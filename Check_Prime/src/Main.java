import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		checkPrime(n);
	}
	
	public static void checkPrime(int n) {
		if (n == 2) {
			System.out.println("Prime");
		}
		
		for(int i = 2; i<n; i++) {
			if(n % i == 0) {
				System.out.println("Not Prime");
				return;
			}
		}
		System.out.println("Prime");
		
	}

}

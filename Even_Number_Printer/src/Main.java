import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		printEvenNumbers(n);
	}
	
	public static void printEvenNumbers(int n)

	{
		for(int i = 2; i<=n; i=i+2) {
			System.out.print(i + " ");
		}
	}
}

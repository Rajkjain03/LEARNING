import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		calculateFactorial(n);
	}
	
	public static void calculateFactorial(int n)

	{
		int count = 1;
		for(int i = 1; i<= n; i++) {
			count= count * i;
		}
		System.out.println(count);

	}

}

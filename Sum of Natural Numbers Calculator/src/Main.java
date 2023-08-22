import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		calculateSum(n);
	}
	
	public static void calculateSum(int n)

	{
		int count = 0;
		for(int i = 1; i<= n; i++) {
			count= count + i;
		}
		System.out.println(count);


	}

}

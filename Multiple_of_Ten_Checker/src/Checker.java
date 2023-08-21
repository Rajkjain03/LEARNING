import java.util.Scanner;

public class Checker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		checkMultipleOfTen(n);
	}
	
	public static void checkMultipleOfTen(int n)

	{
			if(n%10==0) {
				System.out.println("The number is a multiple of 10.");
			}
			else {
				System.out.println("The number is not a multiple of 10.");
			}
	}

}

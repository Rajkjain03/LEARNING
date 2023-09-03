import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number and power :");
		int n = sc.nextInt();
		int x = sc.nextInt();
		Power p = new Power();
		p.power(n,x);
	}

}

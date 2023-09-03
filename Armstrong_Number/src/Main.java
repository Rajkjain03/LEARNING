import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		Check c = new Check();
		int dig = c.dig(n);
		int res = c.armstrong(n,dig);
		if(res == n) {
			System.out.println("Armstrong number");
		}else {
			System.out.println("Not Armstrong number");
		}
	}

}

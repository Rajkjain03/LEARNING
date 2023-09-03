import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = sc.nextInt();
		
		Palindrome p = new Palindrome();
		int rev = p.check(a);
		if(a==rev) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}

}

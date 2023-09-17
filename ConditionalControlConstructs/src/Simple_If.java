import java.util.Scanner;

public class Simple_If {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int marks = sc.nextInt();
		if(marks>=50) {
			System.out.println("Pass");
		}
	}

}

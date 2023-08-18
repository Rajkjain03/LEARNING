import java.util.Scanner;

public class Double {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to double : ");
		int num  = sc.nextInt();
		
		System.out.println(doubleTheNumber(num));
		
		
		
	}
	public static int doubleTheNumber(int num) {
		return 2*num;
	}

}

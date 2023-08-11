import java.util.Scanner;

public class BitwiseSwapper {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First integer: ");
		int a = sc.nextInt();
		System.out.println("Enter the Second integer: ");
		int b = sc.nextInt();
		swapUsingBitwise(a,b);
		
		
	}
	
	public static void swapUsingBitwise(int x, int y ) {
		
		x = x ^ y;  
		y = x ^ y;  
		x = x ^ y;  
		
		System.out.println("After swapping: First = "+x + ",Second = " +y);
	}

}

import java.util.Scanner;

public class Counter {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int n = sc.nextInt();
		
		System.out.println("Number of set bits: "+countSetBits(n));
		
	}
	
	public static int countSetBits(int n ) {
		int count = 0;
	    while (n>0) {
	        count += n & 1;
	        //right shift operator
	        n = n >> 1;
	    }
		return count;
	}

}

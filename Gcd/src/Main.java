import java.util.Scanner;

public class Main

{
//	public static void findGCD(int a, int b) {
//		int max = 0;
//		if (a > b) {
//			for (int i = 1; i < b; i++) {
//				if(a%i == 0 && b%i ==0) {
//					max=i;
//				}
//			}
//		}else {
//			for (int i = 1; i < a; i++) {
//				if(a%i == 0 && b%i ==0) {
//					max=i;
//				}
//			}
//		}
//		System.out.println(max);
//	}

//	Euclide gcd calculation
	public static void findGCD(int m, int n) {
		if (m < n) {
			while(n !=0) {
			int rem = m%n;
			m = n;
			n = rem;
			}
			System.out.println(m);
		}else {
			while(m !=0) {
				int rem = n%m;
				n = m;
				m = rem;
				}
				System.out.println(n);
		}
	}
	
	public static void main(String[] args)

	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		findGCD(a, b);
	}

}
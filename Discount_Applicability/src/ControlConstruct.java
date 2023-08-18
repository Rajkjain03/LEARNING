import java.util.Scanner;

public class ControlConstruct {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount : ");
		double d = sc.nextDouble();
		checkDiscount(d);
		
	}
	
	public static void checkDiscount(double purchaseAmount) {
		if(purchaseAmount>100) {
			System.out.println("Discount Applicable");
		}
	}

}

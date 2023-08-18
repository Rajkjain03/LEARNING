import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the purchase amount: ");
		double purchaseAmount =sc.nextDouble();
		System.out.println("Enter the tax rate (in decimal form): ");
		double taxRate = sc.nextDouble();
		
		Cal c = new Cal();
		System.out.println("Total cost including tax: " + c.calculateTotalWithTax(purchaseAmount,taxRate));
		
	}
	
}

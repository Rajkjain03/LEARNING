import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter code between P01 to P05");
		String productCode = sc.next();
		getProduct(productCode);
	}
	
	public static void getProduct(String productCode) {

		switch (productCode) {
		case "P01":
			System.out.println("Pepsi");
			break;
		case "P02":
			System.out.println("Coca cola");
			break;
		case "P03":
			System.out.println("fanta");
			break;
		case "P04":
			System.out.println("Jaljera");
			break;
		case "P05":
			System.out.println("Mountai");
			break;
		default:
			System.out.println("Enter Correct code");

		}
	}
}

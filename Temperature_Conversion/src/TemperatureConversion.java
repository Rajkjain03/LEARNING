import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to the Temperature Conversion Tool! \nSelect an option: \n1. Convert Celsius to Fahrenheit \n2. Convert Fahrenheit to Celsius\nEnter your choice: ");
		
		int num = scan.nextInt();
		
		if(num == 1) {
			System.out.println("Enter the temperature in Celsius: ");
			double c = scan.nextDouble();
			System.out.println(c +"C is equivalent to " + celsiusToFahrenheit(c)+"F");
		}else if(num == 2) {
			System.out.println("Enter the temperature in Fahrenheit: ");
			double d = scan.nextDouble();
			System.out.println(d +"F is equivalent to " + fahrenheitToCelsius(d) +"C");
		}
	}
	
	public static double celsiusToFahrenheit(double celsius) {
		return (celsius * 9/5) + 32 ;
	}
	
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) * 5/9 ;
	}

}

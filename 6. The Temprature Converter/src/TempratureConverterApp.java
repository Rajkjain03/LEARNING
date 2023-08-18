import java.util.Scanner;

public class TempratureConverterApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Temprature in Fahrenheit : ");
		double fahrenheit = sc.nextDouble();
		
		TemperatureConverter temperatureConverter = new TemperatureConverter();

		System.out.println(temperatureConverter.convertFahrenheitToCelsius(fahrenheit));
		

	}

}

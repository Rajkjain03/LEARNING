import java.util.Scanner;

public class Main

{
	public static void categorizeAge(int age)

	{
		if(age>0 && age<=12) {
			System.out.println("Child");
		}
		else if(age>12 && age<=19) {
			System.out.println("Teen");
		}
		if(age>19 && age<=59) {
			System.out.println("Adult");
		}
		else {
			System.out.println("Senior");
			
		}
	}

	public static void main(String[] args)

	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		categorizeAge(n);
	}

}
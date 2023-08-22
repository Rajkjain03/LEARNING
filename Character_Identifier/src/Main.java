import java.util.Scanner;

public class Main

{
	public static void identifyCharacter(char ch)

	{
		if (Character.isLowerCase(ch)) {
			if ("aeiou".contains(String.valueOf(ch))) {
				System.out.println("Lower-case vowel");
			} else {
				System.out.println("Lower-case consonant");
			}
		} else if (Character.isUpperCase(ch)) {
			if ("AEIOU".contains(String.valueOf(ch))) {
				System.out.println("Upper-case vowel");
			} else {
				System.out.println("Upper-case consonant");
			}
		} else if (Character.isDigit(ch)) {
			System.out.println("Digit");
		} else {
			System.out.println("Special character");
		}

	}

	public static void main(String[] args)

	{
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		identifyCharacter(ch);
	}

}
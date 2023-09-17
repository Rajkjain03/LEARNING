import java.util.Scanner;

public class Array_2D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[][] = new String[2][4];
		
		for(int i = 0; i<= str.length-1; i++) {
			for(int j = 0; j<=str[i].length-1; j++) {
				System.out.println("Enter the name of bank " + i + " employe "+ j);
				str[i][j] = sc.next();
			}
		}
		
		System.out.println("Arrays contents are ...");
		for(int i = 0; i<= str.length-1; i++) {
			for(int j = 0; j<=str[i].length-1; j++) {
				System.out.print(str[i][j]+" | ");
			}
			System.out.println();
		}
	}
}

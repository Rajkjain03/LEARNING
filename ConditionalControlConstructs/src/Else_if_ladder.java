import java.util.Scanner;

public class Else_if_ladder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks : ");
		int marks = sc.nextInt();
		if(marks>=90) {
			System.out.println("A+");
		}else if(marks>=80 && marks<90) {
			System.out.println("A");
		}else if(marks>=70 && marks<50) {
			System.out.println("B");
		}else {
			System.out.println("Fail");
		}
	}

}

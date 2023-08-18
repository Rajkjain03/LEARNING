import java.util.Scanner;

public class GradeCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int grade = sc.nextInt();
		checkGrade(grade); 
	}
	
	public static void checkGrade(int grade) {
		if(grade>50) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	}

}

import java.util.Scanner;

public class TakingInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Integer 1-D array 
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		//taking input
		System.out.println("Enter the elements of array");
		for(int i =0 ; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		//printing
		System.out.println("Array elements are....");
		for(int i =0 ; i<arr.length; i++) {
			System.out.print(arr[i]+ "|");
		}
		
		System.out.println("++++++++++++++++++++++++++++++++");
		
		//String 1-D array
		System.out.println("Enter the size of array:");
		int m = sc.nextInt();
		String str[] = new String[m];
		
		//taking input
		System.out.println("Enter the names");
		for(int i=0; i<str.length;i++) {
			str[i] = sc.next();
		}
		
		//printing 
		System.out.println("Array elements are....");
		for(int i =0 ; i<= str.length-1; i++) {
			System.out.print(str[i]+ "|");
		}
	}
}

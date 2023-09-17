import java.util.Scanner;

public class Array_3D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("3D-Array");
		//creating 3D-Array
		//int [][][]arr = new int[2][2][3];
		
					//or
		
		System.out.println("enter the length of each dimension");
		int arr[][][] = new int[sc.nextInt()][sc.nextInt()][sc.nextInt()];
		
		//taking input
		for(int i=0; i<=arr.length-1; i++) {
			for(int j =0 ; j<= arr[i].length-1; j++) {
				for(int k =0 ; k<= arr[i][j].length-1; k++) {
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		
		//printing array
		System.out.println("Array elements are....");
		for(int i=0; i<=arr.length-1; i++) {
			for(int j =0 ; j<= arr[i].length-1; j++) {
				for(int k =0 ; k<= arr[i][j].length-1; k++) {
					System.out.print(arr[i][j][k] + "|");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}

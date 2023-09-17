import java.util.Scanner;

public class Jagged_3D_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		creating 3d jagged array
		int arr[][][] = new int[2][][];
//		arr[0] = new int[2][];
//		arr[1] = new int[3][];
//		
//		arr[0][0] = new int[2] ;
//		arr[0][1] = new int[1] ;
//		arr[1][0] = new int[3] ;
//		arr[1][1] = new int[4] ;
//		arr[1][2] = new int[1] ;

//					or
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println("enter 2d array size");
			int n = sc.nextInt();
			arr[i] = new int[n][];
		}
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				System.out.println("enter 1d array size");
				int m = sc.nextInt();
				arr[i][j] = new int[m];
			}

		}

//		taking input
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				for (int k = 0; k <= arr[i][j].length - 1; k++) {
					arr[i][j][k] = sc.nextInt();
				}
			}
		}

//		printing array
		System.out.println("Array elements are: ");
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				for (int k = 0; k <= arr[i][j].length - 1; k++) {
					System.out.print(arr[i][j][k] + "|");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}

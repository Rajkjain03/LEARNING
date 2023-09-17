import java.util.Scanner;

public class Jagged_3D_example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		creating array
//		int arr[][][] = new int[2][][];
//		
//		arr[0] = new int[2][];
//		arr[1] = new int[3][];
//		
//		arr[0][0] = new int[3];
//		arr[0][1] = new int[4];
//		arr[1][0] = new int[3];
//		arr[1][1] = new int[2];
//		arr[1][2] = new int[4];
		
//						or
		System.out.println("enter the length of 3d array");
		int arr[][][] = new int[sc.nextInt()][][];
		
		for(int i =0 ; i<= arr.length-1; i++) {
			arr[i] = new int[sc.nextInt()][];
		}
		for(int i =0 ;i<=arr.length-1; i++) {
			for(int j =0; j<=arr[i].length-1; j++) {
				arr[i][j] = new int[sc.nextInt()];
			}
		}
		
//		taking input
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=0; j<=arr[i].length-1;j++) {
				for(int k =0; k<=arr[i][j].length-1;k++) {
					System.out.println("student " + i + " class " + j + " student " +k);
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
//		printing array
		System.out.println("array elements are:");
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=0; j<=arr[i].length-1;j++) {
				for(int k =0; k<=arr[i][j].length-1;k++) {
					System.out.print(arr[i][j][k]+ "|");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}

import java.util.Scanner;

public class Jagged_2D_array {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		creating array
		double [][]h = new double[3][];
		
//		h[0] = new double[2];
//		h[1] = new double[4];
//		h[2] = new double[3];
						// OR(after removing redundency)
		for(int i = 0; i<= h.length-1; i++) {
			System.out.println("enter the players in game "+ i );
			int n = sc.nextInt();
			h[i] = new double[n];
		}
		
//		taking input
		for(int i =0 ;i <= h.length-1; i++) {
			for(int j =0; j<= h[i].length-1; j++) {
				System.out.println("Enter height of game " + i+ " player " + j);
				h[i][j] = sc.nextDouble();
			}
		}
		
//		printing array
		System.out.println("Array content are:"); 
		for(int i =0 ;i <= h.length-1; i++) {
			for(int j =0; j<= h[i].length-1; j++) {
				System.out.print(h[i][j] + "|");
			}
			System.out.println();
		}
	}
}

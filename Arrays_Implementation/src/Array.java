import java.util.Scanner;

public class Array {
	private int arr[] = null;
	private Scanner sc = new Scanner(System.in);

	public Array(int n) {
		arr = new int[n];
	}

	public void insert() {
		System.out.println("Enter The Position from 0 to " + (arr.length - 1));
		int pos = sc.nextInt();

		System.out.println("Enter an integer element to insert into position " + pos);
		int elem = sc.nextInt();

		arr[pos] = elem;
	}

	public void delete()

	{
		System.out.println("Enter the position from which element has to be deleted");
		int pos = sc.nextInt();
		arr[pos] = 0;
	}

	public void display() {
		for (int i : arr) {
			System.out.println(i);
		}

	}
}

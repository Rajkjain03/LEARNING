
public class LabeledWhile {

	public static void main(String[] args) {
		
		int j = 1;
		a :while(j<=5) {
		int i =1;
		b :while(i<=5) {
			System.out.print("* ");
			i++;
			break a;
		}
		System.out.println();
		j++;
		}

	}

}

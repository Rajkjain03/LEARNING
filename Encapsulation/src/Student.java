
public class Student {
	public static void main(String[] args) {
		StudentApp s = new StudentApp();
		s.setData(12, "raj", 23);
		System.out.println(s.getAge());
		System.out.println(s.getName());
		System.out.println(s.getRollNo());
	}
}


public class StudentApp {

	public static void main(String[] args) {
		//object creation 
		Student s1 = new Student();
		
		//using functionality of object
		s1.study();
		s1.eat();
		
		s1.id = 1;
		System.out.println(s1.id);

	}

}

package Practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StudentApp {
	
	public static void main(String[] args) {
		Student s1 = new Student(2,"raj",95.1f);
		Student s2 = new Student(1,"aman",88.4f);
		Student s3 = new Student(3,"anuj",93.31f);
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		System.out.println(al.toString());
		Collections.sort(al);
		System.out.println(al);
		
	}
}

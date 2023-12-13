package Practice;

public class Student implements Comparable<Student>
{
	int rollNumber;
	String name;
	float percentage;


	public Student(int rollNumber, String name, float percentage) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.percentage = percentage;
	}
	
	@Override
	public int compareTo(Student o) {
		if(this.rollNumber < o.rollNumber) {
			return -1;
		}else if(this.rollNumber > o.rollNumber) {
			return 1;
		}else {
			return 0;
		}
	}
	
	@Override
	public String toString() {
		return rollNumber+ " " + name +  " " + percentage;
	}

}

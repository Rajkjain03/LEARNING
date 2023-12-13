package MultithreadingUsingSingleRunMethodByExtendingThreadClass;

public class ProgramApp {
	
	public static void main(String[] args) {
		Program t1 = new Program();
		Program t2 = new Program();
		t1.setName("number");
		t2.setName("char");
		t1.start();
		t2.start();
	}
}

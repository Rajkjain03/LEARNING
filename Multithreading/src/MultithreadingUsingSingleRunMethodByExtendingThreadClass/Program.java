package MultithreadingUsingSingleRunMethodByExtendingThreadClass;

public class Program extends Thread{
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("number")) {
			numPrinting();
		}else {
			charPrinting();
		}
	}
	
	public void numPrinting() {
		try {
			System.out.println("num printing started");
			for(int i=1; i<=5; i++) {
				System.out.println(i);
				Thread.sleep(2000);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void charPrinting() {
		try {
			System.out.println("char printing started");
			for(char i='A'; i<='E'; i++) {
				System.out.println(i);
				Thread.sleep(2000);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

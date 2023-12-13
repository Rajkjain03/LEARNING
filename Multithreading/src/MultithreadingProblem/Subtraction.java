package MultithreadingProblem;

public class Subtraction extends Thread{
	int num1;
	int num2;
	
	public Subtraction(int num1,int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void run(){
		try {
			System.out.println("Subtraction started");
			Thread.sleep(2000);
			System.out.println("Subtraction : " + (num1-num2));
			Thread.sleep(2000);
			System.out.println("Subtraction ended");
		}catch(Exception e ) {
			e.printStackTrace();
		}
		
	}
}
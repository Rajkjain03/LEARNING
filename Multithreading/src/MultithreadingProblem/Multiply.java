package MultithreadingProblem;

public class Multiply extends Thread{
	int num1;
	int num2;
	
	public Multiply(int num1,int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	public void run(){
		try {
			System.out.println("Multiplication started");
			Thread.sleep(2000);
			System.out.println("Multiply : " + (num1*num2));
			Thread.sleep(2000);
			System.out.println("Multiplication ended");
		}catch(Exception e ) {
			e.printStackTrace();
		}
		
	}
}
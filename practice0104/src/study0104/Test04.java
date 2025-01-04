package study0104;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food f = new Food();
		Phone p = new Phone();
		Thread t1 = new Thread(new Movie());
		
		p.setPriority(Thread.MAX_PRIORITY); 	// 스레드 최대 우선순위 -> 10
		f.setPriority(Thread.MIN_PRIORITY); 	// 스레드 최소 우선순위 -> 1
		
		f.start(); 
		t1.start();
		p.start();
		

	}

}

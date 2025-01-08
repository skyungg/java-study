package study0108;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone calling = new Phone();
		calling.start();
		
		try {
			calling.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		for(int i = 1; i <= 1000; i++) {
			System.out.println("음식 먹기 : "+ i);
		}

	}
}

class Phone extends Thread{
	public void run() {
		for(int i = 1; i <= 1000; i++) {
			System.out.println("전화 받기 : " + i);
		}
	}
}

package study0104;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Work1 w1 = new Work1();
		Work2 w2 = new Work2();
		w1.start();
		w2.start();
	}

}

class Work1 extends Thread{
	Work1(){
		setName("파일 저장");		// 스레드 이름 지정
	}
	
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(this.getName() + " 작업 중 ...");
		}
	}
}

class Work2 extends Thread{
	Work2(){
		setName("서버 연결");
	}
	
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(this.getName() + " 작업 중 ...");
		}
	}
}

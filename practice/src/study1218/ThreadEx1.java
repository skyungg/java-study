package study1218;

class ThreadEx1_1 extends Thread{
	// Thread 클래스 상속
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println(getName());	// 조상 Thread의 getName() 호출
		}
	}
}

class ThreadEx1_2 implements Runnable{
	// Runnable 인터페이스 구현
	public void run() {
		for(int i = 0; i < 5; i++) {
//			Thread.currentThread();	// 현재 실행중인 Thread 반환
			System.out.println(Thread.currentThread().getName());	// 조상 Thread의 getName() 호출
		}
	}
}

public class ThreadEx1 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		ThreadEx1_1 t1 = new ThreadEx1_1();		// Thread의 자손 클래스의(ThreadEx_1) 인스턴스 생성
		
		ThreadEx1_2 r = new ThreadEx1_2();		// Runnable을 구현한 클래스의 인스턴스 생성
		Thread t2 = new Thread(r);				// 생성자
//		Thread t2 = new Thread(new ThreadEx1_2());
		
		t1.start();
		t2.start();
//		t1.start();				// 하나의 쓰레드 두 번이상 호출 ->IllegalThreadStateException 발생
	}

}

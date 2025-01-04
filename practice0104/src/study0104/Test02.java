package study0104;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Movie());		// 1. new Thread()로 스레드 객체 생성
		Thread t2 = new Thread(() ->  {
			for(int i = 1; i <= 1000; i++) {
				System.out.println("전화 받기 : " + i);
			}
		});
		
		t1.start();
		t2.start();
		for(int i = 1; i <= 1000; i++) {
			System.out.println("TV 보기 : " + i);
		}
	}
}

/* Movie는 Runnable 인터페이스 상속 받음
 * run() 메소드를 오버라이딩해서 스레드에서 실행할 내용 구현
 */
class Movie implements Runnable{
	@Override
	public void run() {
		for(int i = 1; i <= 1000; i++) {
			System.out.println("영화 보기 : " + i);
		}
	}
}

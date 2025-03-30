package study0104;

public class Test01 {

	public static void main(String[] args) {		// 1. 가장 처음 main() 메서드 실행하는 스레드 생성
		// TODO Auto-generated method stub
		Food work1 = new Food();		// 2. Thread 상속 받은 Food, Phone 객체 생성
		Phone work2 = new Phone();
		
		work1.start();		// 3. start() 메서드는 스레드 생성 후, run() 메서드 호출
		work2.start();
		
		for(int i = 1; i <= 1000; i++) {
			System.out.println("TV 보기 : " + i);
		}
	}

}

/*
 * Thread 상속받는 Food 클래스 생성
 * Food 클래스 -> 스레드로 동작할 객체
 * Thread 클래스의 run() 메서드를 오버라이딩해서 스레드로 실행할 내용 구현
 */
class Food extends Thread{
	public void run() {
		for(int i = 1; i <= 1000; i++) {
			System.out.println("음식 먹기 : " + i);
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

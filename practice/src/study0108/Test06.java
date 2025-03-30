package study0108;

import java.util.ArrayList;
import java.util.List;


public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pool pool = new Pool();
		Thread productGet = new Thread(new ProductGet(pool));
		Thread productAdd = new Thread(new ProductAdd(pool));
		
		productGet.start();
		productAdd.start();
	}
}

class Pool{
	List<String> products = new ArrayList<>();
	
	public synchronized void get() throws InterruptedException{	// 소비 작업 수행 메서드
		if(products.size() == 0) {
			wait();
		}
		products.remove(0);
		System.out.println("소비 / 재고  =" + products.size());
	}
	
	public synchronized void add(String value) {	// 생산 작업 수행 메서드
		products.add(value);
		System.out.println("생산 / 재고  ="+products.size());
		notifyAll();	// wait() 메서드에 의해 wating 대기 사앹에 있던 모든 스레드 -> runnable 상태로 전환
	}
}

class ProductGet implements Runnable{
	Pool pool;
	
	ProductGet(Pool pool){
		this.pool = pool;
	}
	
	public void run() {
		try {
			for(int i = 1; i <= 10; i++) {
				pool.get();
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class ProductAdd implements Runnable{
	Pool pool;
	
	ProductAdd(Pool pool){
		this.pool = pool;
	}
	
	public void run() {
		for(int i = 1; i <= 10; i++) {
			pool.add("상품" + i );
		}
	}
}
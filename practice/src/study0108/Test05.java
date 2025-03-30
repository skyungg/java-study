package study0108;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		
		DrawThread t1 = new DrawThread(account);
		DrawThread t2 = new DrawThread(account);
		
		t1.start();
		t2.start();

	}
}

class Account{
	private long balance = 1000;
	
	public synchronized void draw(long amount) {	// 메서드 동기화
		balance -= amount;
	}
	
	public long getBalance() {
		return balance;
	}
}

class DrawThread extends Thread{
	Account account;
	
	DrawThread(Account account){
		this.account = account;
	}
	
	public void run() {
//		synchronized( account) {		// 블록 동기화
			for(int i = 0; i < 10; i++) {
				account.draw(10);
				System.out.println(this.getName()+ " 출금 후 잔액 "+account.getBalance());
			}
		}
//	}
}
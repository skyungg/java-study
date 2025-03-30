package generic;

// Mart1은 Apple만 담을 수 있는 클래스
class Apple{}
class Mart1{
	private Apple apple;
	
	public void setApple(Apple apple) {
		this.apple = apple;
	}

	public Apple getApple() {
		return apple;
	}
}

//Mart2는 Orange만 담을 수 있는 클래스
class Orange{}
class Mart2{
	private Orange orange;
	
	public void setOrange(Orange apple) {
		this.orange = orange;
	}

	public Orange getOrange() {
		return orange;
	}
}

//Mart3는 Mango만 담을 수 있는 클래스
class Mango{}
class Mart3{
	private Mango mango;
	
	public void setMango(Mango mango) {
		this.mango = mango;
	}

	public Mango getMango() {
		return mango;
	}
}

public class BeforeGenericStudy {

	public static void main(String[] args) {
		Mart1 mart1 = new Mart1();
		Apple apple = mart1.getApple();
		
		Mart2 mart2 = new Mart2();
		Orange orange = mart2.getOrange();
		
		Mart3 mart3 = new Mart3();
		Mango mango = mart3.getMango();
		
		// Mart3에는 Orange를 담을 수 없음 -> 에러남.
//		Orange orange = mart3.getMango();
		
	}

}

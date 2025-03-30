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
	
	void showType() {
		System.out.println("T의 타입은 " + apple.getClass().getName());
	}
}

//Mart2는 Orange만 담을 수 있는 클래스
class Orange{}
class Mart2{
	private Orange orange;
	
	public void setOrange(Orange orange) {
		this.orange = orange;
	}

	public Orange getOrange() {
		return orange;
	}
	
	void showType() {
		System.out.println("T의 타입은 " + orange.getClass().getName());
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
	void showType() {
		System.out.println("T의 타입은 " + mango.getClass().getName());
	}
}

public class BeforeGenericStudy {

	public static void main(String[] args) {
		Mart1 mart1 = new Mart1();
		mart1.setApple(new Apple());
		mart1.showType();
		
		Mart2 mart2 = new Mart2();
		mart2.setOrange(new Orange());
		mart2.showType();
		
		Mart3 mart3 = new Mart3();
		mart3.setMango(new Mango());
		mart3.showType();
		
		// Mart3는 Mango만 담을 수 있으므로, Orange는 담을 수 없음 -> 에러남.
//		Mart3 mart4 = new Mart3();
//		mart4.setMango(new Orange());
		
	}

}

package generic;

class ObjectMart{
	private Object thing;
	
//	public ObjectMart(Object thing) {
//		this.thing = thing;
//	}
	
	public Object getThing() {
		return thing;
	}
	
	public void setThing(Object thing) {
		this.thing = thing;
	}
	
	void showType() {
		System.out.println("T의 타입은 " + thing.getClass().getName());
	}
	

}

public class ObjectTest {
	public static void main(String[] args) {
		ObjectMart oMart1 = new ObjectMart();
		oMart1.setThing(new Apple());
		
		ObjectMart oMart2 = new ObjectMart();
		oMart2.setThing(new Orange());
		
		ObjectMart oMart3 = new ObjectMart();
		oMart3.setThing(new Mango());
		
		oMart1.showType();
		oMart2.showType();
		oMart3.showType();
		
		// 형변환 필수
//		Apple apple = oMart1.getThing();
//		Orange orange = oMart2.getThing();
//		Mango mango = oMart3.getThing();
		
		Apple apple = (Apple)oMart1.getThing();
		Orange orange = (Orange)oMart2.getThing();
		Mango mango = (Mango)oMart3.getThing();
		
		// 잘못된 캐스팅 -> 약한 타입 체크
		ObjectMart oMart4 = new ObjectMart();
		oMart4.setThing(new Apple());	// Apple 객체 저장
		oMart4.showType();
		Orange orange1 = (Orange)oMart4.getThing();
//		System.out.println("저장은 Apple, 반환은 Orange -> oMart4의 타입은? "+ orange1.getClass().getName());
		

	}

}

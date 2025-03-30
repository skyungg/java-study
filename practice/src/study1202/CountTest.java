package study1202;

class Count{
	public static int totalCount;
	int count;
}

public class CountTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("totalCount 시작 : " + Count.totalCount++);
		Count c1 = new Count();		// 객체 c1 생성
		System.out.println("count 출력이 될까요?" + c1.count);
		System.out.println("totalCount은 값은? : "+c1.totalCount++);
		Count c2 = new Count();
		System.out.println("count 출력이 될까요?" + c2.count);
		System.out.println("totalCount은 값은? : "+c2.totalCount++);
		System.out.println("잠깐, totaclCount 중간 점검 : " + Count.totalCount);
		Count c3 = new Count();
		System.out.println("count 출력이 될까요?" + c3.count);
		System.out.println("totalCount은 값은? : "+c3.totalCount++);
		
		System.out.println("최종 totalCount의 값 : " + Count.totalCount);
		System.out.println("객체 c1의 totalCount의 값 : " + c1.totalCount);
		System.out.println("객체 c2의 totalCount의 값 : " + c2.totalCount);
		System.out.println("객체 c3의 totalCount의 값 : " + c3.totalCount);
	}
}

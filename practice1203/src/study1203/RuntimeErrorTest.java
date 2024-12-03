package study1203;

public class RuntimeErrorTest {

	public static void main(String[] args) {
		int a = 0;
		int b = 10;
//		int c = b/a;		// java.lang.ArithmeticException: / by zero
		int c = a/b;
		System.out.println(c);
	}
}

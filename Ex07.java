
public class Ex07 {

	public static void main(String[] args) {
		// 메소드 오버로딩
		
		add(10, 2);
		add(10, 2.4);
		
		// 메소드 이름이 같아야함
		// 매개변수의 개수 또는 타입이 달라야함
		// 매개변수는 같고 리턴 타입이 다른 경우는 오버로딩이 아님
	}

	private static void add(int a, double b) {
		System.out.println(a+b);
	}

	public static void add(int a, int b) {
		System.out.println(a+b);
	}

}


public class Ex07 {

	public static void main(String[] args) {
		// �޼ҵ� �����ε�
		
		add(10, 2);
		add(10, 2.4);
		
		// �޼ҵ� �̸��� ���ƾ���
		// �Ű������� ���� �Ǵ� Ÿ���� �޶����
		// �Ű������� ���� ���� Ÿ���� �ٸ� ���� �����ε��� �ƴ�
	}

	private static void add(int a, double b) {
		System.out.println(a+b);
	}

	public static void add(int a, int b) {
		System.out.println(a+b);
	}

}

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int num2 = sc.nextInt();

		int abs = absNum(num1, num2);
		System.out.println("��� Ȯ�� : "+abs);
		sc.close();
	}
	public static int absNum(int num1, int num2) {
		int abs = 0;
		if (num1 >= num2) {
			abs = num1 - num2;
		} else {
			abs = num2 - num1;
		}
		return abs;
	}
}

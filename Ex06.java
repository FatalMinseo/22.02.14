import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		String getd = getD(num);
		int getds = getDs(num);
		System.out.println(num + "�� ����� �� : " + getds);
		System.out.println(num + "�� ��� : " + getd);
		sc.close();
	}

	public static int getDs(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

	public static String getD(int num) {
		String a = "";
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				a += i + " ";
			}
		}
		return a;
	}

}

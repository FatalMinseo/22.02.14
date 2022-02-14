import java.util.Scanner;

public class Ex03_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 입력한 수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 입력한 수 : ");
		int num2 = sc.nextInt();
		System.out.print("기준이 되는 수 : ");
		int normal = sc.nextInt();

		int close = closeNum(num1, num2, normal);
		System.out.println(normal + "에 더 가까운 수 : " + close);
		sc.close();
	}

	public static int closeNum(int num1, int num2, int normal) {
		int close1 = Math.abs(normal - num1);
		int close2 = Math.abs(normal - num2);
		if (close1 > close2) {
			return num2;
		} else if (close2 > close1) {
			return num1;
		} else {
			return 0;
		}
	}
}

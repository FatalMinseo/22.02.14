

import java.util.Scanner;

public class Ex02_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int max = maxNum(num1, num2);
		System.out.println(max);
		sc.close();
	}

	public static int maxNum(int num1, int num2) {
		int result = (num1 > num2) ? num1 : num2 == num1 ? 0 : num2;
		return result;
	}
}

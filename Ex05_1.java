import java.util.Arrays;
import java.util.Scanner;

public class Ex05_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		System.out.println("배열을 입력하세요.");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		arrToString(arr);
		sc.close();
	}
	private static void arrToString(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
}

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		System.out.println("배열을 입력하세요.");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		arrToString(arr);
		sc.close();
	}
	public static void arrToString(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

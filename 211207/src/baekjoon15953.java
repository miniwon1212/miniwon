import java.util.Scanner;

public class baekjoon15953 {
	public static void main(String[] args) {
		/*
		 * T로 횟수 받아와 a 1회 b 2회임 얘네도 받아와
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.println(one(a) + two(b));
		}
	}

	public static int one(int a) {
		if (a == 1)
			return 5000000;
		else if (a >= 2 && a <= 3)
			return 3000000;
		else if (a >= 4 && a <= 6)
			return 2000000;
		else if (a >= 7 && a <= 10)
			return 500000;
		else if (a >= 11 && a <= 15)
			return 300000;
		else if (a >= 16 && a <= 21)
			return 100000;
		else
			return 0;
	}

	public static int two(int b) {
		if (b == 1)
			return 5120000;
		else if (b >= 2 && b <= 3)
			return 2560000;
		else if (b >= 4 && b <= 7)
			return 1280000;
		else if (b >= 8 && b <= 15)
			return 640000;
		else if (b >= 16 && b <= 31)
			return 320000;
		else
			return 0;
	}
}
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		scan.close();

		for (int i = 1; i <= N; i++) {
			for(int b = N-1; b-i+1>0;b--) {
			System.out.printf(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}
}

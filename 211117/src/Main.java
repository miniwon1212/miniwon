import java.util.*;
// 2739¹ø
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		scan.close();
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", N, i, N*i);
		}
	}
}

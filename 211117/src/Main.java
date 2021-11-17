import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int X = scan.nextInt();

		
			
			for(int i =0; i < N; i++) {
			
			int A = scan.nextInt();

			if (A < X)
				System.out.printf("%d ",A);
		}
		scan.close();
	}
}
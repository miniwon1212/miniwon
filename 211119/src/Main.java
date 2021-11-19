import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int T = scan.nextInt();
		int [] arr = new int[T];
		int i =0;
		while (i < T) {
			int	A = scan.nextInt();
			int	B = scan.nextInt();
			
			arr[i++] = A+B;
		}
		i = 0;
		while (i < T) {System.out.printf("%d\n", arr[i]); i++;}
		scan.close();
	}
}

import java.util.*;

// 2884¹ø
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int H = scan.nextInt(); // 0 <= H <= 23
		int M = scan.nextInt(); // 0 <= M <= 59
		scan.close();
		
		if (M < 45) {	// 0 ~ 44
			if(H == 0) H = 24;
			H -= 1;
			M = M + 60 - 45;
		} else { // 45 ~ 59
			M -= 45;
		}
		System.out.println(H + " " + M);
	}
}
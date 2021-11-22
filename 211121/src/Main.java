import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int C = Integer.parseInt(bf.readLine());
		for (int k = 0; k < C; k++) {
			String[] N = bf.readLine().split(" ");

			int stu[] = new int[N.length];
			int sum = 0;

			for (int i = 0; i < N.length; i++) {
				stu[i] = Integer.parseInt(N[i]);

				if (i >= 1) {
					sum += stu[i];
				}
			}
			// stu[0] ÇÐ»ý ¼ö
			int score = stu[0];
			float avg = (float)sum / score; // Æò±Õ
			int r = 0;
			for (int j = 1; j < stu.length; j++) {
				if (stu[j] > avg) {
					r++;
				}
			}
			bw.write(String.format("%.3f", (float)r / score * 100)+"%\n");
		}
		bf.close();
		bw.flush();
		bw.close();
	}
}

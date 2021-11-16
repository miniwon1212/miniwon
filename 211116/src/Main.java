import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);

		//2753¹ø
		int y = Scan.nextInt();
		Scan.close();

		if (y % 4 == 0 && y % 100 == 0 || y % 400 == 0) {
			
				System.out.println(1);
			}else if(y % 4 == 0 && y % 100 != 0){
				System.out.println(1);
			}else 
		System.out.println(0);
		}
	
	/*
	 * if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
			
				System.out.println(1);
			}else 
		System.out.println(0);
		}
	 * */
}
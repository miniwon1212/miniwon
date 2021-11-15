import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/* 10869번 문제

		int A = scan.nextInt();
		int B = scan.nextInt();
		scan.close();
		
		System.out.println(A + B);
		System.out.println(A - B);
		System.out.println(A * B);
		System.out.println(A / B);
		System.out.println(A % B);
		*/
		/* 10430번 문제
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		scan.close();
		
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C)*(B%C))%C);
		*/
		
		/* 2588번 문제*/
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		scan.close();
		
		System.out.println(n1*(n2%10));
		System.out.println(n1*((n2%100)/10));
		System.out.println(n1*(n2/100));
		System.out.println(n1*n2);
	}
}

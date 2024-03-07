package Day1;
import java.util.Scanner;
public class Class {
	
		public static void main(String[] args) {
		
		Scanner sc;
		sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요:");
		int a = sc.nextInt();
		System.out.print("연산자를 입력하세요:");
		String result = sc.next();
		System.out.print("숫자를 입력하세요:");
		int b = sc.nextInt();

		switch (result) {
		case "+":
			System.out.println(a+b);
			break;
		case "-":
			System.out.println(a-b);
			break;
		case "*":
			System.out.println(a*b);
			break;
		case "/":
			System.out.println(a/b);
			break;
		default: System.out.println("잘못된 입력");
		}
	}
}
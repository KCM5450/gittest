package Day1;
import java.util.Scanner;
public class Practice {
			
			Scanner sc;
			sc = new Scanner(System.in);
			int a,b;
			String result;
			
		public Practice() {
			System.out.print("숫자를 입력하세요:");
			a = sc.nextInt();
		}
		public void Practice() {
			System.out.print("연산자를 입력하세요:");
			result = sc.next();
		}
		public void Practice() {
			System.out.print("숫자를 입력하세요:");
			b = sc.nextInt();
		}
		
		
		public void Practice() {
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
		public static void main(String[] args) {
			Practice pr = new Practice();
			
		}
	}
}

        //int a = sc.nextInt();

		//String result = sc.next();
	
		//int b = sc.nextInt();
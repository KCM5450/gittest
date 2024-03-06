package Day1;
import java.util.Scanner;
public class Hello {
	public static void main(String[] args) {

		Scanner sc;
		sc = new Scanner(System.in);
		char input;

//do while문 사용
		do {
			System.out.print("숫자를 입력하세요:");
			int a = sc.nextInt();
			System.out.print("연산자를 입력하세요:");
			String result = sc.next();
			System.out.print("숫자를 입력하세요:");
			int b = sc.nextInt();
// 사칙연산 계산기
			switch (result) {
			case "+":
				System.out.println(a + b);
				break;
			case "-":
				System.out.println(a - b);
				break;
			case "*":
				System.out.println(a * b);
				break;
			case "/":
				System.out.println(a / b);
				break;
			default:
				System.out.println("잘못된 입력");
				break;
			}

			// 결과 출력
			System.out.println("계속 하시겠습니까? (Y,y)");
			input = sc.next().charAt(0);

			switch (input) {
			case 'Y':
			case 'y':
				break;
			default:
				System.out.println("잘못된 입력");
				break;
			}
// or 조건
		} while (input == 'y' || input == 'Y');
	}
}

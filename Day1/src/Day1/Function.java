package Day1;
import java.util.Scanner;
public class Function {
	public static void main(String[] args) {
		String answer;
		
		do {
			int num1 = Function.inputNum1();
			char result = Function.inputOp();
			int num2 = Function.inputNum2();
			answer = Function.Output(num1, result, num2);
		} while (answer == 'y' || answer == 'Y');
	}
	
	// 입력 연산 출력
	
	public static String Output(int num1, char result, int num2) {
		if (result == '+') {
			System.out.println(Function.add(num1, num2));
		} else if (result == '-') {
			System.out.println(Function.minus(num1, num2));
		} else if (result == '*') {
			System.out.println(Function.multiply(num1, num2));
		} else if (result == '/') {
			System.out.println(Function.divide(num1, num2));
		} else {
			System.out.println("잘못된 입력");
		}
		System.out.print("계속 하시겠습니까?(y/Y)>");
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}

	public static int inputNum1() {
		System.out.print("숫자를 입력하세요:");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	public static int inputNum2() {
		System.out.print("숫자를 입력하세요:");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	// int 형식은 sc를 Int로

	public static char inputOp() {
		System.out.print("연산자를 입력하세요:");
		Scanner sc = new Scanner(System.in);
		return sc.next().charAt(0);
	}
	// 연산자가 string 형태이므로 sc.next()를 charAt(0) 지정된걸로

	public static int add(int num1, int num2) {
		return num1 + num2;
	}

	public static int minus(int num1, int num2) {
		return num1 - num2;
	}

	public static int multiply(int num1, int num2) {
		return num1 * num2;
	}

	public static double divide(int num1, int num2) {
		return (double) num1 / (double) num2;
	}
}
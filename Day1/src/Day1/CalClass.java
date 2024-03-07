package Day1;

import java.util.Scanner;

public class CalClass {
	// 변수선언
	private int num1, num2;
	private char ch;
	private double result;
	private char ans;

	public CalClass() {

	}

	public CalClass(int n1, String c, int n2) {
		num1 = n1;
		ch = c.charAt(0);
		num2 = n2;
	}

	public void setNum1(int n) {
		num1 = n;
	}

	public void setNum2(int n) {
		num2 = n;
	}

	public void setCh(char c) {
		ch = c;
	}

	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}

	public char getCh() {
		return ch;
	}

	public double plus(int n1, int n2) {
		return result = n1 + n2;
	}

	public double minus(int n1, int n2) {
		return result = n1 - n2;
	}

	public double multiply(int n1, int n2) {
		return result = n1 * n2;
	}

	public double divide(int n1, int n2) {
		return result = (double) n1 / n2;
	}
// 나눗셈을 위한 double
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		char ch = sc.next().charAt(0);
		int num2 = sc.nextInt();

		CalClass calc = new CalClass(num, Character.toString(ch), num2);
// 사칙연산 switch 문 재구성
		
		switch (ch) {
		case '+':
			System.out.println(num + " + " + num2 + " = " + calc.plus(num, num2));
			break;
		case '-':
			System.out.println(num + " - " + num2 + " = " + calc.minus(num, num2));
			break;
		case '*':
			System.out.println(num + " * " + num2 + " = " + calc.multiply(num, num2));
			break;
		case '/':
			System.out.println(num + " / " + num2 + " = " + calc.divide(num, num2));
			break;
		default:
			System.out.println("잘못된 입력");
		}
	}
}

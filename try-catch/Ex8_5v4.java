package jch09;

import java.util.Scanner;

public class Ex8_5v4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("1.숫자를 입력하세요");
		int num1 = scan.nextInt();
		System.out.printf("2.숫자를 입력하세요");
		int num2 = scan.nextInt();
		
		try {
			int result = num1 / num2;
			System.out.println(num1+"/"+num2+"="+num1/num2);
		} catch (ArithmeticException ae) {
			System.out.println("3.0으로 나눌 수 없음");
			ae.printStackTrace();
			ae.getMessage();
			System.out.println(num1+"/"+num2+"="+0);
		}
	}
}

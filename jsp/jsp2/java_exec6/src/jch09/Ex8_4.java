package jch09;

public class Ex8_4 {

	public static void main(String[] args) {
		System.out.println(1 + " try블럭문 전");
		System.out.println(2 + " try블럭문 전");
		try {
			System.out.println(3);
			//System.out.println(0/0);
			System.out.println(4);
			System.out.println(0/0);
			System.out.println(5);// 실행되지 않는다.
		} catch (ArithmeticException e) {
			if (e instanceof ArithmeticException) System.out.println("true");
			System.out.println("ArithmeticException");
		} catch(Exception e){
			System.out.println("Exception");
		}// try-catch의 끝
		
		System.out.println(6);
	} //main 메서드 끝

}

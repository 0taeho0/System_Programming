package jch09;

public class Ex8_5v1 {

	public static void main(String[] args) {
		System.out.println(1 + " try블럭문 전");
		System.out.println(2 + " try블럭문 전");
		
		try {
			System.out.println(3);
			System.out.println(0/0); // 예외 발생
			System.out.println(4); // 실행되지 않는다.
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("예외Arimetic : " + ae.getMessage());
		} catch (RuntimeException ae) {
			ae.printStackTrace();
			System.out.println("예외Runtime : " + ae.getMessage());
		} catch (Exception ae) {
			ae.printStackTrace();
			System.out.println("예외Exception : " + ae.getMessage());
		}// try-catch의 끝
		
		System.out.println(6);
	} //main 메서드 끝

}

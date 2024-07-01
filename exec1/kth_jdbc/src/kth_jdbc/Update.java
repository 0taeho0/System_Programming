package kth_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Update {

	public static void main(String[] args) throws Exception {
		// 1. 드라이버 객체 로드
		Class.forName("oracle.jdbc.OracleDriver");
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection con = DriverManager.getConnection(url, "sw212", "1234");
		
		// 2. 연결객체 객체 생성
		String Query = 
				  "Update pc_menu"
				+ " set menu_price =  ? " 
				+ " where menu_no = ? ";
		PreparedStatement pstst = con.prepareStatement(Query);
		
		// 3. 준비상태 객체 생성
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("수정할 메뉴번호를 선택하세요. > ");
		int menu_name = scan.nextInt();
		
		System.out.printf("수정할 금액을 입력하세요. > ");
		int price = scan.nextInt();
		
		pstst.setInt(2, menu_name);
		pstst.setInt(1, price);
		
		// 발사버튼
		pstst.executeUpdate();
	}

}

package kth_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class CreatePreEmp {

	public static void main(String[] args) throws Exception {
		// 1. 드라이버 로드
		Class.forName("oracle.jdbc.OracleDriver");
		
		// 2. 연결 객체 생성
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection con = DriverManager.getConnection(url, "sw212", "1234");
		
		// 3. 준비상태 객체 생성
		String sql = "insert into PC_EMP value(?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("사원추가 페이지입니다.");
		System.out.print("사원명(name)? > ");
		
		pstmt.setInt(1, 5);
		
		pstmt.setString(2, scan.next());
		
		pstmt.setString(3, "slave");
	
		System.out.print("생년월일(birth-YYYYMMDD)? > ");
		pstmt.setString(4, scan.next());
		
		System.out.print("연락처(tel)? > ");
		pstmt.setInt(5, scan.nextInt());
		
		System.out.print("주소(address)? > ");
		pstmt.setString(6, scan.next());
		
		pstmt.setInt(7, 100);
		
		
		
		// 4. 발사버튼
		System.out.println(pstmt.executeUpdate());
	}
}

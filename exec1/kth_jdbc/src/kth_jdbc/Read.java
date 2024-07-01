	package kth_jdbc;
	
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;
	
	public class Read {
		public static void main(String[] args) throws Exception {
			
			// 드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");
			
			// Connection 객체 만들기
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection con = DriverManager.getConnection(url, "sw212", "1234");
			
			// Statement 객체 만들기
			Statement st = con.createStatement();
			
			// ResultSet 객체 만들기
			ResultSet rs = st.executeQuery("select * from pc_emp");
			System.out.print("emp_no\tname\tjob\t   birth\ttel\taddress\tsal");
			while(rs.next()) {
				String emp_no = rs.getString("emp_no");
				String name = rs.getString("name");
				String job = rs.getString("job");
				String birth = rs.getString("birth");
				String tel = rs.getString("tel");
				String address = rs.getString("address");
				String sal = rs.getString("sal");
				
				System.out.printf("  %s \t%s   %s \t %s  %s %s %s \n", 
						emp_no, name, job, birth, tel, address, sal);
			}
		}
	}

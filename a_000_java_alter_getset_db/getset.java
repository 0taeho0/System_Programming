package a_000_java_after_getset_db;

import java.sql.*;
import java.util.Scanner;

class People {
   private int hakbun;
   private int kor;
   private int eng;
   private int math;
   private int sum;
   private double avg;
   private int rank;
   

   public int cnt;

   public int getHakbun() {
      return hakbun;
   }
   public void setHakbun(int hakbun) {
      this.hakbun = hakbun;
   }

   public int getKor() {
      return kor;
   }
   public void setKor(int kor) {
      this.kor = kor;
   }

   public int getEng() {
      return eng;
   }
   public void setEng(int eng) {
      this.eng = eng;
   }

   public int getMath() {
      return math;
   }
   public void setMath(int math) {
      this.math = math;
   }

   public int getSum() {
      return getKor() + getEng() + getMath();
   }
   public void setSum(int sum) {
      this.sum = sum;
   }

   public double getAvg() {
      return (double)getSum() / 3;
   }
   public void setAvg(double avg) {
      this.avg = avg;
   }
   
   public void setRank(int rank) {
      this.rank = rank;
   }
   
   void printScore() {
      System.out.printf("%3d %6d %3d %3d %3d %3df %3.1f %3d \n", 
                  cnt, hakbun, kor, eng, math, getSum(), getAvg(), rank);
   }
}

public class S21211GetSet_insert {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
      
      System.out.print("몇 명 성적처리를 하나요?(숫자입력)? ");
      int num = sc.nextInt();
      
      People stu[] = new People[num];
      
      for(int i = 0; i < stu.length; i++) {
         stu[i] = new People();   //매우중요!!!!!
         
         System.out.print("학번을 입력하세요 : ");
         stu[i].setHakbun(sc.nextInt());
         
         System.out.print("국어 점수를 입력하세요 : ");
         stu[i].setKor(sc.nextInt());
         
         System.out.print("영어 점수를 입력하세요 : ");
         stu[i].setEng(sc.nextInt());
         
         System.out.print("수학 점수를 입력하세요 : ");
         stu[i].setMath(sc.nextInt());
      }
      //석차 부여합시다. 총점 기준
      //총점이 같을 경우는 같은 등수, 차 등수는 같은 등수를 반영하여 적용한다.
      for(int i = 0; i < stu.length; i++) {
         int rank = 1;
         for(int j = 0; j < stu.length; j++) {
            if(stu[i].getSum() < stu[j].getSum()) rank++;
         }
         stu[i].setRank(rank);
      }
      //콘솔에 출력
      System.out.println("=======================출력=======================");
      System.out.printf("  NO  학번 국어 영어 수학 합계	평균	석차 \n");
      System.out.println("=================================================");
      for(int i=0; i<stu.length; i++) {
    	  stu[i].cnt = i+1;
    	  stu[i].printScore();
      }
      //db 연결 후 입력된 자료 등록
      Connection conn = null;
      PreparedStatement pstmt = null;
      String sql;
      
      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      String id = "system";
      String pw = "1234";
      
      try {
         Class.forName("oracle.jdbc.OracleDriver");
         System.out.println("클래스 로딩 성공");
         conn = DriverManager.getConnection(url, id, pw);
         System.out.println("DB접속 성공");
         
      } catch(Exception e) {
         e.printStackTrace();
      }
   }
}

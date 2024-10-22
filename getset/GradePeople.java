package s21211_test5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class People {
	private String name; // 성명
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;
	private int rank;
	
	void setName(String name) {this.name = name;}
	void setKor(int kor) {this.kor = kor;}
	void setEng(int eng) {this.eng = eng;}
	void setMath(int math) {this.math = math;}
	void setSum(int sum) {this.sum = sum;}
	void setAvg(double avg) {this.avg = avg;}
	void setRank(int rank) {this.rank = rank;}
	
	String getName() {return name;}
	int getKor() {return kor;}
	int getEng() {return eng;}
	int getMath() {return math;}
	int getSum() {return this.getEng() + this.getKor() + this.getMath();}
	double getAvg() {return (double)this.getSum() / 3;}
	int getRank() {return rank;}
	
	void printScore() {
		System.out.printf("%3s %3d %3d %3d %3d %d %3.2f %3d\n",
				this.getName(), this.getKor(), this.getMath(), this.getEng(), this.getSum(), 
				this.getAvg(), this.getRank());
	}
	
}

public class GradePeople {
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("몇명의 성적처리를 하나요(숫자입력)?");
		
		// 객체베열 선언(성적 처리 인원)
		People stu[] = new People[Integer.parseInt(bf.readLine())];
		
	}

}

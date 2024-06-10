package test000;

import java.util.Scanner;

public class Random {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 0.0~1.0 사이의 실수 난수 구하기
		int lucknum = 0; //좋아하는 숫자 넣을 변수
		int num = 0;
		int [] arrnum = new int[100];
		int [] arrok = new int[6];
		int t = 0;
		int temp = 0;
		int count = 0;
		
	    for(;true;) {
	    	System.out.println("좋아하는 숫자를 입력하세요(1~9)");
	    	lucknum = scan.nextInt();
	    	if(lucknum >= 1 && lucknum <= 9) {
	    		break;
	    	}else {
	    		System.out.println("다시 입력하세요");
	    		continue;
	    	}
	    }
	    num_output(arrnum, arrok, num, lucknum);
	    
	    while(true) {
	    	int a = numdel(arrok, t);
	    	
	    	if(a == 0) 
	    		break;
	    	else {
	    		num_output(arrnum, arrok, num, lucknum);
	    		numdel(arrok, t);
	    		continue;
	    	}
	    }
	    System.out.println();
	    for(int i=1; i<arrok.length; i++) {
			for(int j=0; j<arrok.length-i; j++) {
				if(arrok[j] > arrok[j+1]) {
					temp = arrok[j+1];
					arrok[j+1] = arrok[j];
					arrok[j] = temp;
				}
			}
		}
	    System.out.print("로또 번호 : ");
		for(int i=0; i<arrok.length; i++) {
			System.out.print(arrok[i] + " ");
		}
		System.out.println();
		number_output(arrnum, count);
	}
	
	private static void number_output(int [] arrnum, int count) {
		for(int i=1; i<46; i++) {
			count=0;
			for(int j=0; j<arrnum.length; j++) {
				if(i==arrnum[j]) {
					count += 1;
				}
			}
			System.out.printf("%d의 갯수는 %d \n", i, count);
			
		}
		
	}

	private static void num_output(int [] arrnum, int [] arrok, int num, int lucknum) {
		for(int i=0; i<=arrnum.length-1; i++) {
	    	arrnum[i] = (int) (Math.random() * 45) + 1;
	    }
	    
	    
	    for(int i = lucknum + 1; i < arrnum.length; i++) {
	    	arrok[num] = arrnum[i];
	    	num++;
	    	if(num == 6)
	    		break;
	    }
	}

	private static int numdel(int [] arrok, int t) {
		t = 0;
		for(int i=0; i<arrok.length; i++) {
	    	for(int j=0; j<arrok.length; j++) {
	    		if(i != j) {
	    			if(arrok[i] != arrok[j]) {
	    				
	    			} else {
	    				t = 1;
	    			}
	    		}else {
	    			continue;
	    		}
	    	}
	    }
		return t;
	}
	
}

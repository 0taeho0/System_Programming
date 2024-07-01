package sungil212;
import java.util.*;
import java.io.*;

public class Baseball {
   public static int playGame() throws IOException{
      int x, y, z;
      
      x = (int) (Math.abs(Math.random() % 9) + 1);
      do {
         y = (int) (Math.abs(Math.random() % 9) + 1);
      } while(x == y);
      do {
         z = (int) (Math.abs(Math.random() % 9) + 1);
      }while((z==y) || (z==x));
      
      System.out.println(x+", "+y+", "+z);
      return playGame(x, y, z);
   }
   public static int playGame(int x, int y, int z) throws IOException{
      int count = 0;
      int strike, ball;
      int [] usr = new int[3];
      int [] com = {x, y, z};
      
      do {
         count++;
         do {
            System.out.println("\n 카운트 : " + count);
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String user;
            
            System.out.print("1번째 숫자: ");
            user = in.readLine();
            
            usr[0] = new Integer(user).intValue();
            System.out.print("2번째 숫자 : ");

            user = in.readLine();
            
            usr[1] = new Integer(user).intValue();
            System.out.print("3번째 숫자 : ");

            user = in.readLine();
            
            usr[2] = new Integer(user).intValue();
            if((usr[0] == 0) || (usr[1] == 0) ||  (usr[2] == 0)){
               System.out.println("0은 다시 입력해주세요");      
            }else if((usr[0] > 9) || (usr[1] > 9) || (usr[2] > 9)){
               System.out.println("1~9 사이 숫자 중 하나 다시 입력해주세요.");
            }else if((usr[0] == usr[1]) || (usr[1] == usr[2]) || (usr[0] == usr[2])){
               System.out.println("모두 다른 숫자를 입력해주세요");
            }   
         }while((usr[0] == 0) || (usr[1] == 0) ||  (usr[2] == 0) 
            || (usr[0] > 9) || (usr[1] > 9) || (usr[2] > 9) 
            || (usr[0] == usr[1]) || (usr[1] == usr[2]) || (usr[0] == usr[2]));
         
         		 ball = strike = 0;
         
         		 if (usr[0] == com[0]) strike++;
                 if (usr[1] == com[1]) strike++;
                 if (usr[2] == com[2]) strike++;
                 if (usr[0] == com[1]) ball++;
                 if (usr[0] == com[2]) ball++;
                 if (usr[1] == com[0]) ball++;
                 if (usr[1] == com[2]) ball++;
                 if (usr[2] == com[0]) ball++;
                 if (usr[2] == com[1]) ball++;
         
         System.out.println("Strike: "+strike+"Ball"+ball);
      }while((strike < 3) && (ball < 11));
      
      return count;
    }
   public static void main(String[] args) throws IOException{
   int result;

      if(args.length == 3){
         int x = Integer.valueOf(args[0]).intValue();
         int y = Integer.valueOf(args[1]).intValue();
         int z = Integer.valueOf(args[2]).intValue();
      
         result = playGame(x, y, z);
      } else {
          result = playGame();
      }
      System.out.println();
      
      if(result <= 2) {
	         System.out.println("참 잘했어요!");
	      } else if(result <= 5) {
	         System.out.println("잘했어요");
	      } else if(result <= 9) {
	         System.out.println("보통이네요!");
	      } else {
	         System.out.println("분발하세요!");
		}
   }
}
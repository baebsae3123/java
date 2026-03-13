// (실습과제 2-2 입력받기) 키보드로부터 입력받기


package defaultPack;

import java.util.Random;
import java.util.Scanner;

public class main7{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int map = 20;
		int zombie1 = 7;
		int zombie2 = 15;
		int human = 1;
	
		
		System.out.println("1~3 움직이세요 / 1 : 왼쪽 2 : 오른쪽 3 : 점프+랜덤 오른쪽");
		
		int move = sc.nextInt();
		while(true) {
			//좀비 랜덤 이동
			int zombiebox = random.nextInt(2+1);
			
			if(zombiebox==1){
				++zombie1;
			}
			
			else if(zombiebox==2){
				--zombie1;
			}
		    zombiebox = random.nextInt(2+1);
		    
			if(zombiebox==1){
				++zombie2;
			}
			else if(zombiebox==2){
				--zombie2;
			}
			// 잡힘
			if(human == zombie1) {
				System.out.println("좀비한테 잡혔습니다");
				break;

			}
			if(human == zombie2) {
				System.out.println("좀비한테 잡혔습니다");
				break;
			}
			// 엔딩
			if(human >= 20) {
				System.out.println("미션클리어");
				break;
			}
			

			// 주인공 무빙
			if(move==1) {
				
				++human;
				System.out.println("왼쪽으로 움직였습니다. 현재 위치는 "+ human +" 입니다.");
				System.out.println("좀비1 현재 위치는 "+ zombie1 +" 입니다.");
				System.out.println("좀비2 현재 위치는 "+ zombie2 +" 입니다.");
	
				move = sc.nextInt();
	
	
			} if(move==2) {
				--human;
				System.out.println("오른쪽으로 움직였습니다. 현재 위치는 "+ human +" 입니다.");
				System.out.println("좀비1 현재 위치는 "+ zombie1 +" 입니다.");
				System.out.println("좀비2 현재 위치는 "+ zombie2 +" 입니다.");
				
				move = sc.nextInt();
	
				
			}if(move==3){
				human += random.nextInt(3)+1;
				System.out.println("점프했습니다. 현재 위치는 "+human +" 입니다.");
				System.out.println("좀비1 현재 위치는 "+ zombie1 +" 입니다.");
				System.out.println("좀비2 현재 위치는 "+ zombie2 +" 입니다.");
				
				move = sc.nextInt();
	
			}
	
			

		}
	}
}
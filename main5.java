// (실습과제 2-2 입력받기) 키보드로부터 입력받기


package defaultPack;

import java.util.Random;
import java.util.Scanner;

public class main5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int human = 1; //시작위치
		
		System.out.println("1~3 움직이세요 / 1 : 왼쪽 2 : 오른쪽 3 : 점프+랜덤 오른쪽");
		int move = sc.nextInt();
		
		if(move==1) {
			System.out.println("왼쪽으로 움직였습니다. 현재 위치는 00 입니다.");
		}else if(move==2) {
			System.out.println("오른쪽으로 움직였습니다. 현재 위치는 00 입니다.");
		}else {
			System.out.println("랜덤하게 오른쪽으로 1~3움직임");
			System.out.println("점프했습니다. 현재 위치는 00 입니다.");
		}
	}
}
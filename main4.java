// (실습과제 2-2 입력받기) 키보드로부터 입력받기


package defaultPack;

import java.util.Random;

public class main4{
	public static void main(String[] args) {
		int sum;
		float avg;
		
		int year = 20060323;
		int cm = 173;
		
		
		Random random = new Random();
		
		int LuckBox1 = random.nextInt(6+1);
		int LuckBox2 = random.nextInt(6+1);
		
		if(LuckBox1 > LuckBox2) {
			System.out.println("손오공(입력) 던진 주사위 숫자는" + LuckBox1);
			System.out.println("저팔계(입력) 던진 주사위 숫자는" + LuckBox2);
			System.out.println("이긴사람은 손오공");

		}else if(LuckBox2 < LuckBox1) {
			System.out.println("손오공(입력) 던진 주사위 숫자는" + LuckBox1);
			System.out.println("저팔계(입력) 던진 주사위 숫자는" + LuckBox2);
			System.out.println("이긴사람은 저팔계");
		}else {
			System.out.println("비겼어요");
		}

	}
}
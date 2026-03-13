// (실습과제 2-2 입력받기) 키보드로부터 입력받기


package defaultPack;

import java.util.Random;

public class main3{
	public static void main(String[] args) {
		int sum;
		float avg;
		
		int year = 20060323;
		int cm = 173;
		
		
		Random random = new Random();
		
		int LuckBox1 = random.nextInt(6);
		int LuckBox2 = random.nextInt(6);
		
		sum = LuckBox1 + LuckBox2;
		avg = sum / 2;
		
		System.out.println(sum);
		System.out.println(avg);
	}
}
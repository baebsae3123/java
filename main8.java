// (실습과제 2-2 입력받기) 키보드로부터 입력받기


package defaultPack;

import java.util.Random;
import java.util.Scanner;

public class main8{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int magicguy = 100; //시작위치
		int swordguy = 200;
		
		
		System.out.println("공격할려면 ⚔️1을 입력하세요");
		int a = sc.nextInt();
		int Magicattack = random.nextInt(15,25)+1;
		int Swordattack = random.nextInt(5,15)+1;
		while(true) {
			if(magicguy < 0) {
				System.out.println("🪄마법사가 이겼습니다.");
				break;
			}if(swordguy < 0) {
				System.out.println("⚔️전사가 이겼습니다.");
				break;
			}
			if(a == 1) {
			magicguy = magicguy - Swordattack;
			swordguy = swordguy - Magicattack;
			System.out.println("마법사 대미지 "+ Magicattack);
			System.out.println("전사 대미지 "+ Swordattack);
			a = sc.nextInt();
			 Magicattack = random.nextInt(15,25)+1;
			 Swordattack = random.nextInt(5,15)+1;
		}

		}
	}
}
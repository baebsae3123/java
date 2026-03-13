// (실습과제 2-2 입력받기) 키보드로부터 입력받기


package defaultPack;

import java.util.Random;
import java.util.Scanner;

public class main6{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int human = 1; //시작위치
		int robot = random.nextInt(3+1);
		int a = 1;
		
		System.out.println("1 가위 2 묵 3 보 ");
		human = sc.nextInt();
		
		// 인간 버전
		while(a==1) {
		if(human == 1 && robot == 3) {
		System.out.println("나는 가위, 컴퓨터는 보를 냈습니다. 내가 이겼습니다.");
		robot = random.nextInt(3+1);
		human = sc.nextInt();

		}
		else if(human == 2 && robot == 1) {
		System.out.println("나는 묵, 컴퓨터는 가위를 냈습니다. 내가 이겼습니다.");
		robot = random.nextInt(3+1);
		human = sc.nextInt();

		}
		else if(human == 3 && robot == 2) {
		System.out.println("나는 보, 컴퓨터는 묵를 냈습니다. 내가 이겼습니다.");
		robot = random.nextInt(3+1);
		human = sc.nextInt();

		}
		// 컴퓨터 버전
		else if(human == 1 && robot == 2) {
			System.out.println("나는 가위, 컴퓨터는 묵를 냈습니다. 컴퓨터가 이겼습니다.");
			robot = random.nextInt(3+1);

			human = sc.nextInt();

		}
		else if(human == 2 && robot == 3) {
			System.out.println("나는 묵, 컴퓨터는 보를 냈습니다. 컴퓨터가 이겼습니다.");
			robot = random.nextInt(3+1);

			human = sc.nextInt();

		}
		else if(human == 3 && robot == 1) {
			System.out.println("나는 보, 컴퓨터는 묵를 냈습니다. 컴퓨터가 이겼습니다.");
			robot = random.nextInt(3+1);

			human = sc.nextInt();

		}
		else {
			System.out.println("비겼습니다");
			robot = random.nextInt(3+1);

			human = sc.nextInt();
			}
		}

	}
}
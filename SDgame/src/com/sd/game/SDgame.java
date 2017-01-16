package com.sd.game;

import java.util.Scanner;

public class SDgame {
	public static void main(String args[]) {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			int res[] = new int[2];
			int select[] = new int[4];
			int score[] = new int[2];

			for (int i = 0; i < 5; i++) {
				select[1] = ((int) (Math.random() * 10) + 1);
				select[3] = ((int) (Math.random() * 10) + 1);
				System.out.println(i + 1 + "라운드 !\n");

				System.out.print("A의 숫자를 입력하세요.");
				select[0] = scanner.nextInt();
				if (select[0] < 1 || select[0] > 10) {
					System.out.print("잘못 입력하셨습니다. A 숫자를 다시 입력하세요 ! \n");
					i = i - 1;
					continue;
				}
				
				System.out.print("B의 숫자를 입력하세요. ");
				while (true) {
					select[2] = scanner.nextInt();
					if (select[2] < 1 || select[2] > 10) {
						System.out.print("잘못 입력하셨습니다. B 숫자를 다시 입력하세요 ! \n");
						continue;
					} else break;} // b입력 오류 검사
				
				System.out.print("A의 첫 번째 패 숫자 = " + select[0] + "     ");
				System.out.println("A의 랜덤 패 숫자= " + select[1]);
				System.out.print("B의 첫 번째 패 숫자 = " + select[2] + "     ");
				System.out.println("B의 랜덤 패 숫자 = " + select[3]);

				for (int j = 0; j < 2; j++) {
					if (select[j] == 3 & select[j + 1] == 8 || select[j] == 8 & select[j + 1] == 3) {
						System.out.println("38광땡!!!!!");
						res[j] = 21;
					} else if (select[j] == select[j + 1]) {
						System.out.println(select[j + 1] + "땡");
						res[j] = 10 + select[j + 1];
					} else {
						res[j] = select[j] + select[j + 1];
						if (res[j] > 10) {
							res[j] = res[j] - 10;}
						System.out.println(res[j] + "끗");}
					}//족보 a,b for

				if (res[0] > res[1])
					score[0]++;
				if (res[0] < res[1])
					score[1]++;
				if (res[0] == res[1]) {
					score[0]++;
					score[1]++;}

				if (res[0] > res[1])
					System.out.println("************ A 승리 ************\n");
				if (res[0] < res[1])
					System.out.println("************ B 승리 ************\n");
				if (res[0] == res[1])
					System.out.println("************ A와 B 무승부 ************\n");
			} // 5판 for문

			if (score[0] > score[1])
				System.out.println("************ A님 축하합니다. 승리 하셨습니다 ************");
			else if (score[0] < score[1])
				System.out.println("************ B님 축하합니다. 승리 하셨습니다 ************");
			else if (score[0] == score[1])
				System.out.println("************ 아쉽네요. 무승부입니다. ************");

			System.out.println("계속하시겠습니까? (y/n)");
			scanner.nextLine();
			if (scanner.nextLine().equals("n")) {
				System.out.println("게임이 종료 되었습니다.");
				break;}
		}//while 무한루프
	}//main
}//class
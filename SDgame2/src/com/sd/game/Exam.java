package com.sd.game;

import java.util.Scanner;

public class Exam {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);	
		int res1,res2;
		while (true) {
			SDgame player1 = new SDgame();
			SDgame player2 = new SDgame();	
			System.out.println("1 플레이어 이름을 입력하세요.");
			player1.name = scanner.nextLine();
			System.out.println("2 플레이어 이름을 입력하세요.");
			player2.name = scanner.nextLine();
	
			for(int i=0;i<5;i++){
				
			System.out.print("\n"+player1.name + "님 숫자를 입력하세요.");
			player1.input();
			while (true) {
				player1.select = scanner.nextInt();
				if (player1.select < 1 || player1.select > 10) {
					System.out.print("잘못 입력하셨습니다. 숫자를 다시 입력하세요 ! \n");
					continue;
				} else
					break;}
			
			System.out.print(player2.name + "님 숫자를 입력하세요.");
			player2.input();
			while (true) {
				player2.select = scanner.nextInt();
				if (player2.select < 1 || player2.select > 10) {
					System.out.print("잘못 입력하셨습니다. 숫자를 다시 입력하세요 ! \n");
					continue;
				} else
					break;}
			
			System.out.print("\n"+player1.name + "의 첫 번째 패 숫자 = " + player1.select + "     ");
			System.out.println(player1.name + "의 랜덤 패 숫자= " + player1.random);

			System.out.print(player2.name + "의 첫 번째 패 숫자 = " + player2.select + "     ");
			System.out.println(player2.name + "의 랜덤 패 숫자= " + player2.random);

			res1 = player1.solution();
			if (res1 >= 21) {
				System.out.println("\n"+player1.name + "님 38광땡!!!!!");
			} else if ( res1>10  )  {
				System.out.println("\n"+player1.name+ "님 " + player1.random + "땡");
			} else {
				System.out.println("\n"+player1.name+ "님 " + res1 + "끗");
			}
			
			res2 = player2.solution();
			if (res2 >= 21) {
				System.out.println(player2.name + "님 38광땡!!!!!");
			} else if ( res2>10) {
				System.out.println(player2.name+ "님 " + player2.random + "땡");
			} else {
				System.out.println(player2.name+ "님 " + res2 + "끗");
			}
			
			if(res1 > res2)
				System.out.println("************ "+ (i+1) +" 라운드 " + player1.name + "님이 승리 하셨습니다 ************");
			else if(res1 < res2)
				System.out.println("************ "+ (i+1) +" 라운드 " + player2.name + "님이 승리 하셨습니다 ************");
			else
				System.out.println("************************** "+ (i+1) +" 라운드 무승부 입니다. **************************");
			player1.compare(player2);
			 }// 5판 반복
		
		
			System.out.println(player1.name+" 님 최종  "+ player1.score + " 점 입니다." );
			System.out.println(player2.name+" 님 최종  "+ player2.score + " 점 입니다." );
			
			if (player1.score > player2.score)
				System.out.println("************" + player1.name + "님 축하합니다. 최종 승리 하셨습니다 ************");
			else if (player1.score < player2.score)
				System.out.println("************" + player2.name + "님 축하합니다. 최종 승리 하셨습니다 ************");
			else if (player1.score == player2.score)
				System.out.println("************************** 아쉽네요. 최종 무승부입니다. **************************");

			System.out.println("계속하시겠습니까? (y/n)");
			scanner.nextLine();
			if (scanner.nextLine().equals("n")) {
				System.out.println("게임이 종료 되었습니다.");
				break;}
		}//메인while
	}//main
}//class
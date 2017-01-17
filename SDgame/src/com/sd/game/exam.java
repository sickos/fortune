package com.sd.game;

import java.util.Scanner;

public class exam {
	public static void main(String args[]){
		while (true) {
		int score[] = new int[2];
		Scanner scanner = new Scanner(System.in);
		
		SDgame player1 =new SDgame();
		SDgame player2 = new SDgame();
		
		System.out.println("1 플레이어 이름을 입력하세요.");
		player1.name = scanner.nextLine();
		System.out.println("2 플레이어 이름을 입력하세요.");
		player2.name = scanner.nextLine();
		player1.input();
		player1.solution();
		player2.input();
		player2.solution();	
		player1.compare(player2);
		player2.compare(player1);
		 
		 if (player1.score > player2.score)
				System.out.println("************" +player1.name+"님 축하합니다. 승리 하셨습니다 ************");
			else if (player1.score <player2.score)
				System.out.println("************" +player2.name+"님 축하합니다. 승리 하셨습니다 ************");
			else if (player1.score == player2.score)
				System.out.println("************ 아쉽네요. 무승부입니다. ************");
	
			System.out.println("계속하시겠습니까? (y/n)");
			scanner.nextLine();
			if (scanner.nextLine().equals("n")) {
				System.out.println("게임이 종료 되었습니다.");
				break;}
		}
	}

}

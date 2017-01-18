package com.sd.game;

import java.util.Scanner;
import java.io.*;

public class Exam {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);	
		int res1,res2;
		int menu_input,back_input;
		
		SDgame.print_menu();
		menu_input=scanner.nextInt();
		
		while(true){
		switch(menu_input){
		case 1:
		while (true) {
			SDgame_child player1 = new SDgame_child();
			SDgame_child player2 = new SDgame_child();	
			System.out.println("1 플레이어 이름을 입력하세요.");
			player1.setName(scanner.nextLine());
			System.out.println("2 플레이어 이름을 입력하세요.");
			player2.setName(scanner.nextLine());
	
			for(int i=SDgame.currentRound; i<=SDgame.ROUND ;i++){
				
			System.out.print("\n"+player1.getName() + "님 숫자를 입력하세요.");
			player1.input();
			while (true) {
				player1.setSelect(scanner.nextInt());
				if (player1.getSelect() < 1 || player1.getSelect() > 10) {
					System.out.print("잘못 입력하셨습니다. 숫자를 다시 입력하세요 ! \n");
					continue;
				} else
					break;}
			
			System.out.print(player2.getName() + "님 숫자를 입력하세요.");
			player2.input();
			while (true) {
				player2.setSelect(scanner.nextInt());
				if (player2.getSelect() < 1 || player2.getSelect() > 10) {
					System.out.print("잘못 입력하셨습니다. 숫자를 다시 입력하세요 ! \n");
					continue;
				} else
					break;}
			
			System.out.print("\n"+player1.getName() + "의 첫 번째 패 숫자 = " + player1.getSelect() + "     ");
			System.out.println(player1.getName() + "의 랜덤 패 숫자= " + player1.getRandom());

			System.out.print(player2.getName() + "의 첫 번째 패 숫자 = " + player2.getSelect() + "     ");
			 System.out.println(player2.getName() + "의 랜덤 패 숫자= " + player2.getRandom());

			res1 = player1.solution();
			if (res1 >= 21) {
				System.out.println("\n"+player1.getName() + "님 38광땡!!!!!");
			} else if ( res1>10  )  {
				System.out.println("\n"+player1.getName()+ "님 " + player1.getRandom() + "땡");
			} else {
				System.out.println("\n"+player1.getName()+ "님 " + res1 + "끗");
			}
			
			res2 = player2.solution();
			if (res2 >= 21) {
				System.out.println(player2.getName() + "님 38광땡!!!!!");
			} else if ( res2>10) {
				System.out.println(player2.getName()+ "님 " + player2.getRandom() + "땡");
			} else {
				System.out.println(player2.getName()+ "님 " + res2 + "끗");
			}
			
			if(res1 > res2)
				System.out.println("************ "+ SDgame.currentRound+" 라운드 " + player1.getName()+ "님이 승리 하셨습니다 ************");
			else if(res1 < res2)
				System.out.println("************ "+ SDgame.currentRound +" 라운드 " + player2.getName() + "님이 승리 하셨습니다 ************");
			else
				System.out.println("******************* "+ SDgame.currentRound +" 라운드 무승부 입니다. *******************");
		
			SDgame.currentRound++;
			player1.compare(player2);
			System.out.println(player1.getName()+"님의 보유금액= " + player1.player_money);
			System.out.println(player2.getName()+"님의 보유금액= " + player2.player_money);
			 }// 5판 반복
		
		
			System.out.println(player1.getName()+" 님 최종  "+ player1.getScore() + " 점 입니다." );
			System.out.println(player2.getName()+" 님 최종  "+ player2.getScore() + " 점 입니다." );
		
			
			if (player1.getScore() > player2.getScore())
				System.out.println("************" + player1.getName() + "님 축하합니다. 최종 승리 하셨습니다 ************");
			else if (player1.getScore() < player2.getScore())
				System.out.println("************" + player2.getName() + "님 축하합니다. 최종 승리 하셨습니다 ************");
			else if (player1.getScore() == player2.getScore())
				System.out.println("************************** 아쉽네요. 최종 무승부입니다. **************************");

			System.out.println("계속하시겠습니까? (y/n)");
			scanner.nextLine();
			if (scanner.nextLine().equals("n")) {
				break;}
			else if(scanner.nextLine().equals("y"))
				continue;
		}//게임시작 while	
		case 2:
	
			
		case 3:
			break;
		}//switch문
		}//while 문
	}//main
	
	public static void pause() {
	    try {
	      System.in.read();
	    } catch (IOException e) { }
	  }
	
	

}//class
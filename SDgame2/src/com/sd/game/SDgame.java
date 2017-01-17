package com.sd.game;

import java.util.Scanner;

public class SDgame {
	int res;
	String name;
	int select;
	int random;
	int score;

	Scanner scanner = new Scanner(System.in);

	public SDgame() {
		name = " ";
		select = 0;
		random = 0;
		score=5;
	}

	void input() {
		random = ((int) (Math.random() * 10) + 1);
		System.out.print(name + "님 숫자를 입력하세요.");
		while (true) {
			select = scanner.nextInt();
			if (select < 1 || select > 10) {
				System.out.print("잘못 입력하셨습니다. A 숫자를 다시 입력하세요 ! \n");
				continue;
			} // A입력 오류 검사
			break;
		}
		System.out.print(name + "의 첫 번째 패 숫자 = " + select + "     ");
		System.out.println(name + "의 랜덤 패 숫자= " + random);

	}// input 메소드

	void solution() {
		if (select == 3 & random == 8 || select == 8 & random == 3) {
			System.out.println("38광땡!!!!!");
			res = 21;
		} else if (select == random) {
			System.out.println(random + "땡");
			res = 10 + random;
		} else {
			res = select + random;
			if (res > 10) {
				res = res - 10;
			}
			System.out.println(res + "끗");
		}
	}

	void compare(SDgame player){
		if (res > player.res)
			score++;
		if (res <  player.res)
			score--;
		if (res == player.res) 
			score =score;
	}
	}// class
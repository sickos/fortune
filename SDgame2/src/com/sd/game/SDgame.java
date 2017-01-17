package com.sd.game;
import java.util.Scanner;

public class SDgame {
	int res;
	String name;
	int select;
	int random;
	int score;
	
	public SDgame() {
		name = " ";
		select = 0;
		random = 0;
		score=5;
	}

	void input() {
	random = ((int) (Math.random() * 10) + 1);
	this.select = select;
	}	

	void solution() {
		if (select == 3 & random == 8 || select == 8 & random == 3) {
			res = 21;
		} else if (select == random) {
			res = 10 + random;
		} else {
			res = select + random;
			if (res > 10) {
				res = res - 10;
			}
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
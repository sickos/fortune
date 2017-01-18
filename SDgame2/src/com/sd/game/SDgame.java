package com.sd.game;

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
	}	

	int solution() {
		if (select == 3 & random == 8 || select == 8 & random == 3) 
			return 21;
	    else if (select == random) 
			return 10+random;
		else {
			if ( select+random >= 10) 
				return (select+random)-10;
			else
				return select+random;
			}
	}

	void compare(SDgame player){
		if (this.solution() > player.solution()){
			this.score ++;
			player.score --;}
		else if (this.solution() <  player.solution()){
			player.score ++;
			this. score --;}
	}
}// class
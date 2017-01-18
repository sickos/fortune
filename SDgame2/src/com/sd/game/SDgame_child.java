package com.sd.game;

public class SDgame_child extends SDgame {

	void compare(SDgame player){
		if (this.solution() > player.solution()){
			this.setScore(this.getScore()+1);
			player.setScore(player.getScore()-1); 
			this.player_money += SDgame.MONEY  *2;
			player.player_money -= SDgame.MONEY ;
			}
		else if (this.solution() <  player.solution()){
			player.setScore(player.getScore()-1); 
			this.setScore(this.getScore()-1);
			player.player_money += SDgame.MONEY *2;
			this.player_money -= SDgame.MONEY ;
	}
	}
}

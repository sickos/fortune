package com.sd.game;

public class SDgame_child extends SDgame implements GameInterface {
	
	
	public void input() {
		setRandom(((int) (Math.random() * 10) + 1));
		}	
	
	void compare(SDgame player){
		if (this.solution() > player.solution()){
			this.setScore(this.getScore()+1);
			player.setScore(player.getScore()-1); 
			this.player_money += GameInterface.MONEY  *2;
			player.player_money -= GameInterface.MONEY ;
			}
		else if (this.solution() <  player.solution()){
			player.setScore(player.getScore()-1); 
			this.setScore(this.getScore()-1);
			player.player_money += GameInterface.MONEY *2;
			this.player_money -= GameInterface.MONEY ;
	}
	}
}

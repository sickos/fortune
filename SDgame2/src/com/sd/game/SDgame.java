package com.sd.game;

public class SDgame {
	private int res;
	private String name;
	private int select;
	private int random;
	private int score;
	static final int round = 5;
	static int money = 10000;
	int player_money;
	
	public int getRes() {
		return res;
	}

	public void setRes(int res) {
		this.res = res;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSelect() {
		return select;
	}

	public void setSelect(int select) {
		this.select = select;
	}

	public int getRandom() {
		return random;
	}

	public void setRandom(int random) {
		this.random = random;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public SDgame() {
		name = " ";
		select = 0;
		random = 0;
		score=5;
		player_money = 10000;
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
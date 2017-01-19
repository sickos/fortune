package com.sd.game;

public interface GameInterface {
	static final int ROUND = 5; // 총 라운드 수 불변
	static final int MONEY = 10000; // 기본 라운드금
	
	void input(); // random input 추상메소드
	
}

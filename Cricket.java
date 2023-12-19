package com.satya.collections;

public class Cricket {
	 Integer playerId;
	String playerName;
	int age;
	private String team;
	public Cricket(int playerId, String playerName, int age, String team) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.age = age;
		this.team = team;
	}
	
	@Override
	public String toString() {
		return "Cricket [playerId=" + playerId + ", playerName=" + playerName + ", age=" + age + ", team=" + team + "]";
	}

	public String getPlayerName() {
		// TODO Auto-generated method stub
		return playerName;
	}
	public Integer getAge() {
		// TODO Auto-generated method stub
		return age;
	}
	public int getPlayerId() {
		// TODO Auto-generated method stub
		return playerId;
	}
	public String getTeam() {
		// TODO Auto-generated method stub
		return team;
	}
	
	
	
	}
	




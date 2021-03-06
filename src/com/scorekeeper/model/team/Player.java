package com.scorekeeper.model.team;

public interface Player
{
	public String getName();
	public void setName(String name);
	public int getNumber();
	public void setNumber(int number);
	public void addCard(Card card);
	public void removeCard(Card card);
	public boolean inPenaltyBox();
	public void sendToPenaltyBox();
	public void releaseFromPenaltyBox();
	public boolean inPlay();
	public void putInPlay();
	public void removeFromPlay();
	public String getPlayTime();
	public void incrementPlayTime();
	public String getPenaltyTime();
	public void incrementPenaltyTime();
	public int getPlusMinus();
	public void incrementPlusMinus();
	public void decrementPlusMinus();
	public void showStats();
	public int getBlueCards();
	public int getYellowCards();
	public int getRedCards();
	public void cardPlayer(String time);
}

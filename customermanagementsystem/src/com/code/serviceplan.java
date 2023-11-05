package com.code;

public enum serviceplan {

GOLD(1000),PLATINUM(2000),DIAMOND(3000),SILVER(4000);
	private int cost;

	private serviceplan(int cost) {
		this.cost = cost;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
	
	
}

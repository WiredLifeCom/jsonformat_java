package com.wiredlife.jsonformatjava.model;

import java.util.List;

public class User {

	private String username;
	private List<Zone> zones;
	private Inventory inventory;

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Zone> getZones() {
		return this.zones;
	}

	public void setZones(List<Zone> zones) {
		this.zones = zones;
	}

	public Inventory getInventory() {
		return this.inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [username=");
		builder.append(this.username);
		builder.append(", zones=");
		builder.append(this.zones);
		builder.append(", inventory=");
		builder.append(this.inventory);
		builder.append("]");
		return builder.toString();
	}

}
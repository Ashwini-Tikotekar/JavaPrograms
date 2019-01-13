package com.bridgelabs.oopsprogram;

import java.util.ArrayList;
import java.util.List;

public class InventoryList {
	private String InventoryName;
	List<Inventory> inventorylist=new ArrayList<Inventory>();
	public String getInventoryName() {
		return InventoryName;
	}
	public void setInventoryName(String inventoryName) {
		InventoryName = inventoryName;
	}
	public List<Inventory> getInventorylist() {
		return inventorylist;
	}
	public void setInventorylist(List<Inventory> inventorylist) {
		this.inventorylist = inventorylist;
	}

}

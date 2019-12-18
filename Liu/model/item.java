package model;

import java.io.Serializable;

public class Item implements Serializable {
	private String itemCode;
	private String itemName;
	private String unit;
	private String bunrui;
	private int customer;
	private double price;

	public Item(String itemCode, String itemName, String unit, String bunrui, int customer, double prive) {
		this.setItemCode(itemCode);
		this.setItemName(itemName);
		this.setUnit(unit);
		this.setBunrui(bunrui);
		this.setCustomer(customer);
		this.setPrice(prive);
	}

	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getBunrui() {
		return bunrui;
	}
	public void setBunrui(String bunrui) {
		this.bunrui = bunrui;
	}

	public int getCustomer() {
		return customer;
	}
	public void setCustomer(int customer) {
		this.customer = customer;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}



}

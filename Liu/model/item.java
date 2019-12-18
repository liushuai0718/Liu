package model;

import java.io.Serializable;

public class item implements Serializable {
	private String itemCode;
	private String itemName;
	private String tani;
	private String bunrui;
	private int torihikiCode;
	private String torihikiName;
	private double tanka;

	public item(String itemCode, String itemName, String tani, String bunrui, int torihikiCode, String torihikiName, double tanka) {
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.tani = tani;
		this.bunrui = bunrui;
		this.torihikiCode = torihikiCode;
		this.torihikiName = torihikiName;
		this.tanka = tanka;
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
	public String getTani() {
		return tani;
	}
	public void setTani(String tani) {
		this.tani = tani;
	}
	public String getBunrui() {
		return bunrui;
	}
	public void setBunrui(String bunrui) {
		this.bunrui = bunrui;
	}
	public int getTorihikiCode() {
		return torihikiCode;
	}
	public void setTorihikiCode(int torihikiCode) {
		this.torihikiCode = torihikiCode;
	}
	public String getTorihikiName() {
		return torihikiName;
	}
	public void setTorihikiName(String torihikiName) {
		this.torihikiName = torihikiName;
	}
	public double getTanka() {
		return tanka;
	}
	public void setTanka(double tanka) {
		this.tanka = tanka;
	}





}

package model;

import java.io.Serializable;

public class Customer implements Serializable {
	private int customerCode;
	private String customerName;
	private String address;
	private String tel;
	private String tsuka;

	public Customer(int customerCode, String customerName, String address, String tel, String tsuka) {
		this.setCustomerCode(customerCode);
		this.setCustomerName(customerName);
		this.setAddress(address);
		this.setTel(tel);
		this.setTsuka(tsuka);
	}

	public int getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(int customerCode) {
		this.customerCode = customerCode;
	}


	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}


	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getTsuka() {
		return tsuka;
	}
	public void setTsuka(String tsuka) {
		this.tsuka = tsuka;
	}

}

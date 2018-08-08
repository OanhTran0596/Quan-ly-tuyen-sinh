package com.entity;

public class Address {
private String soNha;
private int ngo;
private String duong;
private String phuong;
private String quan;
private String thanhPho;
public String getSoNha() {
	return soNha;
}
public void setSoNha(String soNha) {
	this.soNha = soNha;
}
public int getNgo() {
	return ngo;
}
public void setNgo(int ngo) {
	this.ngo = ngo;
}
public String getDuong() {
	return duong;
}
public void setDuong(String duong) {
	this.duong = duong;
}
public String getPhuong() {
	return phuong;
}
public void setPhuong(String phuong) {
	this.phuong = phuong;
}
public String getQuan() {
	return quan;
}
public void setQuan(String quan) {
	this.quan = quan;
}
public String getThanhPho() {
	return thanhPho;
}
public void setThanhPho(String thanhPho) {
	this.thanhPho = thanhPho;
}
public Address(String soNha, int ngo, String duong, String phuong, String quan,
		String thanhPho) {
	super();
	this.soNha = soNha;
	this.ngo = ngo;
	this.duong = duong;
	this.phuong = phuong;
	this.quan = quan;
	this.thanhPho = thanhPho;
}
public Address() {
	super();
}
 
}

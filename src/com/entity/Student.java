package com.entity;

public class Student extends Person {
	private int kyHoc;
	private String lop;
	private int maHocSinh;

	public int getKyHoc() {
		return kyHoc;
	}

	public void setKyHoc(int kyHoc) {
		this.kyHoc = kyHoc;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public int getMaHocSinh() {
		return maHocSinh;
	}

	public void setMaHocSinh(int maSinhVien) {
		this.maHocSinh = maSinhVien;
	}

	public Student() {
		super();
	}

}

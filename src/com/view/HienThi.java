package com.view;

import java.util.List;

import com.entity.Address;
import com.entity.Student;
import com.inputData.ImpinputData;
import com.inputData.InputData;

public class HienThi implements ImpHienThi {
	ImpinputData inputData = new InputData();
	@Override
	public void ShowMenu() {
		System.out.println("1.Nhap vao day hoc sinh.");
		System.out.println("2.Hien thi thong tin.");
		System.out.println("3.Tim kiem hoc sinh theo nam.");
		System.out.println("4.Thoat.");

	}

	@Override
	public Student inputStudent(Student student) {
		Address address = new Address();
		student.setMaHocSinh(inputData.inputInt("Nhap vao ma hoc sinh:"));
		student.setLop(inputData.inputString("Nhap vao ten lop:"));
		student.setKyHoc(inputData.inputInt("Nhap vao ky hoc:"));
		student.setTen(inputData.inputString("Nhap vao ten:"));
		student.setTuoi(inputData.inputInt("Nhap vao tuoi:"));
		student.setNamSinh(inputData.inputInt("Nhap vao nam sinh:"));
		address.setSoNha(inputData.inputString("Nhap vao so nha:"));
		address.setNgo(inputData.inputInt("Nhap vao so ngo:"));
		address.setDuong(inputData.inputString("Nhap vao duong:"));
		address.setPhuong(inputData.inputString("Nhap vao phuong"));
		address.setQuan(inputData.inputString("Nhap vao quan:"));
		address.setThanhPho(inputData.inputString("Nhap vao thanh pho:"));
		student.setQueQuan(address);
		return student;
	}

	@Override
	public void displayStudent(Student student) {
		System.out.println("Ma hoc sinh:" + student.getMaHocSinh());
		System.out.println("Ten lop: " + student.getLop());
		System.out.println("Ky hoc: " + student.getKyHoc());
		System.out.println("Ten: " + student.getTen());
		System.out.println("Tuoi:" + student.getTuoi());
		System.out.println("Nam sinh: " + student.getNamSinh());
		System.out.println("Que quan");
		System.out.println("So nha:" + student.getQueQuan().getSoNha());
		System.out.println("Ngo:" + student.getQueQuan().getNgo());
		System.out.println("Duong:" + student.getQueQuan().getDuong());
		System.out.println("Phuong:" + student.getQueQuan().getPhuong());
		System.out.println("Quan:" + student.getQueQuan().getQuan());
		System.out.println("Thanh pho:" + student.getQueQuan().getThanhPho());
	}

	@Override
	public int enterSearchYearOfBirth() {
		int yearOfBirth = 0;
		yearOfBirth = inputData.inputInt("Nhap vao nam tim kiem");
		return yearOfBirth;
	}

	


}

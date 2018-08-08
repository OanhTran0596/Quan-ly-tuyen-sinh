package com.controller;

import java.util.ArrayList;

import com.entity.Student;
import com.inputData.ImpinputData;
import com.inputData.InputData;
import com.model.ImpThongTin;
import com.model.ThongTin;
import com.view.HienThi;
import com.view.ImpHienThi;

public class QuanLy {
	public static void main(String[] args) {
		ImpinputData inputData = new InputData();
		Student student = new Student();
		ThongTin thongTinModel = new ThongTin();
		ImpHienThi hienThiview = new HienThi();
		ArrayList<Student> listStudent = new ArrayList<Student>();
		int chose = 0;
		do {
			hienThiview.ShowMenu();
			chose = inputData.inputInt("Nhap vao lua chon");
			switch (chose) {
			case 1:
				listStudent = thongTinModel.InputStudents();

				break;
			case 2:
				listStudent = thongTinModel.DisplayStudents(listStudent);

				break;
			case 3:
				int yearOfBirth = 0;
				ArrayList<Student> arr = new ArrayList<Student>();
				yearOfBirth = hienThiview.enterSearchYearOfBirth();
				arr = thongTinModel.searchDateOfBirth(listStudent, yearOfBirth);
				thongTinModel.DisplayStudents(arr);
				System.out.println("So luong hoc sinh :" + thongTinModel.getCount());

				break;
			case 4:
				System.exit(0);

				break;

			default:
				System.out.println("Ban phai nhap tu 1- 4. Moi nhap lai!");
				break;
			}

		} while (chose != 0);

	}
}

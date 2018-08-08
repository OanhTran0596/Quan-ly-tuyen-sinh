package com.model;

import java.util.ArrayList;

import com.entity.Student;
import com.inputData.ImpinputData;
import com.inputData.InputData;
import com.view.HienThi;
import com.view.ImpHienThi;

public class ThongTin implements ImpThongTin {
	ImpHienThi view = new HienThi();
	ImpinputData inputData = new InputData();

	private int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public ArrayList<Student> InputStudents() {
		String check;
		ArrayList<Student> listStudent = new ArrayList<Student>();

		do {
			Student student = new Student();
			listStudent.add(view.inputStudent(student));
			check = inputData.inputString("Ban co muon tiep tuc khong? <y/n>");
		} while (check.equalsIgnoreCase("y"));

		return listStudent;
	}

	@Override
	public ArrayList<Student> DisplayStudents(ArrayList<Student> listStudents) {
		for (Student student : listStudents) {
			view.displayStudent(student);
		}
		return listStudents;
	}

	@Override
	public ArrayList<Student> searchDateOfBirth(
			ArrayList<Student> listStudents, int yearSearch) {
		int cout = 0;
		java.util.List<Student> listStudentss = new ArrayList<Student>();
		for (Student student : listStudents) {
			if (listStudents != null) {
				if (student.getNamSinh() == yearSearch) {
					listStudentss.add(student);
					if (student.getQueQuan().getThanhPho().equalsIgnoreCase("Ha Noi")) {
						cout++;
					}
				}
			}

			else {
				inputData.inputInt("List isn't null");
			}

		}
		this.setCount(cout);
		return (ArrayList<Student>) listStudentss;
	}

}

package com.view;

import java.util.List;

import com.entity.Student;

public interface ImpHienThi {
	void ShowMenu();

	Student inputStudent(Student student);

	void displayStudent(Student student);
	int enterSearchYearOfBirth();
	

}

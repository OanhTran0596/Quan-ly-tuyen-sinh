package com.model;

import java.util.ArrayList;

import com.entity.Student;

public interface ImpThongTin {
	ArrayList<Student> InputStudents();

	ArrayList<Student> DisplayStudents(ArrayList<Student> listStudents);

	ArrayList<Student> searchDateOfBirth(ArrayList<Student> listStudents,
			int yearSearch);
}

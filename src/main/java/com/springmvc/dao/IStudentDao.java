package com.springmvc.dao;

import java.util.List;

import com.springmvc.model.Student;

public interface IStudentDao {

	public List<Student> findAll();

	public int count();
}

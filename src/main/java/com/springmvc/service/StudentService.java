package com.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.dao.IStudentDao;
import com.springmvc.model.Student;

@Service
public class StudentService {

	@Autowired
	private IStudentDao dao;

	public List<Student> findAll() {

		return dao.findAll();
	}

	public int count() {

		return dao.count();
	}

}

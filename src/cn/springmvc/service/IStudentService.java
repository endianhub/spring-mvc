package cn.springmvc.service;

import java.util.List;

import cn.springmvc.model.Student;

public interface IStudentService {
	
	public List<Student> findAll();
	
	public int count();
}

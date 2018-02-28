package cn.springmvc.dao;

import java.util.List;

import cn.springmvc.model.Student;

public interface IStudentDao {

	public List<Student> findAll();
	
	public int count();
}

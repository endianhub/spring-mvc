package cn.springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.springmvc.dao.IStudentDao;
import cn.springmvc.model.Student;
import cn.springmvc.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentDao dao;
	
	@Override
	public List<Student> findAll() {
		
		
		return dao.findAll();
	}

	@Override
	public int count() {
		
		
		return dao.count();
	}

}

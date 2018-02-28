package cn.springmvc.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.springmvc.model.Student;
import cn.springmvc.service.IStudentService;

public class StudentTest {

	@Test
	public void count(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		IStudentService service = (IStudentService) ac.getBean("studentServiceImpl");
		int no = service.count();
		System.out.println(no);
	}
	
	
	@Test
	public void findAll(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		IStudentService service = (IStudentService) ac.getBean("studentServiceImpl");
		List<Student> list = service.findAll();
		for(Student stu : list){
			System.out.println(stu.getSid()+"===="+stu.getName());
		}
	}
}

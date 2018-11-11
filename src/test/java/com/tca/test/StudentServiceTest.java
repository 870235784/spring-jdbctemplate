package com.tca.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tca.beans.Student;
import com.tca.service.StudentServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring-config/spring-*.xml"})
public class StudentServiceTest {
	
	@Autowired
	private StudentServiceImpl studentService;
	
	@Test
	public void test01() {
		Student student = new Student("球大帅", 26, "male");
		studentService.insertStudent(student);
	}
	
}

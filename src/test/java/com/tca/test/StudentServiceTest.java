package com.tca.test;

import java.util.List;

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
	
	@Test
	public void test02() {
		int count = studentService.countBySname("Alba");
		System.out.println(count);
	}
	
	@Test
	public void test03() {
		List<String> names = studentService.queryAllNames();
		System.out.println(names);
	}
	
	@Test
	public void test04() {
		Student student = studentService.getStudentBySid(1);
		System.out.println(student);
	}
	
	@Test
	public void test05() {
		List<Student> students = studentService.getAllStudents();
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
}

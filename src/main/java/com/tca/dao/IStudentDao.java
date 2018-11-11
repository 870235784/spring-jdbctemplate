package com.tca.dao;

import java.util.List;

import com.tca.beans.Student;

public interface IStudentDao {
	/**
	 * 
	 * @param sname
	 * @return
	 */
	int countBySname(String sname);
	
	/**
	 * 
	 * @param student
	 * @return 
	 */
	int insertStudent(Student student);
	
	/**
	 * 
	 * @return
	 */
	List<String> queryAllNames();
	
	/**
	 * 
	 * @return
	 */
	Student getStudentBySid(int sid);
	
	/**
	 * 
	 * @return
	 */
	List<Student> getAllStudents();
}

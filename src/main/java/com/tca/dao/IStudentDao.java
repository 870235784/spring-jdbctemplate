package com.tca.dao;

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
}

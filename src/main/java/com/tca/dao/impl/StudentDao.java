package com.tca.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.tca.beans.Student;
import com.tca.dao.IStudentDao;

@Component
public class StudentDao implements IStudentDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int countBySname(String sname) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertStudent(Student student) {
		String sql = "insert into t_student (sname, sgender, sage) values (?, ?, ?)";
		return jdbcTemplate.update(sql, student.getSname(), student.getSgender(), student.getSage());
	}

}

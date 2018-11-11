package com.tca.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tca.beans.Student;

public class StudentRowMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setSid(rs.getInt("sid"));
		student.setSage(rs.getInt("sage"));
		student.setSgender(rs.getString("sgender"));
		student.setSname(rs.getString("sname"));
		return student;
	}

}

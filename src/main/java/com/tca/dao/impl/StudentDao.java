package com.tca.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.tca.beans.Student;
import com.tca.dao.IStudentDao;
import com.tca.rowmapper.StudentRowMapper;

@Component
public class StudentDao implements IStudentDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int countBySname(String sname) {
		// TODO Auto-generated method stub
		String sql = "select count(*) from t_student where sname = ?";
		return jdbcTemplate.queryForObject(sql, Integer.class, sname);
	}

	@Override
	public int insertStudent(Student student) {
		String sql = "insert into t_student (sname, sgender, sage) values (?, ?, ?)";
		return jdbcTemplate.update(sql, student.getSname(), student.getSgender(), student.getSage());
	}

	@Override
	public List<String> queryAllNames() {
		String sql = "select sname from t_student";
		return jdbcTemplate.queryForList(sql, String.class);
	}

	@Override
	public Student getStudentBySid(int sid) {
		String sql = "select * from t_student where sid = ?";
		Student student = jdbcTemplate.queryForObject(sql, new StudentRowMapper(), sid);
		return student;
	}

	@Override
	public List<Student> getAllStudents() {
		String sql = "select * from t_student";
		return jdbcTemplate.query(sql, new StudentRowMapper());
	}

}

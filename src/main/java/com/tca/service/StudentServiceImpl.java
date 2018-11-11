package com.tca.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tca.beans.Student;
import com.tca.dao.IStudentDao;

@Service
public class StudentServiceImpl {
	
	@Autowired
	private IStudentDao studentDao;
	
	private static final Logger logger = LoggerFactory.getLogger(StudentServiceImpl.class);
	
	/**
	 * 插入学生
	 * @param student
	 */
	public void insertStudent(Student student) {
		try {
			if (studentDao.insertStudent(student) > 0) {
				logger.info("插入成功!");
				return;
			}
			logger.info("插入失败!");
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("插入失败: " + e);
		}
	}
	
	/**
	 * 根据姓名查询学生数量
	 * @param sname
	 * @return
	 */
	public int countBySname(String sname) {
		try {
			int count = studentDao.countBySname(sname);
			return count;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	/**
	 * 查询所有学生姓名
	 * @return
	 */
	public List<String> queryAllNames() {
		try {
			return studentDao.queryAllNames();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<String>();
	}
	
	/**
	 * 根据sid获取学生
	 * @param sid
	 * @return
	 */
	public Student getStudentBySid(int sid) {
		try {
			return studentDao.getStudentBySid(sid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Student> getAllStudents() {
		try {
			return studentDao.getAllStudents();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<Student>();
	}
}

package com.tca.service;

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
}

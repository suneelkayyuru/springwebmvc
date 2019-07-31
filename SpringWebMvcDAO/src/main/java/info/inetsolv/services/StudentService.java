package info.inetsolv.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.inetsolv.dao.StudentDAO1;
import info.inetsolv.entity.Student;
@Service
public class StudentService {
	@Autowired
	private StudentDAO1 studentDAO;
	
	
	
	public List<Student> findStudentById(Integer sid) {
		return studentDAO.findStudent(sid);
	}

}

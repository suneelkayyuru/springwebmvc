 package info.inetsolv.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import info.inetsolv.entity.Student;
import info.inetsolv.util.MOCException;
@Configuration
public class StudentDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int save(Student student) throws MOCException {
	
		
	
		String sql="insert into student values(?,?,?,?,?,?,?)";
		int records = jdbcTemplate.update(sql, student.getSid(),student.getName(),student.getGender(),student.getAddress(),student.getAge(),student.getCourses(),student.getMobileno());
		
		return records;
		
	}


		
	}
		
	


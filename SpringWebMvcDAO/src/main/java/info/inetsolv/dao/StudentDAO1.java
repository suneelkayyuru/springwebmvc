package info.inetsolv.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import info.inetsolv.entity.Student;

@Configuration
public class StudentDAO1 extends JdbcDaoSupport{
	
	@Autowired
	public StudentDAO1(DataSource dataSource) {
		this.setDataSource(dataSource);
	}
	
public List<Student> findStudent(Integer sid) {
		
		String sql = "select * from student";
		
		if(sid != null) {
			sql += " where sid=?";
		}
		System.out.println("query:"+sql);
		
		return getJdbcTemplate().query(sql,
				new PreparedStatementSetter() {					
					@Override
					public void setValues(PreparedStatement ps) throws SQLException {
						if(sid != null) {
							ps.setInt(1, sid);
						}					
					}
				},
				new RowMapper<Student>() {

					@Override
					public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
						Student student = new Student();
						
						student.setSid(rs.getInt("sid"));
						student.setName(rs.getString("name"));
						student.setGender(rs.getString("gender"));
						student.setAddress(rs.getString("address"));
						student.setAge(rs.getInt("age"));
						student.setCourses(rs.getString("courses"));
						student.setMobileno(rs.getLong("mobileno"));
						
						
						
						return student;
					}
					
				});
	}



}

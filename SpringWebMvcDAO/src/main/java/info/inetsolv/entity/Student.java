package info.inetsolv.entity;

import javax.validation.constraints.NotNull;

public class Student {
	
	private Integer sid;
	private String name;
	private String gender;
	private String address;
	private Integer age;
	private String courses;
	private Long mobileno;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(Integer sid, String name, String gender, String address, Integer age, String courses,
			Long mobileno) {
		super();
		this.sid = sid;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.age = age;
		this.courses = courses;
		this.mobileno = mobileno;
	}

	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

	public Long getMobileno() {
		return mobileno;
	}
	public void setMobileno(Long mobileno) {
		this.mobileno = mobileno;
	}
	
	

}

package info.inetsolv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import info.inetsolv.dao.StudentDAO;
import info.inetsolv.entity.Student;
import info.inetsolv.util.MOCException;

@Controller
@RequestMapping(path="/student")
public class StudentController {
	
	@Autowired
	StudentDAO studentDao;
	
	@RequestMapping(method=RequestMethod.GET)
	public String displayForm(Model model) {
		
		model.addAttribute("student", new Student());
		return "student";
	}
	@RequestMapping(method=RequestMethod.POST)
	public String processForm(Student student,Errors errors) throws MOCException {
		
		studentDao.save(student);
		if(errors.hasErrors()) {
			
			
			
			return "student";
		}else {
			
			System.out.println(student.getSid());
			System.out.println(student.getName());
			
			return "success";
			
		}
		
	}
	}

	
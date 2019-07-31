package info.inetsolv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import info.inetsolv.entity.Student;
import info.inetsolv.services.StudentService;
@Controller
@RequestMapping(path = "/search")
public class StudentSearchController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String displaySearchForm() {
		
		return "search";
	}

	@RequestMapping(value="/searchResult",method = RequestMethod.POST)
	public String displaySearchResults(Integer sid,Model model) {
		List<Student> stuList = studentService.findStudentById(sid);
		model.addAttribute("stuList", stuList);
		return "searchresults";
	}
	
	

}

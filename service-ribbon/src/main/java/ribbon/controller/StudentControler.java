package ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ribbon.server.StudentService;

@RestController
public class StudentControler {

	@Autowired
	StudentService studentService;
	
	@GetMapping("/student")
	public String student(@RequestParam String name) {
		return studentService.student(name);
	}
	
	@RequestMapping("/hello")
	public String name(@RequestParam(value="name", defaultValue="lz") String name) {
		return "hello " + name;
	}
}

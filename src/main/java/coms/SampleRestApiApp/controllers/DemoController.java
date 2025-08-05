package coms.SampleRestApiApp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import coms.SampleRestApiApp.entities.Student;

@RestController
@RequestMapping("/SampleService/")
// http://localhost:9090/SampleService/test
public class DemoController {

	@GetMapping("/test")
	public ResponseEntity<String>  testinfo()
	{
		return new ResponseEntity<String>("Hello World", HttpStatus.OK);
	}
	
	@GetMapping("/demo/{id}")
	public ResponseEntity<String>  testinf(@PathVariable("id") int id)
	{
		String res = "hello world, para meter value : " + id;
		return new ResponseEntity<String>(res, HttpStatus.OK);
	}

	@GetMapping("/stdinfo")
	public ResponseEntity<Student>  getStdinfo()
	{
		Student std = new Student(1001, "Pavan", "Java", 12000.00f);
		return new ResponseEntity<Student>(std, HttpStatus.OK);
	}
}

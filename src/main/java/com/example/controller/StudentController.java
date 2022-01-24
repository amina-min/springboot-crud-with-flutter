package com.example.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.EmployeeModel;
import com.example.model.StudentModel;
import com.example.repository.EmpRepo;
import com.example.repository.StudentRepo;

@RestController
@CrossOrigin(origins = "*")
public class StudentController {

	@Autowired
	private StudentRepo repo;
	
	
//	@GetMapping("/")
//	public ModelAndView index() {
//		
//		Map<String , Object> map = new HashMap<String, Object>(); 		
//		return new ModelAndView("Welcome");
//	}
//	
	
	@PostMapping("/save")
	public Map<String, Object> save(@RequestBody StudentModel model) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			model = repo.save(model);
			map.put("employees", model);
			map.put("status", "Success");
			map.put("message", "Data saved successfully");
		} catch (Exception e) {
			map.put("status", "Failed");
			map.put("message", e.getLocalizedMessage());
		}
		return map;
	}
	
}

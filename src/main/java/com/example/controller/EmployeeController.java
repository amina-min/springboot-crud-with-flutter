package com.example.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.EmployeeModel;
import com.example.repository.EmpRepo;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmpRepo empRepo;
	
	
	@GetMapping("/")
	public ModelAndView index() {
		
		Map<String , Object> map = new HashMap<String, Object>(); 		
		return new ModelAndView("index", "data" , map);
	}
	
	
	@PostMapping("/savaaaaaaaaaae")
	public ModelAndView save(@ModelAttribute EmployeeModel model) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			model = empRepo.save(model);
			map.put("employees", model);
			map.put("status", "Success");
			map.put("message", "Data saved successfully");
		} catch (Exception e) {
			map.put("status", "Failed");
			map.put("message", e.getLocalizedMessage());
		}
		return new ModelAndView("index", "data", map);
	}
	
	
	

	@GetMapping("/show")
	public ModelAndView employeeList() {
		Map<String, Object> map = new HashMap<String, Object>();
		List<EmployeeModel> emp = (List<EmployeeModel>) empRepo.findAll();
		map.put("emp", emp);
		return new ModelAndView("showEmp", "data", map);
	}
	
	@GetMapping("/deleteEmp/{id}")
	public ModelAndView delete(@PathVariable(value = "id") long id) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			EmployeeModel emp =  empRepo.findById(id).get();
			empRepo.delete(emp);
			map.put("message", "Delete successful");
			
		} catch (Exception e) {
			
		}
		return new ModelAndView("showEmp");
	}
	
	
	
	
}

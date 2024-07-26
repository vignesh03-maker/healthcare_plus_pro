package com.healthcare_plus_pro.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.health_plus_pro.entity.Patient;
import com.healthcare_plus_pro.entity.Doctor;
import com.healthcare_plus_pro.service.DoctorService;


@Controller
public class doctorcontroller {
	
	private DoctorService doctorservice;

	@RequestMapping("/new_reg1")
	public String show() {
		
		
		return "doc_reg";
		
	}
	
	@RequestMapping("/savedoctor")
	public String savedoctor(Doctor doctor) {
		
		doctorservice.savedoc(doctor);
		
		return "doc_reg";
	}
	@RequestMapping("/listalldoc")
	public String listalldoc(Doctor doctor, Model model) {
		
		List<Doctor> doctors = doctorservice.listalldoc1(doctor);
		model.addAttribute("doctors", doctors);
		return "list_all_doc";  
		
		
	}
	@RequestMapping("/updatedoc")
	public String updatedoc(@RequestParam("id") long id, Model model ) {
		
		
		
		return "update_pat";
		
		
	}

	}





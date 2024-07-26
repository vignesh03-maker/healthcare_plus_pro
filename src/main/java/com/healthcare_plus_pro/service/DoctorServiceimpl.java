package com.healthcare_plus_pro.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.healthcare_plus_pro.entity.Doctor;
import com.healthcare_plus_pro.repository.DoctorRepository;
@Service
public class DoctorServiceimpl implements DoctorService {

	private DoctorRepository doctorrepo;
	@Override
	public void savedoc(Doctor doctor) {
		
		doctorrepo.save(doctor);
	}
	@Override
	public List<Doctor> listalldoc1(Doctor doctor) {
		List<Doctor> doctors = doctorrepo.findAll();
		return doctors;
	}
	@Override
	public Doctor UpdateOnedoc(long id) {
		Optional<Doctor> findById = doctorrepo.findById(id);
		Doctor doctor1 = findById.get();
		return doctor1;
	}
	
	
	
}

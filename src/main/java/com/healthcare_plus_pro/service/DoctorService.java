package com.healthcare_plus_pro.service;

import java.util.List;

import com.health_plus_pro.entity.Patient;
import com.healthcare_plus_pro.entity.Doctor;

public interface DoctorService {
 public void savedoc(Doctor doctor);
 public List<Doctor> listalldoc1(Doctor doctor);

public  Doctor UpdateOnedoc(long id);
}
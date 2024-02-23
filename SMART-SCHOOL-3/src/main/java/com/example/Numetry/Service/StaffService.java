package com.example.Numetry.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Numetry.Entity.Staff;
import com.example.Numetry.Repository.SatffRepo;


@Service
public class StaffService {

	@Autowired
	private SatffRepo staffRepo;
	
	public List<Staff> getAllSatff(){
		return staffRepo.findAll();		
	}
	
	public Optional<Staff> getById(Long id) {
		return staffRepo.findById(id);	
	}
	
	 public Staff addStaff(Staff staff ) {
		 return staffRepo.save(staff);
	 }
	 
	 public void deleteStaff(Long id) {
		 staffRepo.deleteById(id);
	 }

	 
}

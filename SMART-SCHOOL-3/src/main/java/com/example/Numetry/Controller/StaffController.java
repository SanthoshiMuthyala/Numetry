package com.example.Numetry.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Numetry.Entity.Staff;
import com.example.Numetry.Service.StaffService;


@RestController
@RequestMapping ("/staff")
public class StaffController {
	
	@Autowired
	private StaffService staffSer;
	
	@GetMapping("/users")
	public ResponseEntity<List<Staff>> getAllStaff(){
	 List<Staff> staffs= staffSer.getAllSatff();
	        return new ResponseEntity<>(staffs, HttpStatus.OK);
	}
	
	@GetMapping("/Get/{id}")
	public ResponseEntity<Staff>  getStafftById(@PathVariable Long id){
		Optional<Staff> staff = staffSer.getById(id);
		return staff.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
	                      .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	@PostMapping("/post")
	public ResponseEntity<Staff> addstudent(@RequestBody Staff staff){
		Staff createdstaff= staffSer.addStaff(staff);
		return new ResponseEntity<>(createdstaff, HttpStatus.CREATED);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteStaff(@PathVariable Long id){
		staffSer.deleteStaff(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	 

}




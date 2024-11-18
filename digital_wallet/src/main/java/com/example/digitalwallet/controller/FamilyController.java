package com.example.digitalwallet.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.digitalwallet.model.FamilyMember;
import com.example.digitalwallet.service.FamilyService;

@RestController
@RequestMapping("/digiwallet")
public class FamilyController {
	
	@Autowired
	private FamilyService familyService;
	
	@GetMapping("getbyid/{id}")
	public ResponseEntity<Optional<FamilyMember>> getById(@PathVariable long id){
		Optional<FamilyMember> f= familyService.getById(id);
		return ResponseEntity.status(HttpStatus.OK).body(f);
	}
	@GetMapping("getbyname/{name}")
	public ResponseEntity<FamilyMember> getByName(@PathVariable String name){
		FamilyMember f= familyService.getByName(name);
		return ResponseEntity.status(HttpStatus.OK).body(f);
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<FamilyMember>> getAllMembers(){
		List<FamilyMember> allMembers=familyService.getAllMembers();
		return ResponseEntity.status(HttpStatus.OK).body(allMembers);
	}
	@PostMapping("/addmember")
	public ResponseEntity<FamilyMember> addFamilyMemeber(@RequestBody FamilyMember familyMember ){
		FamilyMember f= familyService.addFamilyMember(familyMember);
		return ResponseEntity.status(HttpStatus.OK).body(f);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteFamilyMemberById(@PathVariable Long id){
		familyService.deleteById(id);
		return ResponseEntity.noContent().build();	
    }
	
	
	
	

}

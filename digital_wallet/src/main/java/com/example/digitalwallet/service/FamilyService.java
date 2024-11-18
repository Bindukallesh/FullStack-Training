package com.example.digitalwallet.service;

import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.digitalwallet.model.FamilyMember;
import com.example.digitalwallet.repository.FamilyRepository;

@Service
public class FamilyService {
	@Autowired
	private FamilyRepository familyRepo;
	
	public FamilyMember addFamilyMember(FamilyMember newFamilyMember) {
		return familyRepo.save(newFamilyMember);
	}
	public Optional<FamilyMember> getById(Long id) {
		return familyRepo.findById(id);
	}
	public List<FamilyMember> getAllMembers(){
		return familyRepo.findAll();
	}
	public void deleteById(Long id) {
	familyRepo.deleteById(id);
	}
	public FamilyMember getByName(String name) {
		return familyRepo.findByName(name);
	}
	public void deleteGovtId(Long id,String govtId) {
		Optional<FamilyMember> familyMemberOp = familyRepo.findById(id);
		if(familyMemberOp.isPresent()) {
			FamilyMember familyMember= familyMemberOp.get();
			familyMember.deleteGovtIdById(govtId);
			familyRepo.save(familyMember);
		}
	}
	public void deleteCard(Long id, String cardnumber) {
		Optional<FamilyMember> familyMemberOp = familyRepo.findById(id);
		if(familyMemberOp.isPresent()) {
			FamilyMember familyMember = familyMemberOp.get();
			familyMember.deleteCardByCardNumber(cardnumber);
			familyRepo.save(familyMember);
			}
		}
	public void deleteInsurance(Long id,String policyNumber) {
		Optional<FamilyMember> familyMemberOp = familyRepo.findById(id);
		if(familyMemberOp.isPresent()) {
			FamilyMember familyMember = familyMemberOp.get();
			familyMember.deleteInsuranceByPolicyNumber(policyNumber);
			familyRepo.save(familyMember);
		}
	}
	public void deleteBankAccount(Long id,String accNumber) {
		Optional<FamilyMember> familyMemberOp = familyRepo.findById(id);
		if(familyMemberOp.isPresent()) {
			FamilyMember familyMember = familyMemberOp.get();
			familyMember.deleteBankAccountByAccNumber(accNumber);
			familyRepo.save(familyMember);
		}
	}

    }

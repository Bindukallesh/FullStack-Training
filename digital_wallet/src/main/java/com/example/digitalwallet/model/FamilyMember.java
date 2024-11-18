package com.example.digitalwallet.model;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class FamilyMember {
@Id
private Long id;
private String name;
private String relation;
private int age;
@ElementCollection
private List<GovtId> govtIds = new ArrayList<>();
@ElementCollection
private List<Insurance> insurances = new ArrayList<>();
@ElementCollection
private List<BankAccount> bankAccounts = new ArrayList<>();
@ElementCollection
private List<Card> cards = new ArrayList<>();

public void deleteGovtIdById(String id) {
	Iterator<GovtId> iter = govtIds.iterator();
	while(iter.hasNext()) {
		GovtId govtId = iter.next();
		if(govtId.getIdNumber()==id) {
			iter.remove();
			break;
		}
	}
}
public void deleteBankAccountByAccNumber(String accno) {
	Iterator<BankAccount> iter = bankAccounts.iterator();
	while(iter.hasNext()) {
		BankAccount bankaccount = iter.next();
		if(bankaccount.getAccNumber()==accno) {
			iter.remove();
			break;
		}
	}
	
}
public void deleteInsuranceByPolicyNumber(String policynumber) {
	Iterator<Insurance> iter = insurances.iterator();
	while(iter.hasNext()) {
		Insurance insurance = iter.next();
		if(insurance.getPolicyNumber()==policynumber) {
			iter.remove();
			break;
		}
	}
}
public void deleteCardByCardNumber(String cardnumber) {
	Iterator<Card> iter = cards.iterator();
	while(iter.hasNext()) {
		Card card = iter.next();
		if(card.getCardNumber()==cardnumber) {
			iter.remove();
			break;
		}
	}
}

}

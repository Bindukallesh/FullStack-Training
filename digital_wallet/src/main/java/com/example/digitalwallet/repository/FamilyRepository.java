package com.example.digitalwallet.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.digitalwallet.model.FamilyMember;


public interface FamilyRepository extends JpaRepository<FamilyMember,Long> {

 FamilyMember findByName(String name);

}

package com.example.digitalwallet.model;





import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class BankAccount {

private String AccNumber;
private String IFSCcode;
private String bankName;



}

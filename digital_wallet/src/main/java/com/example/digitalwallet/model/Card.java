package com.example.digitalwallet.model;

import java.time.LocalDate;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class Card {
	private String cardNumber;
	private String cardType;
	private LocalDate expDate;

}

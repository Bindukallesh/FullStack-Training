package com.example.digitalwallet.model;

import java.time.LocalDate;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Insurance {
private String policyNumber;
private LocalDate maturationDate;
private Long totalSumAssured;
}

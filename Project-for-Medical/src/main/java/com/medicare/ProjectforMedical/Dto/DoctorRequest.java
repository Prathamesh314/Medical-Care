package com.medicare.ProjectforMedical.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DoctorRequest {
    private String name;
    private String image;
    private String speciality;
    private BigDecimal YearsOfExp;

}

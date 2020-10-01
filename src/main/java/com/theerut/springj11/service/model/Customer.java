package com.theerut.springj11.service.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Customer {

    private String customerId;
    private String customerType;
    private String customerCategory;
    private String customerSubCategory;
    private String countryOfCitizenship;
    private String citizenCode;
    private String customerRace;
    private String customerReligion;
    private String customerPreferLanguage;
    private String titleName;
    private String fullName;
    private LocalDate birthDate;
    private String citizenInd;

}

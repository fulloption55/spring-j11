package com.theerut.springj11.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Profile {

    @JsonProperty("title_code")
    private String titleCode;

    @JsonProperty("title_name_th")
    private String titleNameTh;

    @JsonProperty("title_name_en")
    private String titleNameEn;

    @JsonProperty("full_name_th")
    private String fullNameTh;

    @JsonProperty("full_name_en")
    private String fullNameEn;

    @JsonProperty("id_number")
    private String idNumber;

    @JsonProperty("id_type_code")
    private String idTypeCode;

    @JsonProperty("id_country")
    private String idCountry;

    @JsonProperty("date_of_birth")
    private String dateOfBirth;

    @JsonProperty("gender_code")
    private String genderCode;

    @JsonProperty("gender_name")
    private String genderName;

    @JsonProperty("customer_status")
    private String customerStatus;

    @JsonProperty("nationality_code")
    private String nationalityCode;

    @JsonProperty("nationality_name")
    private String nationalityName;

    @JsonProperty("resident_opr_country")
    private String residentOprCtry;

    @JsonProperty("country_sof")
    private String countrySof;

    @JsonProperty("occupation_code")
    private String occupationCode;

    @JsonProperty("occupation_name")
    private String occupationName;

    @JsonProperty("sector_code")
    private String sectorCode;

    @JsonProperty("sector_name")
    private String sectorName;

    @JsonProperty("employer_name")
    private String employerName;

    @JsonProperty("alt_name_title")
    private String altNameTitle;

    @JsonProperty("primary_customer_format_no")
    private String primaryCustomerFormatNumber;

    @JsonProperty("us_person")
    private String usPerson;

    @JsonProperty("non_us_person")
    private String nonUsPerson;

    @JsonProperty("marital_status_code")
    private String maritalStatusCode;

    @JsonProperty("marital_status_name")
    private String maritalStatusName;

    @JsonProperty("email")
    private Contact email;

    @JsonProperty("phone")
    private Contact phone;

    @JsonProperty("mobile")
    private Contact mobile;

    @JsonProperty("office_phone")
    private Contact officePhone;

    @JsonProperty("kyc_statuses")
    private List<KycStatus> kycStatus;

    @JsonProperty("register_address")
    private ProfileAddress registerAddress;

    @JsonProperty("mailing_address")
    private ProfileAddress mailingAddress;

    @JsonProperty("office_address")
    private ProfileAddress officeAddress;
}

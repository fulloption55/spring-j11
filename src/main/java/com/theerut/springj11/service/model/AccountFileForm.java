package com.theerut.springj11.service.model;


import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Builder
@Data
public class AccountFileForm {

    private String userId;
    private String accountId;
    private String referenceId;

    private String purposeName;
    private String productId;
    private String productNameTh;
    private String productNameEn;
    private String accountTypeName;
    private String branchName;

    private String personalId;
    private String titleNameTh;
    private String titleNameEn;
    private String customerNameTh;
    private String customerNameEn;
    private String birthDateBe;
    private LocalDate birthDate;
    private String nationality;
    private String gender;

    private String mobile;
    private String email;

    private String rAddressHomeNumber;
    private String rAddressRoomNumber;
    private String rAddressFloor;
    private String rAddressVillageBuilding;
    private String rAddressMoo;
    private String rAddressSoi;
    private String rAddressRoad;
    private String rAddressSubDistrict;
    private String rAddressDistrict;
    private String rAddressProvince;
    private String rAddressPostCode;
    private String homePhone;

    private String mAddressHomeNumber;
    private String mAddressRoomNumber;
    private String mAddressFloor;
    private String mAddressVillageBuilding;
    private String mAddressMoo;
    private String mAddressSoi;
    private String mAddressRoad;
    private String mAddressSubDistrict;
    private String mAddressDistrict;
    private String mAddressProvince;
    private String mAddressPostCode;

    private String occupationName;
    private String businessTypeName;
    private String companyName;
    private String oAddressHomeNumber;
    private String oAddressRoomNumber;
    private String oAddressFloor;
    private String oAddressVillageBuilding;
    private String oAddressMoo;
    private String oAddressSoi;
    private String oAddressRoad;
    private String oAddressSubDistrict;
    private String oAddressDistrict;
    private String oAddressProvince;
    private String oAddressPostCode;
    private String officePhone;

    private LocalDateTime createdDatetime;
    private int createdDay;
    private String createdMonth;
    private int createdYear;
    private String createdTime;
    private boolean requestDebit;
    private String displayCheckBoxDebit;
}

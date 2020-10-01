package com.theerut.springj11.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ProfileAddress {

    @JsonProperty("sequence_num")
    private Long sequenceNum;

    @JsonProperty("address_format")
    private String addressFormat;

    @JsonProperty("address_type")
    private String addressType;

    @JsonProperty("address_1")
    private String address1;

    @JsonProperty("address_2")
    private String address2;

    @JsonProperty("address_3")
    private String address3;

    @JsonProperty("address_4")
    private String address4;

    @JsonProperty("address_5")
    private String address5;

    @JsonProperty("address_6")
    private String address6;

    @JsonProperty("address_7")
    private String address7;

    @JsonProperty("home_number")
    private String homeNumber;

    @JsonProperty("road")
    private String road;

    @JsonProperty("sub_district")
    private String subDistrict;

    @JsonProperty("sub_district_name_th")
    private String subDistrictNameTh;

    @JsonProperty("district")
    private String district;

    @JsonProperty("district_name_th")
    private String districtNameTh;

    @JsonProperty("state_province")
    private String stateProvince;

    @JsonProperty("state_province_name_th")
    private String stateProvinceNameTh;

    @JsonProperty("city")
    private String city;

    @JsonProperty("country")
    private String country;

    @JsonProperty("postal_code")
    private String postalCode;

    @JsonProperty("last_maintenance_uid")
    private String lastMaintenanceUid;

    @JsonProperty("last_maintenance_time")
    private String lastMaintenanceTime;

    @JsonProperty("suffix_address_indicator")
    private String suffixAddressIndicator;
}

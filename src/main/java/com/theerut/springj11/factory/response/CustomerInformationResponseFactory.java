package com.theerut.springj11.factory.response;

import com.theerut.springj11.client.webservice.accountsummary.EXAMPersonInfoType;
import com.theerut.springj11.service.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CustomerInformationResponseFactory {

    public Customer mapCustomer(EXAMPersonInfoType examPersonInfoTypeType) {

        Customer customer =  new Customer();
        customer.setCustomerId(examPersonInfoTypeType.getCustPermId());
        customer.setBirthDate(examPersonInfoTypeType.getBirthDt());
        customer.setCitizenCode(examPersonInfoTypeType.getEXAMCitizenCode());
        customer.setCitizenInd(examPersonInfoTypeType.getEXAMCitizenInd());
        customer.setCountryOfCitizenship(examPersonInfoTypeType.getEXAMCountryofCitizenship());
        customer.setCustomerCategory(examPersonInfoTypeType.getEXAMCustCategory());
        customer.setCustomerPreferLanguage(examPersonInfoTypeType.getEXAMPrefLang());
        customer.setCustomerRace(examPersonInfoTypeType.getEXAMCustRace());
        customer.setCustomerReligion(examPersonInfoTypeType.getEXAMReligion());
        customer.setCustomerSubCategory(examPersonInfoTypeType.getEXAMCustSubCategory());
        customer.setFullName(examPersonInfoTypeType.getFullName());
        customer.setTitleName(examPersonInfoTypeType.getEXAMTitleName());

        return customer;
    }
}

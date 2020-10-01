package com.theerut.springj11.service;

import com.theerut.springj11.client.RestTestoAddressClient;
import com.theerut.springj11.client.response.AddressListResponse;
import com.theerut.springj11.client.response.TestoGetAddressResponse;
import com.theerut.springj11.exception.TestoAddressException;
import com.theerut.springj11.service.base.TestoBaseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.theerut.springj11.constant.ResponseMapEnum.GENERAL_ERROR;

@Slf4j
@Service
@RequiredArgsConstructor
public class TestoAddressService {
    private final RestTestoAddressClient restTestoAddressClient;
    private final TestoBaseService TestoBaseService;

    private static final String TELLER_ID = "MOBILE";
    private static final String RESPONSE_SUCCESS_CODE = "AA";
    private static final String MAILING_ADDRESS_TYPE = "T";

    public List<AddressListResponse> getAddress(String cif) throws TestoAddressException {
        final String transaction = TestoBaseService.generateTransactionId();
        log.info("Start to get Address");

        final ResponseEntity<TestoGetAddressResponse> response = restTestoAddressClient.getAddress(cif, TELLER_ID,transaction);

        if(response == null || response.getBody() == null || !response.getBody().getResponseCode().equals(RESPONSE_SUCCESS_CODE)){
            log.info("Get Address Fail");
            throw new TestoAddressException(GENERAL_ERROR.getText());
        }

        return response.getBody().getAddressList();
    }

    public Integer getAddressSequenceId(String cif) throws TestoAddressException {
        List<AddressListResponse> addressList = getAddress(cif);
        Optional<AddressListResponse> mailingAddress =  addressList.stream()
                .filter(address -> address.getAddressType().equals(MAILING_ADDRESS_TYPE))
                .findFirst();

        return mailingAddress.isPresent()?
                mailingAddress.get().getAddressSequence() : 1;
    }
}

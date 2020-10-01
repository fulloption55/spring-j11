package com.theerut.springj11.factory.response;

import com.theerut.springj11.constant.ResponseMapEnum;
import com.theerut.springj11.controller.response.GeneralResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ResponseFactory {

    public <T> ResponseEntity<GeneralResponse<T>> success() {
        GeneralResponse<T> responseObject = new GeneralResponse<>();
        responseObject.setCode(ResponseMapEnum.SUCCESS.getText());
        return ResponseEntity.ok(responseObject);
    }

    public <T> ResponseEntity<GeneralResponse<T>> success(T data) {
        GeneralResponse<T> responseObject = new GeneralResponse<>();
        responseObject.setCode(ResponseMapEnum.SUCCESS.getText());
        responseObject.setData(data);
        return ResponseEntity.ok(responseObject);
    }

    public <T> ResponseEntity<GeneralResponse<T>> error(HttpStatus httpStatus, String errorCode) {
        GeneralResponse<T> responseObject = new GeneralResponse<>();
        responseObject.setCode(errorCode);

        return ResponseEntity.status(httpStatus).body(responseObject);
    }

    public <T> ResponseEntity<GeneralResponse<T>> error(HttpStatus httpStatus, String errorCode, T data) {
        GeneralResponse<T> responseObject = new GeneralResponse<>();
        responseObject.setCode(errorCode);
        responseObject.setData(data);
        return ResponseEntity.status(httpStatus).body(responseObject);
    }

}

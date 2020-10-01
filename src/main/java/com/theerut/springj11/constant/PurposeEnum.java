package com.theerut.springj11.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum PurposeEnum {
    SAVING("01", "Saving Account", "บัญชีออมเงิน"),
    SALARY("04", "Salary Account", "บัญชีเงินเดือน"),
    LOAN("05", "Receiving/Loan Account", "บัญชีรับ / ชำระเงินกู้ยืม"),
    BUSINESS("02", "Business Account", "บัญชีลงทุนในธุรกิจ"),
    BILL("03", "Billing Account", "บัญชีชำระค่าสินค้าและบริการ");

    private final String id;
    private final String text;
    private final String description;

    private static Map<String, PurposeEnum> map = new HashMap<>();

    static {
        for (PurposeEnum purposeEnum : PurposeEnum.values()) {
            map.put(purposeEnum.id, purposeEnum);
        }
    }

    public static PurposeEnum getEnum(String purposeId) {
        return map.get(purposeId);
    }

}

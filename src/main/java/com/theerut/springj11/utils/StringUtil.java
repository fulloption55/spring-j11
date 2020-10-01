package com.theerut.springj11.utils;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class StringUtil {

    private StringUtil() {

    }

    public static String formatterAccountId(String accountId) throws ParseException {
        final MaskFormatter formatter = new MaskFormatter("AA AAAAAA AA");
        formatter.setValueContainsLiteralCharacters(false);
        return formatter.valueToString(accountId);
    }
    
}

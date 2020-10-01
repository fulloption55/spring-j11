package com.theerut.springj11.utils;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateAdapter extends XmlAdapter<String, LocalDate> {
    private final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    @Override
    public LocalDate unmarshal(String dateStr) {
        if (dateStr != null) {
            return LocalDate.parse(dateStr, DATE_FORMATTER);
        }
        return null;
    }

    @Override
    public String marshal(LocalDate dateStr) {
        if (dateStr != null) {
            return dateStr.format(DATE_FORMATTER);
        } else {
            return null;
        }
    }


}

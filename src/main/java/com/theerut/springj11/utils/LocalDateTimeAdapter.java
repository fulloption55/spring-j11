package com.theerut.springj11.utils;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeAdapter extends XmlAdapter<String, LocalDateTime> {
    private final DateTimeFormatter ZONED_DATETIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSS");

    @Override
    public LocalDateTime unmarshal(String dateTimeStr) {
        if (dateTimeStr != null) {
            return LocalDateTime.parse(dateTimeStr, ZONED_DATETIME_FORMATTER);
        }
        return null;
    }

    @Override
    public String marshal(LocalDateTime dateTime) {
        if (dateTime != null) {
            return dateTime.format(ZONED_DATETIME_FORMATTER);
        } else {
            return null;
        }
    }
}
